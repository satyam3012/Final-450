package BinaryTree;

public class BinaryTree_181 {
	Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree_181 bin = new BinaryTree_181();
		bin.root = new Node(1);
		bin.root.left = new Node(2);
		bin.root.right = new Node(3);
		bin.root.left.left = new Node(4);
		bin.root.left.right = new Node(5);
		
		System.out.print("Before mirroring : ");
		new BinaryTree_177().levelOrder(bin.root);
		
		System.out.println();
		
		System.out.print("After mirroring : ");
		bin.mirrorTree(bin.root);
		new BinaryTree_177().levelOrder(bin.root);
	}
	
	public static Node mirrorTree(Node root) {
		if(root==null)
			return root;
		
		Node left = mirrorTree(root.left);
		Node right = mirrorTree(root.right);
		
		root.left = right;
		root.right = left;
		
		return root;
	}

}
