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
	
	// TODO: Test `add`!

}
