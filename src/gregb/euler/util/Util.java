package gregb.euler.util;

import gnu.trove.list.TIntList;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.set.TIntSet;
import gnu.trove.set.hash.TIntHashSet;

public class Util {

	public static final int IGNORE = -1;

	public static TIntList fib(final int terms, final int max) {
		int nm1 = 2;
		int nm2 = 1;
		int n = nm1 + nm2;
		int term = 2;

		final TIntList seq = new TIntArrayList();
		seq.add(nm2);
		seq.add(nm1);

		while (max > IGNORE && n < max || terms > IGNORE && term < terms) {
			seq.add(n);

			nm2 = nm1;
			nm1 = n;
			term++;

			n = nm1 + nm2;
		}

		return seq;
	}

	public static TIntSet findMultiples(final int max, final int... bases) {
		final TIntSet multiples = new TIntHashSet();

		for (int i = 0; i < max; i++) {
			for (final int base : bases) {
				if (i % base == 0) {
					multiples.add(i);
				}
			}
		}

		return multiples;
	}

	public static int sum(final int[] array, final int modulo) {
		int sum = 0;

		for (final int n : array) {
			if (modulo == IGNORE || n % modulo == 0) {
				sum += n;
			}
		}

		return sum;
	}

}