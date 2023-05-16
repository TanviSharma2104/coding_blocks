//Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned.

// Input Format
// String

// Constraints
// A string of length between 1 to 1000

// Output Format
// String

// Sample Input
// aabccba
// Sample Output
// abcba
// Explanation
// For the given example, "aabccba", Consecutive Occurrence of a is 2, b is 1, and c is 2.

// After removing all of the consecutive occurences, the Final ans will be : - "abcba".

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = removeConsecutiveDuplicates(s);
        System.out.println(ans);
	
    }
	public static String removeConsecutiveDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char currentChar = str.charAt(i);

            // Append the current character if it's the first character or different from the previous character
            if (i == 0 || currentChar != str.charAt(i - 1)) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
