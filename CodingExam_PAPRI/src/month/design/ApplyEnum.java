package month.design;

public class ApplyEnum {

	/**
	 * Please design the following Feature in java.
	 */
	public static void main(String[] args) {
		/*
		 * Create an Enum called Month,then create a class to use that Month
		 * Enum where you will implement a method using switch...case. Once the
		 * whole use able process is done, create an object in this main method
		 * to demonstrate the Enum feature in java.
		 */
		System.out.println("National Holydays in USA in 2014"
				+ "\n................................");
		UseEnum myDuty1 = new UseEnum(Month.JANUARY);
		UseEnum myDuty2 = new UseEnum(Month.FEBRUARY);
		UseEnum myDuty3 = new UseEnum(Month.MARCH);
		UseEnum myDuty4 = new UseEnum(Month.APRIL);
		UseEnum myDuty5 = new UseEnum(Month.MAY);
		UseEnum myDuty6 = new UseEnum(Month.JUNE);
		UseEnum myDuty7 = new UseEnum(Month.JULY);
		UseEnum myDuty8 = new UseEnum(Month.AUGUST);
		UseEnum myDuty9 = new UseEnum(Month.SEPTEMBER);
		UseEnum myDuty10 = new UseEnum(Month.OCTOBER);
		UseEnum myDuty11 = new UseEnum(Month.NOVEMBER);
		UseEnum myDuty12 = new UseEnum(Month.DECEMBER);
		UseEnum myDuty13 = new UseEnum(Month.NOMONTH);

		myDuty1.occasion_In_Month();
		myDuty2.occasion_In_Month();
		myDuty3.occasion_In_Month();
		myDuty4.occasion_In_Month();
		myDuty5.occasion_In_Month();
		myDuty6.occasion_In_Month();
		myDuty7.occasion_In_Month();
		myDuty8.occasion_In_Month();
		myDuty9.occasion_In_Month();
		myDuty10.occasion_In_Month();
		myDuty11.occasion_In_Month();
		myDuty12.occasion_In_Month();
		myDuty13.occasion_In_Month();

	}

}
