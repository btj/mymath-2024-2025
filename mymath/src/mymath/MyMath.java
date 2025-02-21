package mymath;

import java.util.stream.IntStream;

public class MyMath {

	/**
	 * Computes the square root of the given number, rounded down.
	 * 
	 * DEFENSIVE PROGRAMMING
	 * @throws IllegalArgumentException if `x` is negative | x < 0
	 * @post The result equals the square root of the given number, rounded down.
	 *     | result * result <= x
	 * @post | x < (result + 1) * (result + 1)
	 */
	public static int sqrt(int x) {
		if (x < 0)
			throw new IllegalArgumentException("`x` is negative");
		
		int result = 0;
		while ((result + 1) * (result + 1) <= x)
			result++;
		return result;
	}
	
	/**
	 * Returns the index of the first occurrence of `needle` in `haystack`,
	 * or -1 if `needle` does not occur in `haystack`.
	 * 
	 * @throws IllegalArgumentException | haystack == null
	 * @inspects | haystack
	 * @post | result == -1 || 0 <= result && result < haystack.length
	 * @post | result == -1 || haystack[result] == needle
	 * @post If `result` equals -1, then `needle` does not appear in `haystack`.
	 *       | result != -1 || IntStream.range(0, haystack.length).allMatch(i -> haystack[i] != needle)
	 * @post If `result` does not equal -1, then all elements at indices less than `result` are different
	 *       from `needle`.
	 *       | result == -1 || IntStream.range(0, result).allMatch(i -> haystack[i] != needle)
	 */
	public static int find(int needle, int[] haystack) {
		if (haystack == null)
			throw new IllegalArgumentException("`haystack` is null");
		for (int i = 0; i < haystack.length; i++)
			if (haystack[i] == needle)
				return i;
		return -1;
	}
	
	/**
	 * Replaces each element of the given array by its negation.
	 * 
	 * @throws IllegalArgumentException | array == null
	 * @mutates | array
	 * @post | IntStream.range(0, array.length).allMatch(i -> array[i] == -old(array.clone())[i])
	 */
	public static void negate(int[] array) {
		if (array == null)
			throw new IllegalArgumentException("`array` is null");
		for (int i = 0; i < array.length; i++)
			array[i] = -array[i];
	}
	
	/**
	 * Adds the elements of the second array to the correspond elements of the first array.
	 * 
	 * TODO: Document formally!
	 */
	public static void add(int[] array1, int[] array2) {
		// TODO: Implement!
	}

}
