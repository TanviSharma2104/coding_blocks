// A Good String is a string which contains only vowels (a,e,i,o,u) . Given a string S, print a single positive integer N where N is the length of the longest substring of S that is also a Good String.

// Note: The time limit for this problem is 1 second, so you need to be clever in how you compute the substrings.

// Input Format
// A string 'S'

// Constraints
// Length of string < 10^5

// Output Format
// A single positive integer N, where N is the length of the longest sub-string of S that is also a Good String.

// Sample Input
// cbaeicde
// Sample Output
// 3
// Explanation
// Longest good substring is "aei"


import java.util.*;
public class Main {

	static boolean isVowel(char c)
    {
        return (c == 'a' || c == 'e' || c == 'i'
                 || c == 'o' || c == 'u');
    }

    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count = 0, res = 0;
        char[] s = str.toCharArray();
         
        for (int i = 0; i < s.length; i++)
        {
 
            // Increment current count
            // if s[i] is vowel
            if (isVowel(s[i]))
            count++;    
 
            else
            {
                // check previous value
                // is greater then or not
                res = Math.max(res, count);
 
                count = 0;
            }
		}
			System.out.println(Math.max(res, count));
		
    }
}
