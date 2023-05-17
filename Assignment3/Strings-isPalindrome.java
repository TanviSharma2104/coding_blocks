// Take as input S, a string. Write a function that returns true if the string is a palindrome and false otherwise. Print the value returned.

// Input Format
// String

// Constraints
// String length between 1 to 1000 characters

// Output Format
// Boolean

// Sample Input
// abba
// Sample Output
// true
// Explanation
// A string is said to be palindrome if reverse of the string is same as string. For example, “abba” is palindrome as it's reverse is "abba", but “abbc” is not palindrome as it's reverse is "cbba".

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder str=new StringBuilder(s);
		str.reverse();
		String s2=str.toString();
		if(s.equals(s2)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		//return false;
    }
}
