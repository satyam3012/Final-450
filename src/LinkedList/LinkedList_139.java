package LinkedList;

public class LinkedList_139 {
	static Node head;
	
	public static Node reverse(Node node) {
		Node prev = null;
		Node curr = node;
		Node next = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_139 ll = new LinkedList_139();
		ll.head = new Node(1);
		ll.head.next = new Node(2);
		ll.head.next.next = new Node(3);
		ll.head.next.next.next = new Node(4);
		
		System.out.print("List : ");
		Node.print(head);
		
		System.out.println();
		
		System.out.print("Reversed list : ");
		ll.head = reverse(head);
		
		Node.print(head);

	}

}
