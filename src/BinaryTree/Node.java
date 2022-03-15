package BinaryTree;

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
}
