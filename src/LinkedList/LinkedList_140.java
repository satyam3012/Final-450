package LinkedList;

public class LinkedList_140 {
	static Node head;
	
	public static Node reverseGroup(Node head, int k) {
		if(head == null)
			return null;
		
		Node curr = head;
		Node prev = null, next = null;
		int count = 0;
		
		while(curr != null && count++ <  k) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		if(next != null) {
			head.next = reverseGroup(next, k);
		}
		
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_140 ll = new LinkedList_140();
		ll.head = new Node(1);
		ll.head.next = new Node(2);
		ll.head.next.next = new Node(3);
		ll.head.next.next.next = new Node(4);
		
		System.out.print("List : ");
		Node.print(head);
		
		System.out.println();
		
		int k = 2;
		
		System.out.print("Reversed list of " + k + " group sizes : ");
		head = reverseGroup(head, k);
		
		Node.print(head);

	}

}
