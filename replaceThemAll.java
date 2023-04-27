// Given a integer as a input and replace all the '0' with '5' in the integer

// Input Format
// Enter an integer n

// Constraints
// 0<=n<=1000000000000

// Output Format
// All zeroes are replaced with 5

// Sample Input
// 102
// Sample Output
// 152
// Explanation
// Check each digit , if it is nonzero, then no change required but if it is zero then replace it by 5.

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long rev=0;
		long d=0;
		long ans=0;
		if(n==0){
			ans=5;
		}
		else{
			//int d=0;
			while(n>0){
				
				d=n%10;
				if(d==0){
					d=5;
				}
				rev=rev*10+d;
				n=n/10;

			}
		
			while(rev>0){
				d=rev%10;
				ans=ans*10+d;
				rev=rev/10;
			}
		}
		System.out.print(ans);

    }
}
