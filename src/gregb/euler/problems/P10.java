package gregb.euler.problems;

import gnu.trove.list.TLongList;
import gregb.euler.util.Util;

import java.util.Arrays;

public class P10 {

	public static void main(final String[] args) {
		final TLongList primesBelow10 = Util.primesBelow(10);
		System.out.println(Arrays.toString(primesBelow10.toArray()));
		final long sum10 = primesBelow10.sum();
		System.out.println(sum10);
		assert sum10 == 17;

		final TLongList primesBelow2mil = Util.primesBelow(2000000);
		System.out.println(Arrays.toString(primesBelow2mil.toArray()));
		final long sum = primesBelow2mil.sum();
		System.out.println(sum);
	}
}
