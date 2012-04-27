package gregb.euler.problems;

import gregb.euler.util.Util;


public class P1 {

	public static void main(final String[] args) {

		final int[] m10_3_5 = Util.findMultiples(10, 3, 5).toArray();
		final int exampleSum = Util.sum(m10_3_5, Util.IGNORE);
		System.out.println(exampleSum);
		assert exampleSum == 23;

		final int[] m1000_3_5 = Util.findMultiples(1000, 3, 5).toArray();
		final int problemSum = Util.sum(m1000_3_5, Util.IGNORE);
		System.out.println(problemSum);

	}
}
