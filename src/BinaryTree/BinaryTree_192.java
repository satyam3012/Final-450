package BinaryTree;

public class BinaryTree_192 {
	Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree_192 bin = new BinaryTree_192();
		bin.root = new Node(1);
		bin.root.left = new Node(2);
		bin.root.right = new Node(3);
		bin.root.left.left = new Node(4);
		bin.root.left.right = new Node(5);
		
		System.out.print("Normal view : ");
		new BinaryTree_177().levelOrder(bin.root);
		
		System.out.println();
		
		System.out.print("Boundary traversal : ");
		bin.boundaryTraversal(bin.root);
	}
	
	public static void boundaryTraversal(Node root) {
		if(root == null)
			return;
		
		System.out.print(root.data + " ");
		leftSubtree(root.left);
		leafNodes(root);
		rightSubtree(root.right);
	}
	
	//this will print the left subtree except leaf nodes
	public static void leftSubtree(Node left) {
		if(left == null || Node.isLeafNode(left))
			return;
		
		System.out.print(left.data + " ");
		
		leftSubtree(left.left != null ? left.left : left.right);
		/*
		while(!Node.isLeafNode(left)) {
			System.out.print(left.data + " ");
			left = (left.left != null) ? left.left : left.right;
		}
		*/
	}
	
	//this will print the leaf nodes
	public static void leafNodes(Node leaf) {
		if(leaf == null)
			return;
		
		leafNodes(leaf.left);
		
		if(Node.isLeafNode(leaf))
			System.out.print(leaf.data + " ");
		
		leafNodes(leaf.right);
	}
	
	public static void rightSubtree(Node right) {
		if(right == null || Node.isLeafNode(right))
			return;
		
		rightSubtree(right.right != null ? right.right : right.left);
		System.out.print(right.data + " ");
	}

}
