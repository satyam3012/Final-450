package BinarySearchTree;

public class Node {
	int data, hd;
	Node left, right;
	
	Node(int data) {
		this.data = data;
		this.hd = Integer.MAX_VALUE;
		left = right = null;
	}
	
	public static boolean isLeafNode(Node leafNode) {
		return leafNode.left == null && leafNode.right == null;
	}
	
	public static void inOrder(Node root) {
		if(root == null)
			return;
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public static void preOrder(Node root) {
		if(root == null)
			return;
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
}
