// Sort just 0 and 1

// Input Format
// A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space

// Constraints
// N will not exceed 10^7

// Output Format
// Sorted Sequence

// Sample Input
// 7
// 1 0 0 1 1 0 1
// Sample Output
// 0 0 0 1 1 1 1

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int no0=0;
		int no1=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]==0){
				no0++;
			}
			else
			no1++;
		}
		for(int j=0;j<no0;j++){
			System.out.print("0 ");
		}
		for(int k=0;k<no1;k++){
			System.out.print("1 ");
		}

    }
}
