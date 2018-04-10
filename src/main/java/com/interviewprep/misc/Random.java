package com.interviewprep.misc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Random {
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
}
