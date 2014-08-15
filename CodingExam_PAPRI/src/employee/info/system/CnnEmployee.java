package employee.info.system;

import employee.info.duties.*;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create
	 * Object from EmployeeInfo class to use fields and attributes.Demonstrate
	 * as many methods as possible to use with proper business work flow.Think
	 * as a Software Architect, Product Designer and as a Software
	 * Developer.(employee.info.system) package is given as an outline,you need
	 * to elaborate more to design an application that will meet for fortune 500
	 * Employee Information Services.
	 * 
	 * @param salary
	 * 
	 **/
	public static void main(String[] args) {

		EmployeeInfo empinfo = new EmployeeInfo();
		EmployeeInfo emp1 = new EmployeeInfo("Papri Barua", 007);
		EmployeeInfo emp2 = new EmployeeInfo("Mousumi Mozahar", 8);
		EmployeeInfo emp3 = new EmployeeInfo("Fatima Terin", 6);
		Employee emp4 = new EmployeeInfo("Prithul Sona");
		EmployeeType emp5 = new EmployeeInfo();
		EmployeeInfo emp6 = new EmployeeInfo(1);

		// objects are created from class employeeDuties in employee.info.system
		// package
		EmployeeDuties empDuties1 = new EmployeeDuties();
		EmployeeDuties empDuties2 = new EmployeeDuties();
		EmployeeDuties empDuties3 = new EmployeeDuties();

		EmployeeDuties empDuties4 = new EmployeeSalaries();

		EmployeeSalaries empSal = new EmployeeSalaries();

		// static variable implemented
		EmployeeInfo.companyName = "CNN Centre";
		System.out.println("Company Name: " + EmployeeInfo.companyName);
		EmployeeInfo.address = "Atlanta, GA 30348 USA";
		System.out.println("Company Address: " + EmployeeInfo.address);
		System.out.println("..........................................");

		System.out.println("\nName: " + emp4.employeeName());
		((EmployeeInfo) emp4).setDesignation("CEO");
		System.out.println("Designation: "
				+ ((EmployeeInfo) emp4).getDesignation());
		System.out.println("Salary: $" + emp4.calculateSalary(15) + " Million");

		System.out.println("\nEmployee ID: " + emp1.employeeId());
		System.out.println("Name: " + emp1.employeeName());
		emp1.assignDepartment("Sattelite Integration System");
		emp1.setDesignation("System Analyst");
		System.out.println("Designation: " + emp1.getDesignation());
		empDuties1
				.getDuties("Satellite Systems Analysis, Design, and Development\n");
		emp1.partTime();
		emp1.email("barua.papri@gmail.com");
		emp1.contactNo(2679942516L);
		System.out.println("Salary: " + emp1.calculateSalary(70000) + "k");
		emp1.benefitLayout("Medical, SickPay");
		System.out.println("Yearly Bonus: "
				+ EmployeeInfo.calculateEmployeBonus(70000, 0.1)
				+ "-------Best Performance");
		System.out.println("Employee Pension: "
				+ EmployeeInfo.calculateEmployePension(70000, 1)
				+ "-------1 Year employment");

		System.out.println("\n\nEmployee ID: " + emp2.employeeId());
		System.out.println("Name: " + emp2.employeeName());
		emp2.assignDepartment("Central News Room");
		emp2.setDesignation("Business Analyst");
		System.out.println("Designation: " + emp2.getDesignation());
		empDuties2
				.getDuties("Analyze, Design and Assessing business process, system and model respectively\n");
		emp2.fullTime();
		emp2.email("mousumi2850@gmail.com");
		emp2.contactNo(9176075450L);
		System.out.println("Salary: " + emp2.calculateSalary(120000) + "k");
		System.out.println("Overtime payment received for this month: $"
				+ empDuties4.calculation(4, 57.7));
		emp2.benefitLayout("Medical, 401k, SickPay, HolydayPay, VacationPay, LifeInsurance");
		System.out.println("Yearly Bonus: "
				+ EmployeeInfo.calculateEmployeBonus(120000, 0.1)
				+ "-------Best Performance");
		System.out.println("Employee Pension: "
				+ EmployeeInfo.calculateEmployePension(120000, 3)
				+ "-------3 Years employment");

		System.out.println("\n\nEmployee ID: " + emp3.employeeId());
		System.out.println("Name: " + emp3.employeeName());
		emp3.assignDepartment("IT Support");
		emp3.setDesignation("Software Test Engineer");
		System.out.println("Designation: " + emp3.getDesignation());
		empDuties3
				.getDuties("Automate the execution of regression, integration, system and performance tests according to test specifications\n");
		emp3.fullTime();
		emp3.email("fatima.terin@gmail.com");
		emp3.contactNo(7202522040L);
		System.out.println("Salary: " + emp3.calculateSalary(105000) + "k");
		System.out.println("Overtime payment received for this month: $"
				+ empSal.calculation(5, 50.48));
		emp3.benefitLayout("Medical, SickPay, HolydayPay, VacationPay");
		System.out.println("Yearly Bonus: "
				+ EmployeeInfo.calculateEmployeBonus(105000, 0.1)
				+ "-------Best Performance");
		System.out.println("Employee Pension: "
				+ EmployeeInfo.calculateEmployePension(105000, 2)
				+ "-------2 Years employment");

		System.out.println("\nClassified Employee");
		emp5.email("midnight_bloom@yahoo.com");
		emp5.contactNo(1010101010L);
		emp5.fullTime();

		System.out.println("\nEmployee ID: " + emp6.employeeId()
				+ "-----No longer with CNN");

		System.out.println("\nNotice!!!");
		System.out.println(".........");
		// static method and final field implemented
		EmployeeInfo.holyDay();

		empinfo.printNotice();
		// private variable
		// empinfo.ssn;
	}

}
