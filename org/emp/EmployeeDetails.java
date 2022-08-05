package org.emp;

public class EmployeeDetails {

	public void EmployeeId(int id) {
		System.out.println("employee id is" + id);
	}

	public void EmployeeName(String name) {

		System.out.println("employee name is" + name);

	}

	public static void main(String[] args) {

    EmployeeDetails e = new EmployeeDetails();
    e.EmployeeId(1234);
    e.EmployeeName("vinod");
	}

}
