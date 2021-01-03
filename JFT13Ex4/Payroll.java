package eCollegeJava.JFT13Ex4;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
		String empNameEntered = sc.nextLine();
		emp1.setName(empNameEntered);
		System.out.print("Enter Employee PPS No: ");
		String empPpsEntered = sc.next();
		emp1.setPPSNo(empPpsEntered);
		System.out.print("Enter Employee Department: ");
		String empDepartmentEntered = sc.next();
		emp1.setDepartment(empDepartmentEntered);
		System.out.print("Enter Basic Hours Worked: ");
		double empBHoursEntered = sc.nextDouble();
		System.out.print("Enter Overtime Hours Worked: ");
		double empOvertimeHoursEntered = sc.nextDouble();
		double totalHoursWorked = empBHoursEntered + empOvertimeHoursEntered;

		System.out.println("\n" + "**************Salary Report*****************\n");
		System.out.println("**************Employee Details**************");
		System.out.println("Employee Name: " + emp1.getName());
		System.out.println("Enter Employee PPS No: " + emp1.getPPSNo());
		System.out.println("Employee Department: " + emp1.getDepartment());
		System.out.println("\n" + "**************Hours Worked******************");
		System.out.println("No of basic hours worked: " + empBHoursEntered);
		double hourlyRate = 29.39;
		System.out.println("The hourly rate of basic pay is at " + hourlyRate + " euro.");
		System.out.printf("Basic salary: %.2f\n", (hourlyRate * empBHoursEntered));
		System.out.println("No of overtime hours worked: " + empOvertimeHoursEntered);
		System.out.println("The hourly rate of overtime pay is at time and a half.");

		//This will print 220.43
		//System.out.printf("Overtime salary: %.2f", (hourlyRate * 1.5 * empOvertimeHoursEntered));

		DecimalFormat dFormat = new DecimalFormat();
		//This will print 220.425
		//System.out.println("Overtime salary: " + dFormat.format(hourlyRate * 1.5 * empOvertimeHoursEntered));

		dFormat.applyPattern(".00");
		dFormat.setRoundingMode(RoundingMode.DOWN);
		System.out.println("Overtime salary: " + dFormat.format(hourlyRate * 1.5 * empOvertimeHoursEntered));

	}

}
