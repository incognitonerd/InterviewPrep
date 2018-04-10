package com.interviewprep;
import org.junit.Test;
import com.interviewprep.misc.Random;
import junit.framework.TestCase;

public class RandomTester extends TestCase {
	@Test
	public void testReverseNum(){
		Random rs = new Random();
		rs.reverseNum(12345);
	}
	
	@Test
	public void testWriteVertical(){
		Random rs = new Random();
		rs.writeVertical(12345);
	}
	
	@Test
	public void testGcd(){
		Random rs = new Random();
		System.out.println(rs.gcd(5, 3));
		assertEquals(1, rs.gcd(5, 3));
	}
	
	@Test
	public void testPower(){
		Random rs = new Random();
		System.out.println(rs.power(5, 3));
		assertEquals(125, rs.power(5, 3));
	}
	
	@Test
	public void testIsPal(){
		Random rs = new Random();
		assertEquals(true, rs.isPal("racecar"));
	}
	
	@Test
	public void testFact(){
		Random rs = new Random();
		System.out.println(rs.fact(3));
		assertEquals(6, rs.fact(3));
	}
	
	@Test
	public void testFib(){
		Random rs = new Random();
		assertEquals(0, rs.fib(0));
	}
}
