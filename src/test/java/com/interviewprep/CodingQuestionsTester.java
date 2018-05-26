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
	
	@Test
	public void testFindMissingNum(){
		int[] d = new int[] {1, 3, 6, 4, 1, 2};
		int[] e = new int[] {1, 2, 3};
		int[] f = new int[] {-1, -3};
		int[] g = new int[] {-5};
		int[] h = new int[] {-3};
		int[] i = new int[] {0};
		int[] j = new int[] {1};
		int[] k = new int[] {2};
		int[] l = new int[] {3};
		int[] m = new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE};
		int[] n = new int[] {-5, 5};
		int[] o = new int[] {1, 5};
		int[] p = new int[] {0, 0};
		int[] q = new int[] {2, 4, 6, 8};
		int[] r = new int[] {1, 3, 5, 7};
		int[] s = new int[] {-1000000, 1000000};
		int[] t = new int[] {-3, -2, 4, 6, 1, 2, -5, -1, 0, 3, 4, -5, -4, -4,};
		int[] U = new int[] {-3, -2, 4, 6, 1, 2, -5, 0, 3, 4, -5, -4, -4,};
		int[] z = new int[] {5, 4, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 2, 1, 5, 1};
		System.out.println("testFindMissingNum");
		assertEquals(z[0], c.findMissingNum(d));
		assertEquals(z[1], c.findMissingNum(e));
		assertEquals(z[2], c.findMissingNum(f));
		assertEquals(z[3], c.findMissingNum(g));
		assertEquals(z[4], c.findMissingNum(h));
		assertEquals(z[5], c.findMissingNum(i));
		assertEquals(z[6], c.findMissingNum(j));
		assertEquals(z[7], c.findMissingNum(k));
		assertEquals(z[8], c.findMissingNum(l));
		assertEquals(z[9], c.findMissingNum(m));
		System.out.println("testing - " + z[10] + " - " + n[0] + ", " + n[1]);
		assertEquals(z[10], c.findMissingNum(n));
		System.out.println("testing - " + z[11] + " - " + o[0] + ", " + o[1]);
		assertEquals(z[11], c.findMissingNum(o));
		System.out.println("testing - " + z[12] + " - " + p[0] + ", " + p[1]);
		assertEquals(z[13], c.findMissingNum(q));
		assertEquals(z[14], c.findMissingNum(r));
		assertEquals(z[15], c.findMissingNum(s));
		assertEquals(z[16], c.findMissingNum(t));
		assertEquals(z[17], c.findMissingNum(U));
	}
}
