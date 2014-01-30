package edu.grinnell.csc207.bresette.assignment2;

import java.math.BigInteger;

public class TwoB {
	/**
	 * Compute the average of two integers. Rounds toward zero if the average is
	 * not a whole number.
	 */
	public static BigInteger average(int left, int right) {
		BigInteger val = BigInteger.valueOf(left);
		BigInteger val2 = BigInteger.valueOf(right);
		BigInteger divisor = BigInteger.valueOf(2);
		return (val.add(val2)).divide(divisor);
	} // average(int,int)
}// class TwoB
