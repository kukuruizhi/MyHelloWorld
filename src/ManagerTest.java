package src;

public class ManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager boss = new Manager("Carl Craker", 80000,1987,12,15);
		boss.setBouns(5000);
		
		EmployeeP[] staff = new EmployeeP[3];
		staff[0] = boss;
		staff[1] = new EmployeeP("Tome", 50000,1989,10,1);
		staff[2] = new EmployeeP("Jerry", 40000,1990,3,15);
		for (EmployeeP EmployeeP : staff) {
			System.out.println("name="+EmployeeP.getName() +" salary=" + EmployeeP.getSalary());
		}
		
		
	}
}
