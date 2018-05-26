package com.interviewprep.misc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingQuestions {
	public int sumOnlyMultiples(int num, int lowestMultiple, int secondMutiple){
		int sum = 0;
		for(int i = lowestMultiple; i < num; i++){
			if((i % lowestMultiple) == 0 || (i % secondMutiple) == 0){
				sum += i;
			}
		}
		return sum;
	}
	
	public void multiples(){
		for(int i = 1; i < 101; i++){
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println("zillow");
			} else if(i % 3 == 0){
				System.out.println("zil");
			} else if(i % 5 == 0){
				System.out.println("low");
			} else{
				System.out.println(i);
			}
		}
	}
	
	public void statistics(char theChar){
		String line = null;
		int numOfOcc = 0, numOfLines = 0;
		try{
			BufferedReader br = new BufferedReader(new FileReader("zillowAssessment.txt"));
			while((line = br.readLine()) != null){
				boolean found = false;
				for(int i = 0; i < line.length(); i++){
					if(line.charAt(i) == Character.toUpperCase(theChar) || line.charAt(i) == Character.toLowerCase(theChar)){
						found = true;
						numOfOcc++;
					}
				}
				if(found){
					numOfLines++;
				}
			}
			br.close();
			System.out.println(theChar + " occurs " + numOfOcc + " times");
			System.out.println(theChar + " occurs on " + numOfLines + " lines");
		} catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public void numOfChars(String path){
		File file = new File(path);
		String line = null, tmp;
		int count = 0;
		try{
			FileReader f = new FileReader(file);
			BufferedReader b = new BufferedReader(f);
			while((tmp = b.readLine()) != null){
				line += tmp;
			}
			count = line.length();
			b.close();
		} catch(FileNotFoundException e){
			System.out.println("file not found");
		} catch(IOException e){
			System.out.println("io exception");
		}
		System.out.println("chars : " + count);
	}
	
	public void numOfWords(String path){
		File file = new File(path);
		int count = 0;
		String line = null;
		try{
			FileInputStream f = new FileInputStream(file);
			BufferedReader b = new BufferedReader(new InputStreamReader(f));
			String traverse = null;
			while((traverse = b.readLine()) != null){
				line += traverse;
			}
			String[] words = line.split("\\s+");
			count = words.length;
			System.out.println("words : " + count);
			b.close();
		} catch(FileNotFoundException e){
			System.out.println("file not found");
		} catch(IOException e){
			System.out.println("io exception");
		}
	}
	
	public void numOfLines(String path){
		File file = new File(path);
		int count = 0;
		try{
			FileInputStream f = new FileInputStream(file);
			BufferedReader b = new BufferedReader(new InputStreamReader(f));
			String line = null;
			while((line = b.readLine()) != null){
				count++;
			}
			b.close();
		} catch(FileNotFoundException e){
			System.out.println("file not found");
		} catch(IOException e){
			System.out.println("io exception");
		}
		System.out.println("lines : " + count);
	}
	
	public void reverseNum(int num){
		if(num < 10){
			System.out.println(num);
		} else{
			System.out.print(num % 10);
			reverseNum(num / 10);
		}
	}
	
	public void writeVertical(int num){
		if(num < 10){
			System.out.println(num);
		} else{
			writeVertical(num / 10);
			System.out.println(num % 10);
		}
	}
	
	public int gcd(int num1, int num2){
		if(num1 % num2 == 0)
			return num2;
		else
			return gcd(num2, num1 % num2);
	}
	
	public int fib(int num){
		if(num == 0)
			return 0;
		else if(num == 1)
			return 1;
		else
			// fib formula
			return fib(num - 1) + fib(num - 2);
	}
	
	public boolean isPal(String str){
		if(str.length() == 1)
			return true;
		else if(str.charAt(0) == str.charAt(str.length() - 1))
			// decrease the size of the string and pass it again
			return isPal(str.substring(1, str.length() - 1));
		return false;
	}
	
	public int fact(int num){
		if(num == 0)
			return 1;
		return num * fact(num - 1);
	}
	
	public int power(int num, int exp){
		if(exp > 1)
			return num * power(num, exp - 1);
		else
			return num;
	}
	
	public void message(int num){
		if(num > 0){
			System.out.println("This is a recursive method");
			message(num - 1);
		}
	}
	
	public int stairs(int x){
		for(int i = 0; i < x; i++){
			for(int j = 0; j < x; j++){
			}
		}
		return x;
	}
	
	public int[] bubbleSort(int[] a){
		int n = a.length;
		for(int i = 0; i < n - 1; i++){
			for(int j = 0; j < n - i - 1; j++){
				if(a[j] > a[j + 1]){
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
		return a;
	}
	
	public int[] quickSort(int[] a, int first, int last){
		if(first < last){
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(a, first, last);
			// Recursively sort elements before
			// partition and after partition
			quickSort(a, first, pi - 1);
			quickSort(a, pi + 1, last);
		}
		return a;
	}
	
	public int partition(int[] a, int first, int last){
		int pivot = a[last];
		int i = (first - 1); // index of smaller element
		for(int j = first; j < last; j++){
			// If current element is smaller than or
			// equal to pivot
			if(a[j] <= pivot){
				i++;
				// swap arr[i] and arr[j]
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		// swap arr[i+1] and arr[high] (or pivot)
		int tmp = a[i + 1];
		a[i + 1] = a[last];
		a[last] = tmp;
		return i + 1;
	}
	
	public int[] reverseIntArray(int arr[]){
		for(int i = 0; i < arr.length / 2; i++){
			int tmp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = tmp;
		}
		return arr;
	}
	
	public String reverseString(String str){
		String newStr = "";
		for(int i = (str.length() - 1); i >= 0; i--){
			System.out.println(str.charAt(i));
			newStr += str.charAt(i);
		}
		return newStr;
	}
	
	public int[] largestThreeNums(int[] a){
		int i, first, second, third;
		if(a.length < 3)
			return null;
		third = first = second = Integer.MIN_VALUE;
		for(i = 0; i < a.length; i++){
			/*
			 * If current element is smaller than first
			 */
			if(a[i] > first){
				third = second;
				second = first;
				first = a[i];
			}
			/*
			 * If arr[i] is in between first and second then update second
			 */
			else if(a[i] > second){
				third = second;
				second = a[i];
			} else if(a[i] > third)
				third = a[i];
		}
		int[] tmp = new int[] {first, second, third};
		System.out.println("Three largest elements are " + first + " " + second + " " + third);
		return tmp;
	}
	
	public boolean isPrime(int num){
		if(num < 2)
			return false;
		int count = 0;
		for(int i = 1; i < num; i++){
			if(num % i == 0)
				count++;
		}
		return count < 2;
	}
	
	public int findMissingNum(int[] A){
		int missingNum = 0;
		if(A.length == 1){
			if(A[0] == 1){
				missingNum = 2;
			} else{
				missingNum = 1;
			}
			return missingNum;
		}
		A = mergeSort(A);
		if((A[0] > 1) || (A[A.length - 1] < 1)){
			return 1;
		}
		missingNum = A[0];
		Boolean isMissing = false;
		for(int i = 1; i < A.length; i++){
			if(A[i] > 0 && A[i - 1] < 0){
				missingNum = 1;
				isMissing = true;
				break;
			} else{
				int tmp = A[i] - A[i - 1];
				if(tmp > 1){
					if(A[i - 1] < 1){
						missingNum = 1;
					} else{
						missingNum = (++A[i - 1]);
					}
					isMissing = true;
					break;
				}
			}
		}
		if(!isMissing){
			missingNum = A[(A.length - 1)] + 1;
		} else if(missingNum < 1){
			missingNum = 1;
		}
		return missingNum;
	}
	
	public int[] mergeSort(int[] input){
		int N = input.length;
		if(N <= 1)
			return input;
		int[] a = new int[N / 2];
		int[] b = new int[N - N / 2];
		for(int i = 0; i < a.length; i++)
			a[i] = input[i];
		for(int i = 0; i < b.length; i++)
			b[i] = input[i + N / 2];
		return merge(mergeSort(a), mergeSort(b));
	}
	
	public int[] merge(int[] a, int[] b){
		int[] c = new int[a.length + b.length];
		int i = 0, j = 0;
		for(int k = 0; k < c.length; k++){
			if(i >= a.length)
				c[k] = b[j++];
			else if(j >= b.length)
				c[k] = a[i++];
			else if(a[i] <= b[j])
				c[k] = a[i++];
			else
				c[k] = b[j++];
		}
		return c;
	}
}
