package math.problem;

public class FindPrimeNumbers {

	/**
	 * Please do the flowing problem.
	 */
	public static void main(String[] args) {

		/*
		 * Find the prime numbers from 1 to 1000 then print to console. (prime
		 * numbers are only divisible by number 1 and the number itself.) (for
		 * example numbers like 2,3,5,7,9,11,13.....n are prime numbers.
		 */

		int limit = 1000;
		System.out
				.println("Prime numbers are only divisible by number 1 and the number itself!!!");
		System.out.println("Prime numbers between 1 and " + limit
				+ " are as follow:" + "\n");
		int count = 0;
		// loop through the numbers one by one

		for (int x = 1; x < limit; x++) {
			boolean isPrimeNumber = true;

			// check to see if the number is prime

			for (int y = 2; y < x; y++) {

				if (x % y == 0) {
					isPrimeNumber = false;
					break; // exit the inner for loop
				}
			}
			// print the number if prime
			if (isPrimeNumber) {
				System.out.print(x + " ");
				count++;

			}
		} // exit the outer for loop

		System.out.println("\n\n" + "Total prime numbers are generated: "
				+ count);

	}
}
