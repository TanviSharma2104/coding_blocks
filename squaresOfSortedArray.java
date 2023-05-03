// You are very fond of finding squares of a number. You want to sort an integer array after finding squares of each number.

// You are given an integer array nums sorted in non-decreasing order, print an array of the squares of each number sorted in non-decreasing order.

// Input Format
// First Line contains an integer N (size of the array) .
// Second Line contains an integer array.

// Constraints
// 1 <= N <= 104
// -104 <= Nums[i] <= 104
// Output Format
// print squared-sorted array.

// Sample Input
// 5 
// -3 -2 0 1 4 
// Sample Output
// 0 1 4 9 16 
// Explanation
// Sorted array : 0 1 4 9 16

import java.util.*;
public class Main {


    public static int[] sortedSquares(int[] nums) {
        //Write your code here
        int n1=nums.length;
        for(int i=0;i<n1-1;i++){
            for(int j=i+1;j<n1;j++){
                if(nums[j]<nums[i]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;

                }
            }
        }
        return nums;
    }




    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int c=sc.nextInt();

        
            arr[i] = c*c;
        }

        arr = sortedSquares(arr);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
