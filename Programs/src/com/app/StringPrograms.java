package com.app;

import java.io.IOException;
import java.util.HashSet;

public class StringPrograms {
public  static void main(String[] args) {
	
	
/*	Java Programming Interview Question 1 Answer and Explanation
	The given statements output will be “false” because in java + operator precedence is more than == operator. So the given expression will be evaluated to “s1 == s2 is:abc” == “abc” i.e false.
*/	
	//false
	/*String s1 = "abc";
	String s2 = "abc";
	*/
	
	
	
	
	//false
	/*String s1 = new String("abc");
	String s2 = new String("abc");
	System.out.println("s1 == s2 is:" + s1 == s2);*/
	
	
	/*The given statements output will be “ourn”. First character will be automatically type caste to int. After that since in java first character index is 0, so it will start from ‘o’ and print till ‘n’. Note that in String substring function it leaves the end index.*/
	
	
	//orun
	/*String s3 = "JournalDev";
	int start = 1;
	char end = 5;
	System.out.println(start + end);
	System.out.println(s3.substring(start, end));*/
	
	/*The size of the shortSet will be 100. Java Autoboxing feature has been introduced in JDK 5, so while adding the short to HashSet<Short> it will automatically convert it to Short object. Now “i-1” will be converted to int while evaluation and after that it will autoboxed to Integer object but there are no Integer object in the HashSet, so it will not remove anything from the HashSet and finally its size will be 100.*/
	
	//100
/*	HashSet shortSet = new HashSet();
	for (short i = 0; i < 100; i++) {
		shortSet.add(i);
		shortSet.remove(i - 1);
	}
	System.out.println(shortSet.size());*/
	
	
	/*The finally block will never be reached here. If flag will be TRUE, it will go into an infinite loop and if its false its exiting the JVM. So finally block will never be reached here.*/
	//nothing print
	
/*	boolean flag = false;
	try {
		if (flag) {
			while (true) {
			}
		} else {
			System.exit(1);
		}
	} finally {
		System.out.println("In Finally");
	}
	*/
	
	
	/*The given print statement will throw java.lang.NullPointerException because while evaluating the OR logical operator it will first evaluate both the literals and since str is null, .equals() method will throw exception. Its always advisable to use short circuit logical operators i.e “||” and “&&” which evaluates the literals values from left and since the first literal will return true, it will skip the second literal evaluation.*/
	
	
	/*Exception in thread "main" java.lang.NullPointerException
	at com.app.StringPrograms.main(StringPrograms.java:49)*/
	/*String str = null;
	String str1="abc";
	System.out.println(str1.equals("abc") | str.equals(null));*/
	
/*	Exception in thread "main" java.lang.NullPointerException
	at com.app.StringPrograms.main(StringPrograms.java:51)
*/
	
	/*Java Programming Interview Question 6 Answer and Explanation
	The statements will print abc. Notice that x.concat(y); will create a new string but it’s not assigned to x, so value of x is not changed.*/
	
	/*
	String x = "abc";
	String y = "abc";
	x.concat(y);
	System.out.print(x);
	*/
	
	
	
/*	This is a tricky question, it looks like the test is about the order of execution of the mathematical operators and syntax of main method will get overlooked. It will produce Runtime error because main method is not static, something like below.

	Copy
	pankaj:bin pankaj$ java MathTest
	Error: Main method is not static in class MathTest, please define the main method as:
	   public static void main(String[] args)*/
	/*Error: Main method is not static in class com.app.StringPrograms, please define the main method as:
		   public static void main(String[] args)*/
/*	int x = 10*10-10;
	
	System.out.println(x);*/
	
	
	
	/*No, it won’t print Hello. It will be a compile time error as The exception IOException is already caught by the alternative Exception.*/
//compiletime error	
	/*try {
		throw new IOException("Hello");
	}catch(IOException | Exception e) {
		System.out.println(e.getMessage());
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
