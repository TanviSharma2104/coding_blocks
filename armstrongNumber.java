// Take the following as input.

// A number (N1)
// A number (N2)
// Write a function which prints all armstrong numbers between N1 and N2 (inclusive).

// 371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

// Input Format
// Constraints
// 0 < N1 < 100 N1 < N2 < 10000

// Output Format
// Sample Input
// 400
// 1000
// Sample Output
// 407
// Explanation
// Each number in output is in separate line.

import java.util.*;
public class Main {
	public static int armstrong(int n){
		int d=0;
		int m=n;
		int ans=0;
		while(n>0){
			d=n%10;
			ans=ans+(d*d*d);
			n=n/10;
		}
		if(ans==m){
			return 1;
		}
		else{
			return 0;
		}

	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;i<=n2;i++){
			int c=armstrong(i);

			if(c==1){
				System.out.println(i);
			}
		}
    }
}
