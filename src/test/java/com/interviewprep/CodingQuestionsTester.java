package com.interviewprep;
import org.junit.Assert;
import org.junit.Test;
import com.interviewprep.misc.CodingQuestions;
import junit.framework.TestCase;

public class CodingQuestionsTester extends TestCase {
	CodingQuestions c = new CodingQuestions();
	
	@Test
	public void testReverseNum(){
		System.out.println("testReverseNum");
		c.reverseNum(12345);
	}
	
	@Test
	public void testWriteVertical(){
		System.out.println("testWriteVertical");
		c.writeVertical(12345);
	}
	
	@Test
	public void testGcd(){
		System.out.println("testGcd");
		assertEquals(5, c.gcd(5, 10));
	}
	
	@Test
	public void testPower(){
		System.out.println("testPower");
		System.out.println(c.power(5, 3));
		assertEquals(125, c.power(5, 3));
	}
	
	@Test
	public void testIsPal(){
		System.out.println("testIsPal");
		assertEquals(true, c.isPal("racecar"));
	}
	
	@Test
	public void testFact(){
		System.out.println("testFact");
		System.out.println(c.fact(3));
		assertEquals(6, c.fact(3));
	}
	
	@Test
	public void testFib(){
		System.out.println("testFib");
		assertEquals(0, c.fib(0));
	}
	
	@Test
	public void testBubbleSort(){
		int[] a = new int[] {-5, 3, 9, 0, 13};
		int[] b = new int[] {-5, 0, 3, 9, 13};
		System.out.println("testBubbleSort");
		Assert.assertArrayEquals(b, c.bubbleSort(a));
	}
	
	@Test
	public void testReverseIntArray(){
		int[] a = new int[] {2, 4, 6, 8, 10};
		int[] b = new int[] {10, 8, 6, 4, 2};
		System.out.println("testReverseArray");
		Assert.assertArrayEquals(b, c.reverseIntArray(a));
	}
	
	@Test
	public void testReverseString(){
		String a = "reverse";
		String b = "esrever";
		System.out.println("testReverseString");
		assertEquals(b, c.reverseString(a));
	}
	
	@Test
	public void testLargestThreeNums(){
		int[] a = new int[] {10, 2, 4, 6, 8};
		int[] b = new int[] {10, 8, 6};
		System.out.println("testLargestThreeNums");
		Assert.assertArrayEquals(b, c.largestThreeNums(a));
	}
	
	@Test
	public void testIsPrime(){
		int[] a = new int[] {2, 3, 4, 5, 6, 7, 91};
		boolean[] b = new boolean[] {true, true, false, true, false, true, false};
		System.out.println("testIsPrime");
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i] + " - " + c.isPrime(a[i]));
			assertEquals(b[i], c.isPrime(a[i]));
		}
	}
}
