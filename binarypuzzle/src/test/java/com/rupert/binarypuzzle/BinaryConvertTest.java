package com.rupert.binarypuzzle;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

	public class BinaryConvertTest {

		@Rule
		public ExpectedException thrown= ExpectedException.none();
		
		BinaryChecker checker = new BinaryChecker();
		
		@Test
		public void zeroConverts0() {
			assertEquals(0, checker.check(0));
		}
		
		@Test
		public void oneConvertsTo1() {
			assertEquals(1, checker.check(1));
		}
		
		@Test
		public void twoConvertsTo1() {
			assertEquals(1, checker.check(2));
		}
		
		@Test
		public void fourConvertsTo1() {
			assertEquals(1, checker.check(4));
		}
		
		@Test
		public void sixConvertsTo3() {
			assertEquals(3, checker.check(6));
		}
		
		@Test
		public void thirteenConverts11() {
			assertEquals(11, checker.check(13));
		}
		
		@Test
		public void fourtySevenConverts61() {
			assertEquals(61, checker.check(47));
		}
		
		@Test
		public void oneTrillionConvertsto1365623() {
		assertEquals(1365623, checker.check(1000000000));
		}
		
		@Test
		public void lessThen0ThrowException() {
			thrown.expect(IllegalArgumentException.class);
			thrown.expectMessage("The input number needs to be positive");
			checker.check(-1);
		}
		
		@Test
		public void moreThen1000000000ThrowException() {
			thrown.expect(IllegalArgumentException.class);
			thrown.expectMessage("The input number needs to be less than 1000000001");
			checker.check(1000000001);
	}

}