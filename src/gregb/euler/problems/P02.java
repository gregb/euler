package gregb.euler.problems;

import gnu.trove.list.TIntList;
import gregb.euler.util.Util;

import java.util.Arrays;

public class P02 {

	public static void main(final String[] args) {
		final TIntList seqTo90 = Util.fib(Util.IGNORE, 90);
		System.out.println(Arrays.toString(seqTo90.toArray()));

		final TIntList seq10Terms = Util.fib(10, Util.IGNORE);
		System.out.println(Arrays.toString(seq10Terms.toArray()));

		assert seqTo90.equals(seq10Terms);

		final int sumFibTo90 = Util.sum(seqTo90.toArray(), Util.IGNORE);
		System.out.println(sumFibTo90);
		assert sumFibTo90 == 231;

		final int sumFibEvenTo90 = Util.sum(seqTo90.toArray(), 2);
		System.out.println(sumFibEvenTo90);
		assert sumFibEvenTo90 == 44;

		final TIntList seqTo4Million = Util.fib(Util.IGNORE, 4000000);
		final int sumFibEvenTo4Million = Util.sum(seqTo4Million.toArray(), 2);
		System.out.println(sumFibEvenTo4Million);

	}
}
