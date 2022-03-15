package BinarySearchTree;

public class BinarySearchTree_220 {
	Node root;
	
	public static Node lca(Node node, int n1, int n2) {
		if(node == null)
			return null;
		
		if(n1 < node.data && n2 < node.data)
			return lca(node.left, n1, n2);
		
		if(n1 > node.data && n2 > node.data) 
			return lca(node.right, n1, n2);
		
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree_220 tree = new BinarySearchTree_220();
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
        
        int n1 = 10, n2 = 14;
        Node t = tree.lca(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

	}

}
