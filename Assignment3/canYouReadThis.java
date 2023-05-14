// One of the important aspect of object oriented programming is readability of the code. To enhance the readability of code, developers write function and variable names in Camel Case. You are given a string, S, written in Camel Case. FindAllTheWordsContainedInIt.

// Input Format
// A single line contains the string.

// Constraints
// |S|<=1000

// Output Format
// Print words present in the string, in the order in which it appears in the string.

// Sample Input
// IAmACompetitiveProgrammer
// Sample Output
// I
// Am
// A
// Competitive
// Programmer
// Explanation
// There are 5 words in the string.

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		//int c=0;
		String a=""+s.charAt(0);
		for(int i=1;i<s.length();i++){
			int ch=(int)s.charAt(i);
			if(ch>=65 && ch<=90){
				//c++;
				System.out.println(a);
				a="";
				// a+=s.charAt(i);
			}
			// else{
				a+=s.charAt(i);
			//}
		}
		System.out.println(a);
    }
}
