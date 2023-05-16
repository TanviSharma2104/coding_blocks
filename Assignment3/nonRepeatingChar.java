// Given a string, find the first non-repeating character in it. For example, if the input string is “GeeksforGeeks”, then output should be ‘f’ and if input string is “GeeksQuiz”, then output should be ‘G’.

// Input Format
// The first line contains T denoting the number of testcases. Then follows description of testcases. Each case begins with a single integer N denoting the length of string. The next line contains the string S.

// Constraints
// String Length <100000

// Output Format
// For each testcase, print the first non repeating character present in string. Print -1 if there is no non repeating character.

// Sample Input
// 4
// codingblocks
// abbac
// java
// ccdd
// Sample Output
// d
// c
// j
// -1

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++){
			String s=sc.next();
			int flag=0;
			for(int i=0;i<s.length();i++){
				String a=""+s.charAt(i);
				int c=-1;
				for(int j=0;j<s.length();j++){
					String b=""+s.charAt(j);
					if(a.equals(b)){
						c++;
						if(c>0){
							a=" ";
							break;}
					}
				}
				if(!a.equals(" ")){
					System.out.println(a);
					flag=1;
					break;
				}
				// else{
				// 	System.out.print
				// }

			}
			if(flag==0){
				System.out.println("-1");
			}
		}
    }
}
