package gregb.euler.util;

import gnu.trove.list.TIntList;
import gnu.trove.list.TLongList;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.TIntLongMap;
import gnu.trove.map.hash.TIntLongHashMap;
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

	public static int sum(final long[] array, final int modulo) {
		int sum = 0;

		for (final long n : array) {
			if (modulo == IGNORE || n % modulo == 0) {
				sum += n;
			}
		}

		return sum;
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

	public static int[] range(final int min, final int max, final int step) {
		final int[] range = new int[max - min + 1];

		for (int i = min; i <= max; i = i + step) {
			range[i - min] = i;
		}

		return range;
	}

	public static long[] range(final int min, final long max, final int step) {
		final long[] range = new long[(int) (max - min + 1)];

		for (long i = min; i <= max; i = i + step) {
			range[(int) (i - min)] = i;
		}

		return range;
	}

	public static TLongList primeFactors(long n) {

		final TLongList factors = new TLongArrayList();

		for (int i = 2; i <= n / i; i++) {
			while (n % i == 0) {
				factors.add(i);
				n = n / i;
			}
		}

		if (n > 1) {
			factors.add(n);
		}

		return factors;
	}

	public static TLongList primesBelow(final long max) {

		final long[] sieve = Util.range(0, max, 1);
		final TLongList primes = new TLongArrayList();

		for (int i = 2; i <= max; i++) {
			if (sieve[i] > 0) {
				primes.add(i);
				for (int j = i + i; j <= max; j = j + i) {
					sieve[j] = 0;
				}
			}
		}

		return primes;
	}

	public static long lcm(final int[] numbers) {

		final TIntLongMap maxPrimeFactorMap = new TIntLongHashMap();

		for (final int i : numbers) {
			final TLongList primeFactors = primeFactors(i);
			final TIntLongMap primeFactorMap = new TIntLongHashMap();

			for (final long factor : primeFactors.toArray()) {
				long factorCount = primeFactorMap.get((int) factor);
				factorCount++;
				primeFactorMap.put((int) factor, factorCount);
			}

			for (final int factor : primeFactorMap.keys()) {
				final int factorCount = (int) primeFactorMap.get(factor);
				final int maxFactorCount = (int) maxPrimeFactorMap.get(factor);

				if (factorCount > maxFactorCount) {
					maxPrimeFactorMap.put(factor, factorCount);
				}
			}
		}

		long product = 1;

		for (final int factor : maxPrimeFactorMap.keys()) {

			final int maxFactorCount = (int) maxPrimeFactorMap.get(factor);
			for (int i = 0; i < maxFactorCount; i++) {
				product *= factor;
			}
		}

		return product;
	}

}
