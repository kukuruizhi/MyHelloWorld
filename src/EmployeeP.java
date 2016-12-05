package src;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeP {
	private String name;
	private double salary;
	private Date hireDay;
	
	public EmployeeP(String n,double s, int yesr, int month, int day){
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
}
