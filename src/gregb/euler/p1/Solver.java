package gregb.euler.p1;

import gnu.trove.set.hash.TIntHashSet;

public class Solver {

	public static void main(final String[] args) {

		final int[] m10_3_5 = findMultiples(10, 3, 5).toArray();
		final int exampleSum = sum(m10_3_5);
		System.out.println(exampleSum);

		final int[] m1000_3_5 = findMultiples(1000, 3, 5).toArray();
		final int problemSum = sum(m1000_3_5);
		System.out.println(problemSum);

	}

	private static TIntHashSet findMultiples(final int max, final int... bases) {
		final TIntHashSet multiples = new TIntHashSet();

		for (int i = 0; i < max; i++) {
			for (final int base : bases) {
				if (i % base == 0) {
					multiples.add(i);
				}
			}
		}

		return multiples;
	}

	private static int sum(final int[] array) {
		int sum = 0;

		for (final int n : array) {
			sum += n;
		}

		return sum;
	}
}
