// Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2d1s1.

// Input Format
// A single String S

// Constraints
// 1 < = length of String < = 1000

// Output Format
// The compressed String.

// Sample Input
// aaabbccds
// Sample Output
// a3b2c2d1s1
// Explanation
// In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' is repeated twice and 'd and 's' occurred only once.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String a=""+s.charAt(0);
        int c=1;
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                c++;
            }
            else{
                a=a+c+s.charAt(i);
                c=1;
            }
        }
        a+=c;
        System.out.print(a);
    }
}
