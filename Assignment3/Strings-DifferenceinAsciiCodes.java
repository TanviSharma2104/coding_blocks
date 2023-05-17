// Take as input S, a string. Write a program that inserts between each pair of characters the difference between their ascii codes and print the ans.

// Input Format
// String

// Constraints
// Length of String should be between 2 to 1000.

// Output Format
// String

// Sample Input
// acb
// Sample Output
// a2c-1b
// Explanation
// For the sample case, the Ascii code of a=97 and c=99 ,the difference between c and a is 2.Similarly ,the Ascii code of b=98 and c=99 and their difference is -1. So the ans is a2c-1b.



import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans="";
		for(int i=0;i<s.length()-1;i++){
			char ch1=s.charAt(i);
			char ch2=s.charAt(i+1);
			int a=(int)ch1;
			int b=(int)ch2;
			String diff=Integer.toString(b-a);
			
			ans=ans+""+ch1+""+diff;
		}
		ans=ans+""+s.charAt(s.length()-1);
		System.out.println(ans);
    }
}
