// You are given two integers n and k. Find the greatest integer x, such that, x^k <= n.

// Input Format
// First line contains number of test cases, T. Next T lines contains integers, n and k.

// Constraints
// 1<=T<=10
// 1<=N<=10^15
// 1<=K<=10^4

// Output Format
// Output the integer x

// Sample Input
// 2
// 10000 1
// 1000000000000000 10
// Sample Output
// 10000
// 31
// Explanation
// For the first test case, for x=10000, 10000^1=10000=n

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++){
			long n=sc.nextLong();
			long k=sc.nextLong();
			long ans=0;
			long s=1,e=n;
			while(s<=e){
				long mid=(s+e)/2;
				if(Math.pow(mid,k)<=n){
					ans=mid;
					s=mid+1;
				}
				else{
					e=mid-1;
				}
			}
			// for(int j=1;j<=n;j++){
			// 	int a=(int)Math.pow(j,k);
			// 	if(a<=n){
			// 		ans=j;
			// 	}
			// }
			System.out.println(ans);
		}
    }
}
