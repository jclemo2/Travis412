package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(5, 3), 2);
	}
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(1, 1), 1);
	}
	@Test
	public void testDiv() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(1, 1), 1);
	}
	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		//shouldn't be able to divide by zero
		try {
			calc.divide(2, 0);
			fail("Should have thrown an exception!");
		}
		catch (ArithmeticException e) {
		}
	}
}
