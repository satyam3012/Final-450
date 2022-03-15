package LinkedList;
import java.util.*;

public class LinkedList_156 {
	Node head;
	static Stack<Integer> stack = new Stack<>();
	
	public static boolean isPalindrome(Node head) {
		Node temp = head;
		while(head != null) {
			stack.push(head.data);
			head = head.next;
		}
		
		while(temp != null) {
			int top = stack.pop();
			if(temp.data != top)
				return false;
			
			temp = temp.next;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_156 ll = new LinkedList_156();
		ll.head = new Node(1);
		ll.head.next = new Node(3);
		ll.head.next.next = new Node(3);
		ll.head.next.next.next = new Node(1);
		
		Node.print(ll.head);
		
		
		System.out.println(isPalindrome(ll.head));
		

	}

}
