package com.virtusa.code.puzzle;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumberToWordsConverterTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void test_negetive() {
		String num = NumberToWordsConverter.convertNumToString(-9);
		assertEquals(num, "minus nine");
	}

	@Test
	public void test_0() {
		String num = NumberToWordsConverter.convertNumToString(0);
		assertEquals(num, "zero");
	}

	@Test
	public void test_1() {
		String num = NumberToWordsConverter.convertNumToString(1);
		assertEquals(num, "one");
	}

	@Test
	public void test_21() {
		String num = NumberToWordsConverter.convertNumToString(21);
		assertEquals(num, "twenty one");
	}

	@Test
	public void test_105() {
		String num = NumberToWordsConverter.convertNumToString(105);
		assertEquals(num, "one hundred and five");
	}

	@Test
	public void test_560945781() {
		String num = NumberToWordsConverter.convertNumToString(560945781);
		assertEquals(num, "fifty six million nine lakh forty five thousand seven hundred and eighty one");
	}

	@Test
	public void test_999999999() {
		String num = NumberToWordsConverter.convertNumToString(999999999);
		assertEquals(num, "ninety nine million ninety nine lakh ninety nine thousand nine hundred and ninety nine");
	}

}
