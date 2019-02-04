package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StringRelatedPrograms {
	
public static void main(String[] args) {
/*    private static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        
        return strBuilder.toString().equals(str);
        
    }*/
	
	
/*	 private static boolean isPalindromeString(String str) {
	        if (str == null)
	            return false;
	        int length = str.length();
	        System.out.println(length / 2);
	        for (int i = 0; i < length / 2; i++) {

	            if (str.charAt(i) != str.charAt(length - i - 1))
	                return false;
	        }
	        return true;
	    }*/
	
	
	
	/*How to convert String to char and vice versa?*/
	
//System.out.println("first line");	
	
/*	
String str = "journaldev";
//string to char array
char[] chars = str.toCharArray();
System.out.println(chars.length);

//char at specific index
char c = str.charAt(2);
System.out.println(c);

//Copy string characters to char array
char[] chars1 = new char[7];
str.getChars(0, 7, chars1, 0);
System.out.println(chars1);
	*/


/*String to byte array*/
/*
String str = "abcdjournaldev";
byte[] b=str.getBytes();
System.out.println("String to byte Array"+Arrays.toString(b));
*/
System.out.println("first line");




//The string is immutable and final in Java
//StringBuffer operations are thread-safe and synchronized where StringBuilder operations are not thread-safe. 
//So in a multi-threaded environment, we should use StringBuffer but in the single-threaded environment, we should use StringBuilder.
//StringBuilder performance is fast than StringBuffer because of no overhead of synchronization.

/*String vs StringBuffer vs StringBuilder
string vs stringbuffer vs stringbuilder
String is one of the most widely used class in java programming and one of the most important topic in core java interview. If you are writing a program which prints something on console, we use String.

This tutorial is aimed to focus on major features of String class and then we will compare String vs StringBuffer vs StringBuilder.

String in Java
String class represents character strings, we can instantiate String by two ways.
String str = "abc"; or String str = new String ("abc");
String is immutable in java, so its easy to share it across different threads or functions.
When we create a String using double quotes, it first looks for the String with same value in the JVM string pool, if found it returns the reference else it creates the String object and then place it in the String pool. This way JVM saves a lot of space by using same String in different threads. But if new operator is used, it explicitly creates a new String in the heap memory.
+ operator is overloaded for String and used to concatenate two Strings. Although internally it uses StringBuffer to perform this action.
String overrides equals() and hashCode() methods, two Strings are equal only if they have same characters in same order. Note that equals() method is case sensitive, so if you are not looking for case sensitive checks, you should use equalsIgnoreCase() method.
A String represents a string in the UTF-16 format
String is a final class with all the fields as final except “private int hash”. This field contains the hashCode() function value and created only when hashCode() method is called and then cached in this field. Furthermore, hash is generated using final fields of String class with some calculations, so every time hashCode() method is called, it will result in same output. For caller, its like calculations are happening every time but internally it’s cached in hash field.
String vs StringBuffer
Since String is immutable in java, whenever we do String manipulation like concat, substring etc, it generates a new String and discard the older String for garbage collection.


These are heavy operations and generate a lot of garbage in heap. So Java has provided StringBuffer and StringBuilder class that should be used for String manipulation.

StringBuffer and StringBuilder are mutable objects in java and provide append(), insert(), delete() and substring() methods for String manipulation.


StringBuffer vs StringBuilder
StringBuffer was the only choice for String manipulation till Java 1.4 but it has one disadvantage that all of its public methods are synchronized. StringBuffer provides Thread safety but on a performance cost.

In most of the scenarios, we don’t use String in multithreaded environment, so Java 1.5 introduced a new class StringBuilder that is similar with StringBuffer except thread safety and synchronization.

So if you are in a single threaded environment or don’t care about thread safety, you should use StringBuilder else use StringBuffer. See this post for performance benchmarking between StringBuffer and StringBuilder.

String vs StringBuffer vs StringBuilder
String is immutable whereas StringBuffer and StringBuider are mutable classes.
StringBuffer is thread safe and synchronized whereas StringBuilder is not, thats why StringBuilder is more faster than StringBuffer.
String concat + operator internally uses StringBuffer or StringBuilder class.
For String manipulations in non-multi threaded environment, we should use StringBuilder else use StringBuffer class.
That’s all for a quick roundup of difference between String vs StringBuffer vs StringBuilder. In most of the scenarios for string manipulation, StringBuilder is better suited than StringBuffer.

*/



/*Why String is immutable or final in Java
There are several benefits of String because it’s immutable and final.

String Pool is possible because String is immutable in java.
It increases security because any hacker can’t change its value and it’s used for storing sensitive information such as database username, password etc.
Since String is immutable, it’s safe to use in multi-threading and we don’t need any synchronization.
Strings are used in java classloader and immutability provides security that correct class is getting loaded by Classloader.


*/




/*How to Split String in java?
We can use split(String regex) to split the String into String array based on the provided regular expression.
Learn more at java String split.
*/
//[, bc, , d] OUTPUT
/*String s = "abcaada";
System.out.println(Arrays.toString(s.split("a")));
*/
/*

String s = "Pankaj NewYork USA";
String[] data = s.split(" ", 3);
System.out.println("Name = "+data[0]); //Pankaj
System.out.println("Address = "+data[1]); //New York,USA
System.out.println("Address = "+data[2]); //USA

System.out.println(data[2]+" "+data[1]+" "+data[0]);*/



/**
 * Java String split example
 * 
 * @param args
 */

	/*String line = "I am a java developer";

	String[] words = line.split(" ");

	String[] twoWords = line.split(" ", 2);

	System.out.println("String split with delimiter: " + Arrays.toString(words));

	System.out.println("String split into two: " + Arrays.toString(twoWords));

	// split string delimited with special characters
	String wordsWithNumbers = "I|am|a|java|developer";

	String[] numbers = wordsWithNumbers.split("\\|");

	System.out.println("String split with special character: " + Arrays.toString(numbers));
*/






/*String s1 = "abc";
String s2 = "abc";

String s3= new String("abc");  //heap
String s4= new String("abc");
System.out.println("s3 == s4 ? "+(s3==s4)); //false
System.out.println("s3 equals s4 ? "+(s3.equals(s4))); //true
System.out.println("s1 == s3 ? "+(s1==s3)); //false
System.out.println("s3 equals s4 ? "+(s3==s4)); //true
System.out.println("s1 == s2 ? "+(s1.equals(s2))); //true
*/

/*
String s3= new String("abc");  //heap
String s4= new String("abc");
String s5=s4.intern();
String s6=s3.intern();
System.out.println("s3 == s4 ? "+(s5.equals(s6))); //true
*/


/*ArrayList list=new ArrayList<>();
list.add(11);
list.add(12);
list.add(13);
list.add(14);
list.add(15);
list.add(16);System.out.println(list);


Iterator itr=list.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
	
}
*/






}
}
