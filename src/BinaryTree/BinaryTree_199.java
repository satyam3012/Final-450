package BinaryTree;

public class BinaryTree_199 {
	Node root;
	static int leafLevel = 0;
	
	public static boolean check(Node node) {
		return checkUtil(node, 0);
	}
	
	public static boolean checkUtil(Node node, int level) {
		if(node == null)
			return true;
		
		if(node.left == null && node.right == null) {
			if(leafLevel == 0) {
				leafLevel = level;
				return true;
			}
			return (level == leafLevel);
		}
		
		return checkUtil(node.left, level+1) && checkUtil(node.right, level+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree_199 bin = new BinaryTree_199();
		bin.root = new Node(1);
		bin.root.left = new Node(2);
		bin.root.right = new Node(3);
		bin.root.left.left = new Node(4);
		bin.root.left.right = new Node(5);
		bin.root.right.left = new Node(6);
		bin.root.right.right = new Node(7);
		
		System.out.println(check(bin.root));
	}

}
