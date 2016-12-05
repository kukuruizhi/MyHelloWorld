package src;

import java.util.Random;

public class ConstructorTest {

	public static void main(String[] args) {
		EmployeeC[] staff = new EmployeeC[3];
		staff[0] = new EmployeeC("Tom", 40000);
		staff[1] = new EmployeeC(60000);
		staff[2] = new EmployeeC();
		
		for (EmployeeC EmployeeC : staff) {
			EmployeeC.setId();
			System.out.println("name="+EmployeeC.getName() +" id=" + EmployeeC.getId()+" salary=" + EmployeeC.getSalary());
		}
	}
	
}

class EmployeeC
{
	private static int nextId = 1;
	private String name;
	private double salary;
	private int id;
	
	static{
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}
	
	{
		id = nextId;
		nextId ++;
	}
	
	public EmployeeC(String n,double s){
		name = n;
		salary = s;
		id = 0;
	} 
	
	public EmployeeC(double s){
		this("Employee # "+ nextId,s);
	}
	
	
	public EmployeeC(){
		
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = nextId;
		nextId ++;
	}
}