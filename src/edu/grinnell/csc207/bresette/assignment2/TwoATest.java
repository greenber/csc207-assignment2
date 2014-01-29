package edu.grinnell.csc207.bresette.assignment2;

import java.util.Random;
import static org.junit.Assert.*;
import org.junit.Test;

public class TwoATest {

	@Test
	public void testIsMultiple() {
		for (int i = 0; i < 10000; i += 13) {
			assertEquals("Testing " + i + " is a multiple of 13", true,
					TwoA.isMultiple(i, 13));
			assertEquals("Testing " + (i - 1) + " is not a multiple of 13",
					false, TwoA.isMultiple(i - 1, 13));
		}
	}

	@Test
	public void testIsOdd() {
		for (int i = 1; i < 10000; i += 2) {
			assertEquals("Testing " + i + " is odd", true, TwoA.isOdd(i));
			assertEquals("Testing " + (i - 1) + " is even", false,
					TwoA.isOdd(i - 1));
		}
	}

	@Test
	public void testOddSumTo() {
		int sum = 0;
		for (int i = 1; i < 10000; i += 2) {

			assertEquals("Testing odd sum until " + i + " is " + sum, sum,
					TwoA.oddSumTo(i));
			assertEquals("Testing odd sum until " + (i - 1) + " is " + sum,
					sum, TwoA.oddSumTo(i - 1));
			sum += i;
		}
	}

	@Test
	public void testIsOddProduct() {
		int[] vals = { 1, 2, 1, 4 };
		for (int i = 1; i < 10000; i += 2) {
			vals[2] = i;
			assertEquals("Testing " + i + "in isOddProduct", true,
					TwoA.isOddProduct(vals));
			vals[2] = (i + 1);
			assertEquals("Testing " + i + "in isOddProduct", false,
					TwoA.isOddProduct(vals));
		}
	}

	@Test
	public void testIsDistinct() {
		int[] vals = new int[100];
		for (int j = 0; j < 100; j++) {
			vals[j] = j;
		}

		for (int i = 1; i < 100; i++) {
			vals[0] = i;
			assertEquals("Elements not distinct because " + i
					+ " appears more than once", false, TwoA.isDistinct(vals));
		}
	}

	@Test
	public void testReverseInts() {
		Random r = new Random();

		for (int i = 0; i < 100; i++) {
			int length = r.nextInt(60);
			int[] values = new int[length];
			for (int j = 0; j < length; j++) {
				values[j] = r.nextInt(Integer.MAX_VALUE);
			}
			int[] control = values.clone();
			TwoA.reverseInts(values);
			TwoA.reverseInts(values);
			assertArrayEquals("Testing if reversed twice " + values + " = "
					+ control, control, values);
		}
	}

}
