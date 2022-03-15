package LinkedList;

public class LinkedList_142 {
	static Node head;
	
	public static Node detectLoop(Node head) {
		Node slow = head, fast = head;
		
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				return slow;
		}
		
		return null;
	}
	
	public static void removeLoop(Node head) {
		Node slow = detectLoop(head);
		Node fast = head;
		
		System.out.println("Slow : " + slow.data);
		
		while(slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		
		while(slow.next != fast) {
			slow = slow.next;
		}
		
		slow.next = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_142 ll = new LinkedList_142();
		ll.head = new Node(1);
		ll.head.next = new Node(2);
		ll.head.next.next = new Node(3);
		ll.head.next.next.next = new Node(4);
		ll.head.next.next.next.next = head;
		
		if(detectLoop(head) != null) {
			removeLoop(head);
			System.out.print("After removing the loop : ");
		}
		else {
			System.out.print("List : ");
		}
		Node.print(head);
		
	}

}
