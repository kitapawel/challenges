package SerializationCloning;

public class Employee {
	private int empId;
	private String empName;
	private Department dept;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}
	
	public static Employee copyEmployee(Employee emp) {
		Employee obj = new Employee();
		obj.setEmpId(emp.getEmpId());
		obj.setEmpName(emp.getEmpName());
		obj.setDept(emp.getDept());		
		return obj;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	
}

class Department {
	private String deptName;
	
	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}
	
	public String getDeptName() {
		return deptName;		
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
