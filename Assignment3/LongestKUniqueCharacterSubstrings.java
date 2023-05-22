// Jeetu Bhaiya has given you a string and you to print the size of the longest possible substring that has exactly k unique characters.
// If there is no possible substring then print -1.

// Input Format
// The first line of input contains an integer T denoting the no of test cases. Each test case contains two lines. The first line of each test case contains a string s and the next line contains an integer k.

// Constraints
// 1<=T<=100
// 1<=k<=10

// Output Format
// For each test case in a new line print the required output.

// Sample Input
// 2
// aaaa
// 1
// qmb
// 6
// Sample Output
// 4
// -1
  
  import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int longestKUnique(String s, int k) {
        int n = s.length();
        if (k > n) {
            return -1;
        }
        HashMap<Character, Integer> freq = new HashMap<>();
        int maxLen = 0;
        int start = 0;
        for (int end = 0; end < n; end++) {
            char c = s.charAt(end);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            while (freq.size() > k) {
                char startChar = s.charAt(start);
                freq.put(startChar, freq.get(startChar) - 1);
                if (freq.get(startChar) == 0) {
                    freq.remove(startChar);
                }
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            String s = sc.next();
            int k = sc.nextInt();
            System.out.println(longestKUnique(s, k));
        }
    }
}
