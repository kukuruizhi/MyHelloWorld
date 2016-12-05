package src;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Tom", 40000);
		staff[1] = new Employee("Jerry", 60000);
		staff[2] = new Employee("Dirk", 80000);
		
		for (Employee employee : staff) {
			employee.setId();
			System.out.println("name="+employee.getName() +" id=" + employee.getId()+" salary=" + employee.getSalary());
		}
		int n = Employee.getNextId();
		System.out.println("Next available Id: "+ n);
	}

}

class Employee
{
	private static int nextId = 1;
	private String name;
	private double salary;
	private int id;
	
	public Employee(String n,double s){
		name = n;
		salary = s;
		id = 0;
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
	public static int getNextId(){
		return nextId;
	}
	public static void main(String[] args){
		Employee e = new Employee("Harry" , 5000);
		System.out.println(e.getName()+" "+e.getSalary());
	}
}