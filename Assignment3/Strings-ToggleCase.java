// Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned.

// Input Format
// String

// Constraints
// Length of string should be between 1 to 1000.

// Output Format
// String

// Sample Input
// abC
// Sample Output
// ABc
// Explanation
// Toggle Case means to change UpperCase character to LowerCase character and vice-versa.


import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans="";
		for(int i=0;i<s.length();i++){
			char a=s.charAt(i);
			if(Character.isUpperCase(a)){
				ans=ans+""+Character.toLowerCase(a);

			}
			else if(Character.isLowerCase(a)){
				ans=ans+""+Character.toUpperCase(a);
			}

		}
		System.out.print(ans);
    }
}
