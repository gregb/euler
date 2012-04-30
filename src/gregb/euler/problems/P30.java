package gregb.euler.problems;

import gnu.trove.list.TIntList;
import gnu.trove.list.array.TIntArrayList;
import gregb.euler.util.Util;

import java.util.Arrays;

import com.google.common.base.Function;

public class P30 {

	private static class Pow5 implements Function<Integer, Integer> {

		@Override
		public Integer apply(final Integer arg0) {
			return (int) Math.pow(arg0, 5);
		}
	}

	private static class Pow4 implements Function<Integer, Integer> {

		@Override
		public Integer apply(final Integer arg0) {
			return (int) Math.pow(arg0, 4);
		}
	}

	public static void main(final String[] args) {

		final Pow4 pow4 = new Pow4();
		final TIntList exampleMatches = new TIntArrayList();

		for (int i = 2; i < 10000; i++) {
			final int[] digits = Util.getDigits(i);
			final int[] transform = Util.transform(digits, pow4);
			final int sum = Util.sum(transform, Util.IGNORE);

			if (sum == i) {
				System.out.println(i + " => " + Arrays.toString(digits) + " => " + Arrays.toString(transform) + " => " + sum);
				exampleMatches.add(i);
			}
		}

		final int example = Util.sum(exampleMatches.toArray(), Util.IGNORE);
		System.out.println("= " + example);

		final Pow5 pow5 = new Pow5();
		final TIntList matches = new TIntArrayList();

		for (int i = 2; i < 1000000; i++) {
			final int[] digits = Util.getDigits(i);
			final int[] transform = Util.transform(digits, pow5);
			final int sum = Util.sum(transform, Util.IGNORE);

			if (sum == i) {
				System.out.println(i + " => " + Arrays.toString(digits) + " => " + Arrays.toString(transform) + " => " + sum);
				matches.add(i);
			}
		}

		final int grand_total = Util.sum(matches.toArray(), Util.IGNORE);
		System.out.println("= " + grand_total);
	}

}
