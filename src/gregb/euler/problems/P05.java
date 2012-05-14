package gregb.euler.problems;

import gregb.euler.util.Util;


public class P05 {

	public static void main(final String[] args) {

		final int[] wikipediaExample=new int[] {8, 9, 21};
		final long wikiAnswer = Util.lcm(wikipediaExample);
		System.out.println(wikiAnswer);
		assert wikiAnswer == 504;

		final long lcm10 = Util.lcm(Util.range(1, 10, 1));
		System.out.println(lcm10);
		assert lcm10 == 2520;

		final long lcm20 = Util.lcm(Util.range(1, 20, 1));
		System.out.println(lcm20);
	}
}
