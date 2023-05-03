// Take as input a two-d array. Wave print it row-wise.

// Input Format
// Two integers M(row) and N(column) and further M * N integers(2-d array numbers).

// Constraints
// Both M and N are between 1 to 10.

// Output Format
// All M * N integers are seperated by commas with 'END' written in the end(as shown in example).

// Sample Input
// 4 4
// 11 12 13 14
// 21 22 23 24
// 31 32 33 34
// 41 42 43 44
// Sample Output
// 11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 4

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int a=sc.nextInt();
                arr[i][j]=a;

            }
        }

		for(int i=0;i<row;i++){
            if(i%2==0){
                int j=0;
                while(j<col){
                    System.out.print(arr[i][j]+", ");
                    j++;
                }
            }
            else{
                int j=col-1;
                while(j>=0){
                    System.out.print(arr[i][j]+", ");
                    j--;
                }
            }
               
            //System.out.println();
        }
		System.out.print("END");
    }
}
