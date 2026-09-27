package OOP;

public class EmpDriver {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee(1985, 45, 2000, "Kemal");
		System.out.println("Tax: " + emp1.tax());
		System.out.println("Bonus: " + emp1.bonus());
		System.out.println("Raise of Salary: " + emp1.increase());
		
		double totalSalary = emp1.salary - emp1.tax() + emp1.bonus();
		System.out.println("Salary with tax and bonus: " + totalSalary);
		
		System.out.println("Total salary with the raise of salary: " + (emp1.salary + emp1.increase()));
		
		
		

	}

}
