// Take as input a 2-d array. Print the 2-D array in spiral form anti-clockwise.

// Input Format
// Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).

// Constraints
// Both M and N are between 1 to 10.

// Output Format
// All M * N integers separated by commas with 'END' written in the end(as shown in example).

// Sample Input
// 4 4
// 11 12 13 14
// 21 22 23 24
// 31 32 33 34
// 41 42 43 44
// Sample Output
// 11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23, END
// Explanation
// For spiral level anti-clockwise traversal, Go for first column-> last row ->last column-> first row and then do the same traversal for the remaining matrix .

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
		int i, k = 0, l = 0;
 
    /* k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator */
 
        // initialize the count
        int cnt = 0;
 
        // total number of
        // elements in matrix
        int total = row* col;
 
        while (k < row && l < col)
        {
            if (cnt == total)
                break;
 
            // Print the first column
            // from the remaining columns
            for (i = k; i < row; ++i)
            {
                System.out.print(arr[i][l] + ", ");
                cnt++;
            }
            l++;
 
            if (cnt == total)
                break;
 
            // Print the last row from
            // the remaining rows
            for (i = l; i < col; ++i)
            {
                System.out.print(arr[row - 1][i] + ", ");
                cnt++;
            }
            row--;
 
            if (cnt == total)
                break;
 
            // Print the last column
            // from the remaining columns
            if (k < row)
            {
                for (i = row - 1; i >= k; --i)
                {
                    System.out.print(arr[i][col - 1] + ", ");
                    cnt++;
                }
                col--;
            }
 
            if (cnt == total)
                break;
 
            // Print the first row
            // from the remaining rows
            if (l < col)
            {
                for (i = col - 1; i >= l; --i)
                {
                    System.out.print(arr[k][i] + ", ");
                    cnt++;
                }
                k++;
            }
        }
		System.out.print("END");

    }
}
