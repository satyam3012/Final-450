package LinkedList;

public class LinkedList_151 {
	static Node head;
	
	public static Node getMiddle(Node head) {
		Node slow = head, fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static Node merge(Node head1, Node head2) {
		Node merged = new Node(-1);
		Node temp = merged;
		
		while(head1 != null && head2 != null) {
			if(head1.data <= head2.data) {
				temp.next = head1;
				head1 = head1.next;
			}
			else {
				temp.next = head2;
				head2 = head2.next;
			}
			temp = temp.next;
		}
		
		while(head1 != null) {
			temp.next = head1;
			head1 = head1.next;
			temp = temp.next;
		}
		
		while(head2 != null) {
			temp.next = head2;
			head2 = head2.next;
			temp = temp.next;
		}
		
		return merged.next;
	}
	
	public static Node mergeSort(Node head) {
		if(head == null || head.next == null)
			return head;
		
		Node middle = getMiddle(head);
		Node head2 = middle.next;
		middle.next = null;
		
		Node left = mergeSort(head);
		Node right = mergeSort(head2);
		
		Node merged = merge(left, right);
		
		return merged;
	}
	
	public static void print(Node head) {
		while(head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_151 ll = new LinkedList_151();
		ll.head = new Node(4);
		ll.head.next = new Node(3);
		ll.head.next.next = new Node(2);
		ll.head.next.next.next = new Node(1);
		
		System.out.println("Before sorting : ");
		print(head);
		System.out.println();
		
		ll.head = mergeSort(ll.head);
		System.out.println("After merge-sort : ");
		print(head);
	}

}
