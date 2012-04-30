package gregb.euler.problems;

import gregb.euler.util.Util;

import java.math.BigInteger;
import java.util.Arrays;

public class P20 {

	public static void main(final String[] args) {

		final BigInteger fact10 = Util.factorial(10);
		assert fact10.equals(new BigInteger("3628800"));
		System.out.println(fact10);

		final int[] digits10 = Util.getDigits(fact10);
		System.out.println(Arrays.toString(digits10));

		final int sum10 = Util.sum(digits10, Util.IGNORE);
		System.out.println(sum10);

		assert sum10 == 27;

		final BigInteger fact100 = Util.factorial(100);
		System.out.println(fact100);

		final int[] digits100 = Util.getDigits(fact100);
		final int sum100 = Util.sum(digits100, Util.IGNORE);
		System.out.println(sum100);
	}

}
