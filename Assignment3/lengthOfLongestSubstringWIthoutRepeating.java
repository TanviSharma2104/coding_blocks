// Given a string,
// find the length of the longest substring without repeating characters.
// For example , The longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
// For "bbbbb" the longest substring is "b", with the length of 1.

// Input Format
// Input the string.

// Constraints
// Output Format
// Output an integer i.e. the length of the longest substring without repeating characters.

// Sample Input
// abcabcbb
// Sample Output
// 3

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		System.out.print(LongestSubstring(str));

	}
	public static int LongestSubstring(String A)
	{
		// Complete the function
        
        int maxLength = 0;
        int[] charIndex = new int[256]; // Assuming ASCII characters

        Arrays.fill(charIndex, -1); // Initialize all characters' last index as -1
        int start = 0;

        for (int end = 0; end < A.length(); end++) {
            char ch = A.charAt(end);
            int chIndex = charIndex[ch];

            // If the character is seen before and its last occurrence is after the start index,
            // update the start index to the next position of its last occurrence
            if (chIndex != -1 && chIndex >= start) {
                start = chIndex + 1;
            }

            charIndex[ch] = end; // Update the last index of the character
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
	}

}
