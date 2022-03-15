package BinarySearchTree;

public class BinarySearchTree_218 {
	Node root;
	
	public static boolean isBSTUtil(Node root, int min, int max) {
		if(root == null)
			return true;
		
		if(root.data < min || root.data > max)
			return false;
		
		return (isBSTUtil(root.left, min, root.data - 1)
				&& isBSTUtil(root.right, root.data + 1, max));
	}
	
	public static boolean isBST(Node root) {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree_218 tree = new BinarySearchTree_218();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        
        /*
         				20
         			  /    \
         			 8      22
         		    / \     
         		   4  12 
         		     /  \
         		    10   14
         */
        System.out.println(isBST(tree.root));
        Node.inOrder(tree.root);

	}

}
