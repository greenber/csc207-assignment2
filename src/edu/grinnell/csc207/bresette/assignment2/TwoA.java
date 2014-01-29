package edu.grinnell.csc207.bresette.assignment2;

public class TwoA {
	public static void main(String[] args) {
		System.out.println(TwoA.isMultiple(56, 56));
		System.out.println(TwoA.isOdd(5));
		System.out.println(TwoA.oddSumTo(7));
		int[] values = { 1, 3, 4, 5 };
		System.out.println(TwoA.isOddProduct(values));
		System.out.println(TwoA.isDistinct(values));
		TwoA.reverseInts(values);
		for (int i = 0; i < values.length; i++) {
			System.out.println(" " + values[i]);
		}
		System.out.println(TwoA.average(-102, 103));

	}

	public static int average(int left, int right) {
		return (left + right) / 2;
	} // average(int,int)

	public static boolean isMultiple(long a, long b) {
		return ((a % b) == 0);
	} // isMultiple

	public static boolean isOdd(int i) {
		return (i & 1) == 1;
	} // isOdd

	public static int oddSumTo(int n) {
		return ((n / 2) * (n / 2));
	}

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

	public static void reverseInts(int[] ints) {
		int length = ints.length;

		for (int i = 0; i < (int) (length / 2); i++) {
			int temp = ints[i];
			ints[i] = ints[(length - 1) - i];
			ints[(length - 1) - i] = temp;
		}
	}// reverseInts
}
