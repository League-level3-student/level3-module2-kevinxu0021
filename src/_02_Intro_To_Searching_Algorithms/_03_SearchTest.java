package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

	/*
	 * A minimum of 3 tests are required for each method
	 */

	@Test
	public void testLinearSearch() {
		// 1. Use the assertEquals() method to test your linear search method
		String[] a = { "a", "b", "c", "e", "d", "f" };
		String[] b = { "f", "t", "w", "f", "u", "a" };
		String[] c = { "apple", "banana", "pear", "pinapple", "strawberry", "mango" };

		assertEquals(_01_LinearSearch.linearSearch(a, "c"), 2);
		assertEquals(_01_LinearSearch.linearSearch(b, "u"), 4);
		assertEquals(_01_LinearSearch.linearSearch(c, "strawberry"), 4);
	}

	@Test
	public void testBinarySearch() {
		// 2. Use the assertEquals() method to test your binary search method
		// remember that the array must be sorted
		int[] d = {1,2,3,4,5,6};
		assertEquals(_02_BinarySearch.binarySearch(d, 1, 6, 3), 3);
		assertEquals(_02_BinarySearch.binarySearch(d, 6, 1, 4), -1);
		assertEquals(_02_BinarySearch.binarySearch(d, 1, 6, 1), 1);
	}
}
