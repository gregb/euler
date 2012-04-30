package gregb.euler.problems;

import gregb.euler.util.Util;

import java.math.BigInteger;

public class P16 {

	final static BigInteger TWO = new BigInteger("2");

	public static void main(final String[] args) {

		final BigInteger pow2_15 = TWO.pow(15);
		assert pow2_15.equals(new BigInteger("32768"));
		System.out.println(pow2_15);

		final int[] digits_2_15 = Util.getDigits(pow2_15);
		final int sum2_15 = Util.sum(digits_2_15, Util.IGNORE);
		assert sum2_15 == 26;
		System.out.println(sum2_15);

		final BigInteger pow2_1000 = TWO.pow(1000);
		System.out.println(pow2_1000);

		final int[] digits_2_1000 = Util.getDigits(pow2_1000);
		final int sum2_1000 = Util.sum(digits_2_1000, Util.IGNORE);
		System.out.println(sum2_1000);
	}

}
