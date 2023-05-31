// Implement a Queue using two stacks Make it Dequeue efficient.

// Input Format
// Enter the size of the queue N add 0 - N-1 numbers in the queue

// Constraints
// Output Format
// Display the numbers in the order they are dequeued and in a space separated manner

// Sample Input
// 5
// Sample Output
// 0 1 2 3 4

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Stack<Integer> st=new Stack<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n-1;i>=0;i--){
			st.push(i);
		}
		for(int i=0;i<n;i++){
			System.out.print(st.peek()+" ");
			st.pop();
		}

		

		
    }
}
