// Take as input a two-d array. Wave print it column-wise.

// Input Format
// Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).

// Constraints
// Both M and N are between 1 to 10.

// Output Format
// All M * N integers seperated by commas with 'END' wriiten in the end(as shown in example).

// Sample Input
// 4 4
// 11 12 13 14
// 21 22 23 24
// 31 32 33 34
// 41 42 43 44
// Sample Output
// 11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 1

import java.util.*;
public class Main {
    public static void main(String args[]) {

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

		for(int i=0;i<col;i++){
            if(i%2==0){
                int j=0;
                while(j<row){
                    System.out.print(arr[j][i]+", ");
                    j++;
                }
            }
            else{
                int j=row-1;
                while(j>=0){
                    System.out.print(arr[j][i]+", ");
                    j--;
                }
            }
               
            //System.out.println();
        }
		System.out.print("END");

    }
}
