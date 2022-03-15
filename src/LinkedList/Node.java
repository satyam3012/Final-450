package LinkedList;

public class Node {
	int data;
	Node next;
	
	Node(int d) {
		data = d;
		next = null;
	}
	
	public static void print(Node head) {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

}
