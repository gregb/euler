package gregb.euler.util;

import gnu.trove.list.TIntList;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.set.TIntSet;
import gnu.trove.set.hash.TIntHashSet;

import java.math.BigInteger;

import com.google.common.base.Function;

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

	public static BigInteger factorial(final int n) {

		BigInteger factorial = BigInteger.ONE;
		for (long i = 1; i <= n; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}

		return factorial;
	}

	public static int[] getDigits(final int i) {
		final String s = Integer.toString(i);

		final int[] digits = new int[s.length()];

		for (int j = 0; j < digits.length; j++) {
			digits[j] = Character.digit(s.charAt(j), 10);
		}

		return digits;
	}

	public static int[] getDigits(final BigInteger i) {
		final String s = i.toString(10);

		final int[] digits = new int[s.length()];

		for (int j = 0; j < digits.length; j++) {
			digits[j] = Character.digit(s.charAt(j), 10);
		}

		return digits;
	}

	public static int[] transform(final int[] source, final Function<Integer, Integer> transformFn) {
		final int[] transformed = new int[source.length];

		for (int i = 0; i < source.length; i++) {
			transformed[i] = transformFn.apply(source[i]);
		}

		return transformed;
	}

}
