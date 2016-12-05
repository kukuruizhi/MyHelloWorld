package src.serialClone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class SerialCloneTest {

	public static void main(String[] args) {
		Employee harry = new Employee("Harry Hacker" , 35000,1989,10,1);
		Employee harry2 = (Employee) harry.clone();
		Employee harry3 = harry;
		
		harry.raiseSalary(10);
		harry.addHireDate();
		System.out.println(harry);
		System.out.println(harry2);
		System.out.println(harry3);
		
	}

}

class SerialCloneable implements Cloneable, Serializable{
	public Object clone(){
		try{
			ByteArrayOutputStream boot = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(boot);
			out.writeObject(this);
			out.close();
			
			ByteArrayInputStream bin = new ByteArrayInputStream(boot.toByteArray());
			ObjectInputStream in = new ObjectInputStream(bin);
			Object ret = in.readObject();
			in.close();
			
			return ret;
		}catch (Exception e){
			return null;
		}
	}
}

class Employee extends SerialCloneable {
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n,double s, int yesr, int month, int day){
		name = n;
		salary = s;
		GregorianCalendar cal = new GregorianCalendar(yesr , month-1,day);
		hireDay = cal.getTime();
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent /100;
		salary += raise;
	}
	
	public void addHireDate(){
		GregorianCalendar cal = new GregorianCalendar(hireDay.getYear(),hireDay.getMonth(),hireDay.getDay());
		cal.add(GregorianCalendar.MONTH, 2);
		hireDay = cal.getTime(); 
	}
	
	public String toString(){
		return this.getClass().getName() +"{name=" + name +",salary=" +salary+",hireDay="+hireDay+"]";
	}
}
