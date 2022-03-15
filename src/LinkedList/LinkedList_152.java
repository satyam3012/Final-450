package LinkedList;

public class LinkedList_152 {
	static Node head;
	
	public static Node quickSort(Node head) {
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_152 ll = new LinkedList_152();
		ll.head = new Node(4);
		ll.head.next = new Node(3);
		ll.head.next.next = new Node(2);
		ll.head.next.next.next = new Node(1);
		
		System.out.println("Before sorting : ");
		Node.print(head);
		System.out.println();
		
		ll.head = quickSort(ll.head);
		System.out.println("After merge-sort : ");
		Node.print(head);

	}

}
