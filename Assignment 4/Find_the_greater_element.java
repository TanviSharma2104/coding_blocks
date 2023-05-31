// We are given a circular array, print the next greater number for every element. If it is not found print -1 for that number. To find the next greater number for element Ai , start from index i + 1 and go uptil the last index after which we start looking for the greater number from the starting index of the array since array is circular.

// Input Format
// First line contains the length of the array n. Second line contains the n space separated integers.

// Constraints
// 1 <= n <= 10^6
// -10^8 <= Ai <= 10^8 , 0<= i< n

// Output Format
// Print n space separated integers each representing the next greater element.

// Sample Input
// 3
// 1 2 3
// Sample Output
// 2 3 -1
// Explanation
// Next greater element for 1 is 2,
// for 2 is 3 but not present for 3 therefore -1

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		//LinkedList <Integer> list=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[2*n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			arr[i+n]=arr[i];
		}
		for(int i=0;i<n;i++){
			int flag=0;
			for(int j=i+1;j<2*n;j++){
				if(arr[j]>arr[i]){
					System.out.print(arr[j]+" ");
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.print("-1 ");
			}
			
		}
		

    }
}
