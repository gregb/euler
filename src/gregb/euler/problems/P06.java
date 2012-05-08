package gregb.euler.problems;

import gregb.euler.util.Util;

import com.google.common.base.Function;

public class P06 {

	private static class Square implements Function<Integer, Integer> {

		@Override
		public Integer apply(final Integer arg0) {
			return arg0 * arg0;
		}
	}

	public static void main(final String[] args) {

		final int[] range10 = Util.range(1, 10, 1);

		final int[] squared10 = Util.transform(range10, new Square());
		final int sumSquared10 = Util.sum(squared10, Util.IGNORE);
		System.out.println(sumSquared10);
		assert sumSquared10 == 385;

		final int sum10 = Util.sum(range10, Util.IGNORE);
		final int sum10Squared = sum10 * sum10;
		System.out.println(sum10Squared);
		assert sum10Squared == 3025;

		final int diff = sum10Squared - sumSquared10;
		System.out.println(diff);
		assert diff == 2640;

		final int[] range100 = Util.range(1, 100, 1);
		final int[] squared100 = Util.transform(range100, new Square());
		final int sumSquared100 = Util.sum(squared100, Util.IGNORE);
		final int sum100 = Util.sum(range100, Util.IGNORE);
		final int sum100Squared = sum100 * sum100;
		final int diff100 = sum100Squared - sumSquared100;
		System.out.println(diff100);

	}

}
