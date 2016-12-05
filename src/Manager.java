package src;

public class Manager extends EmployeeP{

	private double bonus;
	
	public Manager(String n, double s, int yesr, int month, int day) {
		super(n, s, yesr, month, day);
		bonus =0;
	}

	public double getSalary(){
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	
	public void setBouns(double b){
		bonus = b;
	}
}
