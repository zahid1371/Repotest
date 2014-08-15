package text.reader;

import java.io.IOException;

public class DataReader {

	/**
	 * This class contains a main method which will be able to read a file.
	 */
	public static void main(String[] args) {
		/*
		 * Use java API to read a file from external sources(can be a text file
		 * in your documents folder) You must use Try...catch and finally block.
		 * You must use while loop.Use String array for extra credit.
		 */

		ReadFile rf = new ReadFile();

		// The text file location of your choice
		// String filename =
		// "C:/Users/Prithul/myworkspace/CodingExam/src/text/reader/Hello.txt";
		String filename = "C:/Users/Prithul/myworkspace/CodingExam/src/text/reader/ClosedPath.txt";

		try {
			String[] lines = rf.readLines(filename);

			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// Print out the exception that occurred
			System.out.println("Unable to create " + filename + ": "
					+ e.getMessage());
		}

	}

}
