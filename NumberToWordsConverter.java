package com.virtusa.code.puzzle;

/**
 * 
 * @author tirupathaiah_salla
 *
 * Service for converting number to equivalent string in British English words
 *
 */
public class NumberToWordsConverter {

	private static final String[] units = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"Nineteen" };

	private static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	/**
	 * Convert Number to String
	 * 
	 * @param number
	 * @return
	 */
	public static String convertNumToString(final int num) {
		if (num < 0) {
			return "minus " + convertNumToString(-num);
		}

		if (num < 20) {
			return units[num];
		}

		if (num < 100) {
			return tens[num / 10] + ((num % 10 != 0) ? " " : "") + units[num % 10];
		}

		if (num < 1000) {
			return units[num / 100] + " hundred" + ((num % 100 != 0) ? " and " : "") + convertNumToString(num % 100);
		}

		if (num < 100000) {
			return convertNumToString(num / 1000) + " thousand" + ((num % 10000 != 0) ? " " : "")
					+ convertNumToString(num % 1000);
		}

		if (num < 10000000) {
			return convertNumToString(num / 100000) + " lakh" + ((num % 100000 != 0) ? " " : "")
					+ convertNumToString(num % 100000);
		}

		return convertNumToString(num / 10000000) + " million" + ((num % 10000000 != 0) ? " " : "")
				+ convertNumToString(num % 10000000);
	}

}
