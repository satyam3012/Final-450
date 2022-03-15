package BinarySearchTree;

public class BinarySearchTree_225 {
	static int count;
	
	public static Node kthLargest(Node root, int k) {
		if(root==null)
			return null;
		
		Node right = kthLargest(root.right, k);
		if(right != null)
			return right;
		count++;
		
		if(count == k)
			return root;
		
		return kthLargest(root.left, k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;
		
		root = new Node(27);
		root.left = new Node(25);
		root.right = new Node(30);
		root.left.left = new Node(22);
		root.left.right = new Node(26);
		root.right.right = new Node(34);
		
		/*
		 
		 				27
		 			  /	   \
		 			25      30
		 		  /	   \	   \
		 		 22		26		34
		 */
		
		int k = 1;
		Node.inOrder(root);
		count = 0;
		if(kthLargest(root, k) != null)
			System.out.println("Kth largest element is :  " + kthLargest(root, k).data);
		else
			System.out.println("There is no Kth largest element in this BST");
	}

}
