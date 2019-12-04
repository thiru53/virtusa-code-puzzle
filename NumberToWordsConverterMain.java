package com.virtusa.code.puzzle;

public class NumberToWordsConverterMain {

	public static void main(String[] args) {

		int num = -9;
		System.out.println(num + " = " + NumberToWordsConverter.convertNumToString(num));

		num = 0;
		System.out.println(num + " = " + NumberToWordsConverter.convertNumToString(num));

		num = 1;
		System.out.println(num + " = " + NumberToWordsConverter.convertNumToString(num));

		num = 21;
		System.out.println(num + " = " + NumberToWordsConverter.convertNumToString(num));

		num = 105;
		System.out.println(num + " = " + NumberToWordsConverter.convertNumToString(num));

		num = 560945781;
		System.out.println(num + " = " + NumberToWordsConverter.convertNumToString(num));

		num = 999999999;
		System.out.println(num + " = " + NumberToWordsConverter.convertNumToString(num));
	}

}
