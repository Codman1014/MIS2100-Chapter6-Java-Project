package Cody.Russell.Chap6Proj;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void testzero() {
		SimpleMath test = new SimpleMath();
		assertEquals( 0, test.divide(0, 7),2);
	}
	@Test
	public void smallnum() {
		SimpleMath test = new SimpleMath();
		assertEquals(0.25, test.divide(1, 4),2);
	}
	@Test(expected = IllegalArgumentException.class)
	public void zerodenom() {
		SimpleMath test = new SimpleMath();
		test.divide(6, 0);
	}


}
