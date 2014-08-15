package random.number;

import java.util.Random;

public class RandomNumberManipulation {

	/**
	 * Please solve the following problem in java code.
	 */
	public static void main(String[] args) {
		/*
		 * Declare an array to store 50 random numbers range from 1 to 500. Then
		 * find the even numbers only to print to the console. Hints: use
		 * Random() class.
		 */
		Random r = new Random();
		int arr[] = new int[50];

		System.out
				.println("Print only even numbers from random numbers (range 1 to 500) are as follow:");
		for (int i = 0; i < arr.length; i++) {
			// random numbers from 1 to 500:
			arr[i] = r.nextInt(500) + 1;

			// System.out.print(arr[i] + " ");

			if ((arr[i] % 2) == 0) {

				System.out.print(arr[i] + " ");
			}
		}

	}

}