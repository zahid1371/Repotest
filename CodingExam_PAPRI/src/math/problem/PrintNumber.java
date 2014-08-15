package math.problem;

public class PrintNumber {

	/**
	 * Please solve the following problem in java code.
	 */
	public static void main(String[] args) {

		/*
		 * use a for loop to print 1 to 100 and then store into an array.then
		 * use another for loop to print only odd numbers.Then add thetotal
		 * numbers from the array.
		 */

		int limit = 100;

		// Print numbers 1 to 100
		System.out.println("Print numbers 1 to 100: ");
		for (int i = 1; i <= limit; i++) {
			System.out.print(i + " ");
		}

		// Print only odd numbers from array
		int a[] = new int[limit];
		int y = 1;
		int sum = 0;

		System.out.println("\n\n" + "Print only odd numbers from array:");
		for (int z = 0; z < a.length; z++) {
			a[z] = y;
			if (!(a[z] % 2 == 0)) {
				System.out.print(a[z] + " ");
			}
			sum += a[z]; // add the total numbers from array
			y++;
		}

		System.out.println("\n\n"
				+ "The sum of total numbers (1 to 100) in the array: " + sum);

	} // main end
} // class end

