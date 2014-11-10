import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Luis
 *
 */

public class FractionTest {

	@Test(timeout = 10)
	public void testZero() {

		// test divide by zero
		new Fraction(1, 0);
	}
	
	@Test(timeout = 10)
	public void testEquals(){
		System.out.println("");
		
		Fraction f1 = new Fraction(1, 3);
		Fraction f2 = new Fraction(1, 6);
		
		Fraction f3 = f1.add(f2);
		assertEquals("Wrong answer: " + f1 + " + " + f2 , new Fraction (1, 2), f3);
	}	
		
	@Test(timeout = 10)
	public void testNegate(){
		
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = f1.negate();
		
		assertEquals("Wrong answer: " + f1 + ".negate()", new Fraction(-1,2), f2); 
		assertEquals("Wrong answer: " + f1 + ".negate()", new Fraction(1,-2), f2); 
	}

	@Test(timeout = 10)
	public void testAbsValue(){
		Fraction f1 = new Fraction(-2,3);
		Fraction f2 = f1.absValue();
		
		assertEquals("Wrong answer: " + f1 + ".absValue()", new Fraction(2,3), f2);
	}
	
	@Test(timeout = 10)
	public void testMultiply(){
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3,5);
		Fraction f3 = f1.multiply(f2);
		
		assertEquals("Wrong answer: " + f1 + ".multiply(" + f2 + ")", new Fraction(3,10), f3);
	}
	
	@Test(timeout = 10)
	public void testDivide(){
		Fraction f1 = new Fraction(2,3);
		Fraction f2 = new Fraction(1,4);
		Fraction f3 = f1.divide(f2);
		
		assertEquals("Wrong answer: " + f1 + ".divide(" + f2 + ")", new Fraction(8,3), f3);	
	}
	
	@Test(timeout = 10)
	public void testAdd(){
		Fraction f1 = new Fraction(1,3);
		Fraction f2 = new Fraction(1,6);
		Fraction f3 = f1.add(f2);
		
		assertEquals("Wrong answer: " + f1 + ".add(" + f2 + ")", new Fraction(1,2), f3);
	}
	
	@Test(timeout = 10)
	public void testSubtract(){
		Fraction f1 = new Fraction(3,4);
		Fraction f2 = new Fraction(1,4);
		Fraction f3 = f1.subtract(f2);
		
		assertEquals("Wrong answer: " + f1 + ".subtract(" + f2 + ")", new Fraction(2,4), f3);
	}
	
}