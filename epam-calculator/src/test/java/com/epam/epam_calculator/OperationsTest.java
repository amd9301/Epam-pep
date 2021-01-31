package test.java.com.epam.epam_calculator;

import static org.junit.Assert.*;
import org.junit.Test;
import main.java.com.epam.epam_calculator.Operations;

public class OperationsTest 
{
	@Test
	/*
	 * Test Cases for addition
	 */
	public void testAdd()
	{
		Operations o = new Operations();
		assertEquals(o,o.add(5, 3));
		assertEquals(o,o.add(3, -9));
		assertEquals(o,o.add(-5, -9));
	}
	@Test
  /*
   * Test cases for subtraction
   */
		
	public void testSubtract()
	{
		Operations o = new Operations();
		assertEquals(o,o.subtract(0,2));
		assertEquals(o,o.subtract(10, 2));
		assertEquals(o,o.subtract(3, 22));
		
	}
	
	@Test
	/*
	 * Test Cases for Multiplication
	 */
	public void testMul() {
		Operations o = new Operations();
		assertEquals(o,o.mul(5, 7));
		assertEquals(o,o.mul(-3, 7));
		assertEquals(o,o.mul(-5, -4));
	}
	@Test
	/*
	 * Test Cases for Division
	 */
	public void testDiv() {
		Operations o = new Operations();
		assertEquals(o,o.div(15, 5));
		assertEquals(o,o.div(0, 0));
		assertEquals(o,o.div(15, 0));
		assertEquals(o,o.div(9, 99));
	}
}
