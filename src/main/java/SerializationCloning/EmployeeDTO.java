package SerializationCloning;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String empID;
	private String name;
	private String designation;
	transient private int jobLevel;
	private Address addr;
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getJobLevel() {
		return jobLevel;
	}
	public void setJobLevel(int jobLevel) {
		this.jobLevel = jobLevel;
	}
	
	public EmployeeDTO(String empID, String name, String designation, int jobLevel) {
		super();
		this.empID = empID;
		this.name = name;
		this.designation = designation;
		this.jobLevel = jobLevel;
	}
	
	public EmployeeDTO(String empID, String name, String designation, int jobLevel, Address addr) {
		super();
		this.empID = empID;
		this.name = name;
		this.designation = designation;
		this.jobLevel = jobLevel;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "EmployeeDTO [empID=" + empID + ", name=" + name + ", designation=" + designation + ", jobLevel="
				+ jobLevel + "]";
	}	

}
