package LinkedList;

public class LinkedList_141 {
	static Node head;
	
	public static boolean containsLoop(Node head) {
		Node slow = head, fast = head;
		
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_141 ll = new LinkedList_141();
		ll.head = new Node(1);
		ll.head.next = new Node(2);
		ll.head.next.next = new Node(3);
		ll.head.next.next.next = new Node(4);
		
		System.out.print("List : ");
		Node.print(head);
		
		System.out.println();
		
		if(containsLoop(head))
			System.out.println("List contains loop");
		else
			System.out.println("No loop");
	}

}
