package gregb.euler.problems;

import gnu.trove.list.TLongList;
import gregb.euler.util.Util;

import java.util.Arrays;

public class P03 {

	public static void main(final String[] args) {

		final TLongList example = Util.primeFactors(13195);
		System.out.println(Arrays.toString(example.toArray()));
		assert example.get(example.size() - 1) == 29;

		final TLongList problem = Util.primeFactors(600851475143L);
		System.out.println(Arrays.toString(problem.toArray()));

	}
}
