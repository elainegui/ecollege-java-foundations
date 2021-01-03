package eCollegeJava.JFT13Ex4;

public class Employee {

	String name;
	String PPSNo;
	String department;
	double hoursWorked;

	public Employee() {}

	public Employee(String name, String pPSNo, String department, double hoursWorked) {
		super();
		this.name = name;
		PPSNo = pPSNo;
		this.department = department;
		this.hoursWorked = hoursWorked;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPPSNo() {
		return PPSNo;
	}

	public void setPPSNo(String pPSNo) {
		PPSNo = pPSNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}
