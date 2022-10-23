package org.sample;

public class EmployeeDetails {

	private void empId() {
		System.out.println("Empid is: 12");
	}
	private void empName() {
		System.out.println("Employee name is: Prabha");
	}
	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.empId();
		e.empName();
	}
}
