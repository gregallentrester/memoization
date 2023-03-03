package net.greg;

/*
 * An adaptation of a variant of your code (thanks!)
 *
 * I have inverted the order of the conditional/if-else
 * ladder to have it check for the most common situation
 * (over-and-over).
 *
 * Could shrink (only) the source code by eliminating braces.
 *
 * I still value braces.
 *
 * An adaptation:
 * ref: https://www.geeksforgeeks.org/memoization-1d-2d-and-3d/
 */
public final class App {

	int[] memo = new int [1000];

	private int fib(int n) {

		if (n <= 1) {
			return n;
		}

		if (memo[n] == 0) {

			memo[n] =
				fib(n - 1) + fib(n - 2);

			return memo[n];
		}
		else {
			return memo[n];
		}
	}

	public static void main (String[] args) {

		int n = 6;
		System.err.println(new App().fib(n));
  }
}
