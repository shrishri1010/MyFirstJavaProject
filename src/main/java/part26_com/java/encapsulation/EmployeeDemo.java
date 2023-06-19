package part26_com.java.encapsulation;
class Employee123{
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

class EmployeeDemo {
	public static void main(String[] args) {
		Employee123 e1 = new Employee123();
		e1.setEmpId(3);
		e1.setEmpName("navin");
		
		System.out.println("empId is ---" + e1.getEmpId());
		System.out.println("emp name is ---" + e1.getEmpName());
		
		Employee e2 = new Employee();
		e2.setEmpId(5);
		e2.setEmpName("rizwan");;
		System.out.println("empId is ---" +e2.getEmpId());
		System.out.println("emp name is --- " +e2.getEmpName());
	}
}



