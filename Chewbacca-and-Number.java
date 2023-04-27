// Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.

// Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.

// Input Format
// The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.

// Constraints
// x <= 100000000000000000

// Output Format
// Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.

// Sample Input
// 4545
// Sample Output
// 4444
// Explanation
// There are many numbers form after inverting the digit. For minimum number, check if inverting digit is less than or greater than the original digit. If it is less, then invert it otherwise leave it.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		long m=sc.nextLong();
		long d=0;
		long rev=0;
		//long ans=0;
		long n=0;
		
		while(m!=0){
			d=m%10;
			n=n*10+d;
			m=m/10;
		}
		// while(n%10==9){
		// 	n=n/10;
		// }
		int flag=0;
		while(n>0){
			d=n%10;
			// if(d>=5 && d<=9){
			// 	d=9-d;
			// }
			long d1=9-d;
			if(d==9 && flag==0){
				d=9;
				flag=1;
			}
			else{
			//long d1=9-d;
			if(d1<d){
				d=d1;
				
				
			}}
			
			rev=rev*10+d;
			n/=10;
			
		}
		
		System.out.print(rev);
    }
}
