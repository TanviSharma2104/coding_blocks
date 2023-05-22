// Deepak and Gautam are having a discussion on a new type of number that they call Coding Blocks Number or CB Number. They use following criteria to define a CB Number.

// 1. 0 and 1 are not a CB number.
// 2. 2,3,5,7,11,13,17,19,23,29 are CB numbers.
// 3. Any number not divisible by the numbers in point 2( Given above) are also CB numbers.

// Deepak said he loved CB numbers.Hearing it, Gautam throws a challenge to him.

// Gautam will give Deepak a string of digits. Deepak's task is to find the number of CB numbers in the string.

// CB number once detected should not be sub-string or super-string of any other CB number.
// Ex- In 4991, both 499 and 991 are CB numbers but you can choose either 499 or 991, not both.

// Further, the CB number formed can only be a sub-string of the string.
// Ex - In 481, you can not take 41 as CB number because 41 is not a sub-string of 481.

// As there can be multiple solutions, Gautam asks Deepak to find the maximum number of CB numbers that can be formed from the given string.

// Deepak has to take class of Launchpad students. Help him by solving Gautam's challenge.

// Input Format
// First line contain size of the string.

// Next line is A string of digits.

// Constraints
// 1 <= Length of strings of digits <= 17

// Output Format
// Maximum number of CB numbers that can be formed.

// Sample Input
// 5
// 81615
// Sample Output
// 2
// Explanation
// 61 and 5 are two CB numbers.



import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int cnt = 0;
		boolean[] visi = new boolean[n];
		for(int i=1;i<=n;i++){
			for(int j = i;j<=n;j++){
				int t = j - i;
				String ch = s.substring(t,j);
				if(sol(ch) && valid(visi,t,j-1)) {
					cnt++;
					for(int k = t;k<j;k++) visi[k] = true;
				}
			}
		}
		System.out.print(cnt);
    }
	public static boolean sol(String s){
		long t = Long.parseLong(s);
		if(t==0 || t==1) return false;
		if(t==2 || t==3 || t==5 || t==7 || t==11 || t==13 || t==17 || t==19 || t==23 || t==29) return true;
		if(t%2==0 || t%3==0 || t%5==0 || t%7==0 || t%11==0 || t%13==0 || t%17==0 || t%19==0 || t%23==0 || t%29==0) return false;
		return true;
	}
	public static boolean valid(boolean[] visi,int i,int j){
		for(int k = i;k<=j;k++) if(visi[k]) return false;
		return true;
	}
}
