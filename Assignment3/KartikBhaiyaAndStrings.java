// Kartik Bhaiya has a string consisting of only 'a' and 'b' as the characters. Kartik Bhaiya describes perfectness of a string as the maximum length substring of equal characters. Kartik Bhaiya is given a number k which denotes the maximum number of characters he can change. Find the maximum perfectness he can generate by changing no more than k characters.

// Input Format
// The first line contains an integer denoting the value of K. The next line contains a string having only ‘a’ and ‘b’ as the characters.

// Constraints
// 2 ≤ N ≤ 10^6

// Output Format
// A single integer denoting the maximum perfectness achievable.

// Sample Input
// 2
// abba
// Sample Output
// 4
// Explanation
// We can swap the a's to b using the 2 swaps and obtain the string "bbbb". This would have all the b's and hence the answer 4.
// Alternatively, we can also swap the b's to make "aaaa". The final answer remains the same for both cases.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        //System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        int maxPerfectness = findMaxPerfectness(k, str);
        System.out.println(maxPerfectness);

        scanner.close();
    }

    private static int findMaxPerfectness(int k, String str) {
        int n = str.length();
        int[] count = new int[2];
        int left = 0, maxPerfectness = 0, maxCount = 0;

        for (int right = 0; right < n; right++) {
            count[str.charAt(right) - 'a']++;

            maxCount = Math.max(maxCount, Math.max(count[0], count[1]));

            if ((right - left + 1) - maxCount > k) {
                count[str.charAt(left) - 'a']--;
                left++;
            }

            maxPerfectness = Math.max(maxPerfectness, right - left + 1);
        }

        return maxPerfectness;
    }
}
