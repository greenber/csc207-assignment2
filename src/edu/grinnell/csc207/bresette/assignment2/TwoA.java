package edu.grinnell.csc207.bresette.assignment2;

public class TwoA {
	public static void main(String[] args) {

	}

	/**
	 * Finds out if the values are multiplies of each other. v
	 * 
	 * @param a
	 *            : A long integer
	 * @param b
	 *            A long integer
	 * @return A integer
	 */
	public static boolean isMultiple(long a, long b) {
		return ((a % b) == 0);
	} // isMultiple

	/**
	 * finds in the input is odd
	 * 
	 * @param i
	 *            : Takes an integer
	 * @return A boolean
	 */

	public static boolean isOdd(int i) {
		return (i & 1) == 1;
	} // isOdd

	/**
	 * Finds the sum of all odd numbers
	 * 
	 * @param n
	 *            : Takes an integer
	 * @return : an integer
	 */

	public static int oddSumTo(int n) {
		return ((n / 2) * (n / 2));
	}// oddSumTo

	/**
	 * Finds if there is a odd product
	 * 
	 * @param ints
	 *            : An array of integers
	 * @return: A boolean
	 */
	public static boolean isOddProduct(int[] ints) {
		int odd = 0;
		for (int i = 0; i < ints.length; i++) {
			if (TwoA.isOdd(ints[i]) == true) {
				odd++;
				if (odd == 2) {
					return true;
				}
			}
		}
		return false;
	}// isOddProduct

	/**
	 * Find if there is all distinct values
	 * 
	 * @param ints
	 *            : an array of integers
	 * @return: A boolean
	 */
	public static boolean isDistinct(int[] ints) {
		for (int i = 0; i < ints.length; i++) {
			for (int j = i + 1; j < ints.length; j++) {
				if (ints[j] == ints[i]) {
					return false;
				}
			}
		}
		return true;
	} // isDistinct
	/*
	 * Reverse an array Param ints: an array of ints returns: nothing Calls for
	 * a side effect
	 */

	public static void reverseInts(int[] ints) {
		int length = ints.length;

		for (int i = 0; i < (int) (length / 2); i++) {
			int temp = ints[i];
			ints[i] = ints[(length - 1) - i];
			ints[(length - 1) - i] = temp;
		}
	}// reverseInts

}
