package BinaryTree;

public class BinaryTree_185 {
	Node root;
	static int maxLevel = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree_185 bin = new BinaryTree_185();
		bin.root = new Node(1);
		bin.root.left = new Node(2);
		bin.root.right = new Node(3);
		bin.root.left.left = new Node(4);
		bin.root.left.right = new Node(5);
		
		System.out.print("Normal view : ");
		new BinaryTree_177().levelOrder(bin.root);
		
		System.out.println();
		
		System.out.print("Left view : ");
		bin.leftView(bin.root);
	}
	
	public static void leftView(Node root) {
		leftViewUtil(root, 1);
	}
	
	public static void leftViewUtil(Node root, int level) {
		if(root == null) 
			return;
		
		if(maxLevel < level) {
			System.out.print(root.data + " ");
			maxLevel = level;
		}
		
		leftViewUtil(root.left, level+1);
		leftViewUtil(root.right, level+1);
	}

}
