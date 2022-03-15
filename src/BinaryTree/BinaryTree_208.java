package BinaryTree;

public class BinaryTree_208 {
	Node root;
	static int d1;
	static int d2;
	static int dist;
	
	public static int findLevel(Node root, int k, int level) {
		if(root == null)
			return -1;
		
		if(root.data == k)
			return level;
		
		int left = findDistance(root.left, k, level+1);
		int right = findDistance(root.right, level, left+1);
		return (left != -1) ? left : right;
	}
	
	public static Node findDistanceUtil(Node root, int n1, int n2, int level) {
		if(root == null)
			return null;
		
		if(root.data == n1) {
			d1 = level;
			return root;
		}
		
		if(root.data == n2) {
			d2 = level;
			return root;
		}
		
		Node left = findDistanceUtil(root.left, n1, n2, level+1);
		Node right = findDistanceUtil(root.right, n1, n2, level+1);
		
		if(left != null && right != null) {
			dist = d1 + d2 - (2*level);
			return root;
		}
		
		return (left != null) ? left : right;
	}
	
	public static int findDistance(Node root, int n1, int n2) {
		d1 = -1;
		d2 = -1;
		dist = 0;
		
		Node lca = findDistanceUtil(root, n1, n2, 1);
		
		if(d1 != -1 && d2 != -1) 
			return dist;
		
		if(d1 != -1) {
			dist = findLevel(lca, n2, 0);
			return dist;
		}
		
		if(d2 != -1) {
			dist = findLevel(root, n1, 0);
			return dist;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree_208 tree = new BinaryTree_208();
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
        
        int n1 = 10, n2 = 22;
        int distance = tree.findDistance(tree.root, n1, n2);
        System.out.println("Distance of " + n1 + " and " + n2 + " is " + distance);
	}

}
