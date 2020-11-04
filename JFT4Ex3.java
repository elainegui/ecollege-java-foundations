package eCollegeJava;

public class JFT4Ex3 {
	public static void main(String[] args) {
		// salary report
		String employeeName = "Bryan Haynes";
		String PPSNo = "6464514D";
		String department = "IT";
		double hoursWorkedBasic = 50.5;
		double hoursWorkedOvertime = 13.5;
		double hourlyRateBasic = 29.35;
		double hourlyRateOvertime = hourlyRateBasic * 1.5;
		System.out.println(hourlyRateOvertime);
		double grossPay = (hoursWorkedBasic * hourlyRateBasic) + (hoursWorkedOvertime * hourlyRateOvertime);
		double incomeTaxPayable = 0.35;
		double netPay = grossPay - (grossPay * incomeTaxPayable);

		System.out.println("hi");

		System.out.println("********************Salary Report********************");
		System.out.println("Employee name: " + employeeName);
		System.out.println("Employee PPS No: " + PPSNo);
		System.out.println("Employee Department: " + department + "\n");
		System.out.println("********************Hours Worked*********************");
		System.out.println("No of basic hours worked: " + hoursWorkedBasic);
		System.out.println("The hourly rate of basic pay is at " + hourlyRateBasic + " euro");
		System.out.println("Basic salary: " + hoursWorkedBasic * hourlyRateBasic);
		System.out.println("No. of overtime hours worked: " + hoursWorkedOvertime);
		String outputHourlyRate = "";
		if ((hourlyRateOvertime / hourlyRateBasic) == 1.5) {
			outputHourlyRate = "a time and a half";
		}
		System.out.println("The hourly rate of ovetime pay is at " + outputHourlyRate);
		System.out.println("Overtime salary: " + hoursWorkedOvertime * hourlyRateOvertime + "\n");

		System.out.println("********************Take Home Pay********************");
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("Income Tax Payable at: " + incomeTaxPayable + " is " + grossPay * incomeTaxPayable);
		System.out.println("Net Pay: " + netPay);
	}

}
