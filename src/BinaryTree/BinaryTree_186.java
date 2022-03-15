package BinaryTree;

public class BinaryTree_186 {
	Node root;
	static int maxLevel = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree_186 bin = new BinaryTree_186();
		bin.root = new Node(1);
		bin.root.left = new Node(2);
		bin.root.right = new Node(3);
		bin.root.left.left = new Node(4);
		bin.root.left.right = new Node(5);
		
		System.out.print("Normal view : ");
		new BinaryTree_177().levelOrder(bin.root);
		
		System.out.println();
		
		System.out.print("Right view : ");
		bin.rightView(bin.root);
	}
	
	public static void rightView(Node root) {
		rightViewUtil(root, 1);
	}
	
	public static void rightViewUtil(Node root, int level) {
		if(root == null) 
			return;
		
		if(maxLevel < level) {
			System.out.print(root.data + " ");
			maxLevel = level;
		}
		
		rightViewUtil(root.right, level+1);
		rightViewUtil(root.left, level+1);
	}

}
