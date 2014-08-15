package month.design;

public class UseEnum {

	Month month;

	public UseEnum(Month month) {
		this.month = month;
	}

	public void occasion_In_Month() {
		switch (month) {

		case JANUARY:
			System.out.println("January 1: New Year's Day"
					+ "\nJanuary 20: Martin Luther King Day");
			break;

		case FEBRUARY:
			System.out
					.println("\nFebruary 17: Presidents' Day (Washington's Birthday)");
			break;

		case MARCH:
			System.out.println("\nMarch: No National Holyday");
			break;

		case APRIL:
			System.out.println("\nApril: No National Holyday");
			break;

		case MAY:
			System.out.println("\nMay 26: Memorial Day");
			break;

		case JUNE:
			System.out.println("\nJune: No National Holyday");
			break;

		case JULY:
			System.out.println("\nJuly 4: Independence Day of USA");
			break;

		case AUGUST:
			System.out.println("\nAugust: No National Holyday");
			break;

		case SEPTEMBER:
			System.out.println("\nSeptember 1: Labor Day");
			break;

		case OCTOBER:
			System.out.println("\nOctober 13: Columbus Day");
			break;

		case NOVEMBER:
			System.out.println("\nNovember 11: Veterans Day"
					+ "\nNovember 27:Thanksgiving Day");
			break;

		case DECEMBER:
			System.out.println("\nDecember 25: Christmas Day");
			break;

		default:
			System.out.println("\nInvalid Month!!!");
			break;
		}
	}
}
