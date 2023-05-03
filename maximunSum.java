// You are provided two sorted arrays. You need to find the maximum length of bitonic subsequence. You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. You can switch from one array to another array only at common elements.

// Input Format
// First line contains integer t which is number of test case. For each test case, it contains two integers n and m which is the size of arrays and next two lines contains n and m space separated integers respectively.

// Constraints
// 1<=t<=100 1<=n,m<=100000

// Output Format
// Print the maximum path.

// Sample Input
// 1
// 8 8
// 2 3 7 10 12 15 30 34
// 1 5 7 8 10 15 16 19
// Sample Output
// 122
// Explanation
// 122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int[] arr1=new int[n];
			int[] arr2=new int[m];
			for(int j=0;j<n;j++){
				arr1[j]=sc.nextInt();
			}
			for(int j=0;j<m;j++){
				arr2[j]=sc.nextInt();
			}
			int sum1=0;
			int sum2=0;
			int l=0,k=0;
			int ans=0;
			while(l<n && k<m){
				if(arr1[l]<arr2[k]){
					sum1+=arr1[l];
					l++;
				}
				else if(arr1[l]>arr2[k]){
					sum2+=arr2[k];
					k++;
				}
				else if(arr1[l]==arr2[k]){
					ans+=Math.max(sum1,sum2)+arr1[l];
					sum1=0;
					sum2=0;
					l++;
					k++;
				}
			}
			while(l<n){
				sum1+=arr1[l];
				l++;
			}
			while(k<m){
				sum2+=arr2[k];
				k++;
			}
			ans+=Math.max(sum1,sum2);
			System.out.println(ans);
		}

    }
}
