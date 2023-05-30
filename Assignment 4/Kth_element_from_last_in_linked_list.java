// Given a linked list with n nodes. Find the kth element from last without computing the length of the linked list.

// Input Format
// First line contains space separated integers representing the node values of the linked list. The list ends when the input comes as '-1'. The next line contains a single integer k.

// Constraints
// n < 10^5

// Output Format
// Output a single line containing the node value at the kth element from last.

// Sample Input
// 1 2 3 4 5 6 -1
// 3
// Sample Output
// 4
// Explanation
// The linked list is 1 2 3 4 5 6. -1 is not included in the list. So the third element from the last is 4

import java.util.*;

public class Main {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public int findel(int index) {
        Node temp = head;
        int c = 1;
        while (c != index) {
            temp = temp.next;
            c++;
        }
        return temp.data;
    }

    public static void main(String args[]) {
        Main list = new Main();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int size = 0;
        while (a != -1) {
            list.add(a);
            size++;
            a = sc.nextInt();
        }
        int index = sc.nextInt();
        int element = list.findel(index);
        System.out.println(element);
    }
}
