package part26_com.java.encapsulation;

class Employee {
	private int empId;
	private String empName;
	
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
}
class EmployeeDemo1{
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(1010);
		System.out.println("emp id is " +e.getEmpId());
		e.setEmpName("maxim");
		System.out.println("emp name is "+e.getEmpName());
	}
}
