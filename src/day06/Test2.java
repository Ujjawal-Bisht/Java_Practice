package day06;

public class Test2 {
	int empId; 
	String empName ;
	public Test2(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Test2 [empId=" + empId + ", empName=" + empName + "]";
	}
}
