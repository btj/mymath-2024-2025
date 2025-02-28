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
	 * Adds the elements of the second array to the corresponding elements of the first array.
	 * 
	 * @throws IllegalArgumentException | array1 == null || array2 == null
	 * @throws IllegalArgumentException | array1.length != array2.length
	 * @mutates | array1
	 * @inspects | array2
	 * @post | IntStream.range(0, array1.length).allMatch(i ->
	 *       |     array1[i] == old(array1.clone())[i] + array2[i])
	 */
	public static void add(int[] array1, int[] array2) {
		if (array1 == null)
			throw new IllegalArgumentException("`array1` is null");
		if (array2 == null)
			throw new IllegalArgumentException("`array2` is null");
		if (array1.length != array2.length)
			throw new IllegalArgumentException("The lengths of `array1` and `array2` are not equal");
		
		for (int i = 0; i < array1.length; i++)
			array1[i] += array2[i];
	}

}
