package mymath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void testSqrt() {
		assertEquals(2, MyMath.sqrt(4));
		assertEquals(2, MyMath.sqrt(5));
		assertEquals(3, MyMath.sqrt(9));
		assertEquals(3, MyMath.sqrt(10));
	}
	
	@Test
	void testFind() {
		assertEquals(1, MyMath.find(13, new int[] {5, 13, 3, 8}));
		assertEquals(-1, MyMath.find(7,  new int[] {5, 13, 3, 8}));
		
	}
	
	@Test
	void testNegate() {
		int[] myArray = new int[] {10, 20, 30};
		MyMath.negate(myArray);
		assertArrayEquals(new int[] {-10, -20, -30}, myArray);
	}
	
	@Test
	void testAdd() {
		int[] array1 = {10, 20, 30};
		int[] array2 = {1, 2, 3};
		MyMath.add(array1, array2);
		assertArrayEquals(new int[] {11, 22, 33}, array1);
	}

}
