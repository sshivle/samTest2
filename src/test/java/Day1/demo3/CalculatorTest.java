package Day1.demo3;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
Calc c1;
	protected void setUp() throws Exception {
		super.setUp();
		c1 = new Calc();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAdd() {
		int i = c1.add(10, 20);
		assertTrue("Add 10 and 20", i ==30);
	}

	public void testDivide() {
		int i = c1.divide("100","20");
		assertTrue("Divide 10 and 20", i ==5);
	}

/*	
	public void testDivideZer0() {
		try {
		int i = c1.divide("1A0","0");
		
		}
		catch (ArithmeticException e) {
			assertTrue("NFE...", true);
		}
	}
	
	public void testDivideNonNumeric() {
		try {
		int i = c1.divide("1A0","20");
		}
		catch (NumberFormatException e) {
			assertTrue("NFE...", true);
		}
	}
	
*/
}
