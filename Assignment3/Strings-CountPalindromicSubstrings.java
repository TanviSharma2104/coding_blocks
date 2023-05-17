// Take as input S, a string. Write a program that gives the count of substrings of this string which are palindromes and Print the ans.

// Input Format
// Single line input containing a string

// Constraints
// Length of string is between 1 to 1000.

// Output Format
// Integer output showing the number of palindromic substrings.

// Sample Input
// abc
// Sample Output
// 3
// Explanation
// For the given sample case , the palindromic substrings of the string abc are "a","b" and "c".So, the ans is 3.


import java.util.*;
public class Main {
	public static boolean palindrome(String s1){
		StringBuilder str=new StringBuilder(s1);
		str.reverse();
		String s2=str.toString();
		if(s1.equals(s2)){
			return true;
		}
		return false;
	
	} 
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int c=0;
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length()+1;j++){
				String a=s.substring(i,j);
				if(palindrome(a)){
					c++;
				}
			}
		}
		System.out.println(c);

    }
}
