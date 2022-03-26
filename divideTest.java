package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTest {

	@Test
	public void test1over2() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(1, 2);
		assertNotEquals(0.5, output, 0.0);
	}
	
	@Test
	public void test20over4() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(20, 4);
		assertEquals(5.0, output, 0.0);
	}
	
	@Test
	public void test25over4() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(25, 4);
		assertNotEquals(6.25, output, 0.0);
	}
	
	@Test
	public void test200over10() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(200, 10);
		assertEquals(20.0, output, 0.0);
	}
	
	@Test
	public void test2over0() {
		JunitTesting test = new JunitTesting();
		Exception exception = assertThrows(ArithmeticException.class, () -> test.divide(1, 0));
		assertEquals("/ by zero", exception.getMessage());
	}

}
