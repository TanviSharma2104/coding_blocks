// Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.

// Input Format
// The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.

// Constraints
// Length of the arrays should be between 1 and 1000.

// Output Format
// Print all the pairs of numbers which sum to target. Print each pair in increasing order.

// Sample Input
// 5
// 1
// 3
// 4
// 2
// 5
// 5
// Sample Output
// 1 and 4
// 2 and 3
// Explanation
// Find any pair of elements in the array which has sum equal to target element and print them.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int i1=0,i2=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==m){
                    i1=arr[i];
                    i2=arr[j];
                    if(i1>i2){
                        System.out.println(i2+" and "+i1);
                    }
                    else{
                        System.out.println(i1+" and "+i2);
                    }
                }
            }
        }
    }
}
