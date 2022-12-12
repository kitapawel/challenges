package SerializationCloning;

public class EmployeeCloningTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee(1002, "John", new Department ("ETA"));

		//This will be reference to the same object
		//Employee emp2 = emp1;
		
		Employee emp2 = Employee.copyEmployee(emp1);
		
		System.out.println("Employee name before change");
		System.out.println(emp1.getEmpName());
		System.out.println(emp2.getEmpName());
		
		emp2.setEmpName("Robert");		
		
		System.out.println("Employee name after change");
		System.out.println(emp1.getEmpName());
		System.out.println(emp2.getEmpName());
		
		emp2.getDept().setDeptName("HR");
		
		System.out.println("Department name after change");
		System.out.println(emp1.getEmpName());
		System.out.println(emp2.getEmpName());
	}

}