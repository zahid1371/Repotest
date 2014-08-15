package employee.info.duties;

public class EmployeeSalaries extends EmployeeDuties {

	public double calculation(int hr, double payRate) {

		double overTimePay = 0.0;
		overTimePay = hr * (payRate * 1.5);
		return overTimePay;
	}
}
