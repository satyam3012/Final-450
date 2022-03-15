package BinarySearchTree;

public class BinarySearchTree_215 {
	Node root;
	
	public static int minValue(Node root) {
		int val = root.data;
		while(root != null) {
			val = root.data;
			root = root.left;
		}
		return val;
	}
	
	public static Node deleteRec(Node root, int key) {
		if(root == null)
			return root;
		
		if(key < root.data)
			root.left = deleteRec(root.left, key);
		
		else if(key > root.data)
			root.right = deleteRec(root.right, key);
		
		else {
			//node with no child or only one child
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			root.data = minValue(root.right);
			root.right = deleteRec(root.right, root.data);
		}
		
		return root;
	}
	
	public static Node deleteNode(Node root, int key) {
		Node parent = null;
		Node curr = root;
		
		while(curr != null && curr.data != key) {
			parent = curr;
			
			if(key < curr.data)
				curr = curr.left;
			else if(key > curr.data)
				curr = curr.right;
		}
		
		//return if key to be deleted is not found
		if(curr == null)
			return root;
		
		//case 1 : for leaf nodes
		if(curr.left == null && curr.right == null) {
			if(curr != root) {
				if(parent.left == curr)
					parent.left = null;
				else
					parent.right = null;
			}
			else
				root = null;
		}
		
		//case 2 : for both child
		else if(curr.left == null && curr.right == null) {
			int min = minValue(curr.right);
			deleteNode(root, min);
			curr.data = min;
		}
		
		//case 3 : for one child
		else {
			Node child = (curr.left != null) ? curr.left : curr.right;
			if(curr == root)
				root = child;
			else {
				if(curr == parent.left)
					parent.left = child;
				else
					parent.right = child;
			}
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree_215 tree = new BinarySearchTree_215();
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
        Node.inOrder(tree.root);
        System.out.println();
        tree.root = deleteNode(tree.root, 12);
        System.out.println("After deletion of 20 : ");
        Node.inOrder(tree.root);
	}

}
