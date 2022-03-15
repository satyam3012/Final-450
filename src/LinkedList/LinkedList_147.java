package LinkedList;

public class LinkedList_147 {
	static Node head;
	
	public static Node addOneUtil(Node head) {
		Node res = head, temp = null;
		int carry = 1, sum = 0;
		
		while(res != null) {
			sum = carry + res.data;
			
			carry = (sum >= 10) ? 1 : 0;
			
			sum = sum % 10;
			res.data = sum;
			
			temp = res;
			res = res.next;
		}
		
		if(carry > 0)
			temp.next = new Node(carry);
		return head;
	}
	
	public static Node addOne(Node head) {
		head = reverse(head);
		
		head = addOneUtil(head);
		
		return reverse(head);
	}
	
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
		LinkedList_147 ll = new LinkedList_147();
		ll.head = new Node(1);
		ll.head.next = new Node(2);
		ll.head.next.next = new Node(3);
		ll.head.next.next.next = new Node(4);
		
		System.out.print("List : ");
		Node.print(head);
		
		System.out.println();
		
		head = addOne(head);
		System.out.println("After adding one : ");
		
		Node.print(head);

	}

}
