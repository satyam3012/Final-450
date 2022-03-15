package BinarySearchTree;

class Index {
	int index = 0;
}

public class BinarySearchTree_221 {
	Node root;
	
	public static Node constructTreeUtil(int[] pre, Index preIndex, int key, int min, int max, int size) {
		if(preIndex.index >= size)
			return null;
		
		Node root = null;
		
		if(key > min && key < max) {
			root = new Node(key);
			
			preIndex.index = preIndex.index + 1;
			
			if(preIndex.index < size) {
				root.left = constructTreeUtil(pre, preIndex, pre[preIndex.index], min, key, size);
				root.right = constructTreeUtil(pre, preIndex, pre[preIndex.index], key, max, size);
			}
		}
		return root;
	}
	
	public static Node constructTree(int[] pre, int size) {
		Index in = new Index();
		return constructTreeUtil(pre, in, pre[0], Integer.MIN_VALUE, Integer.MAX_VALUE, size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree_221 tree = new BinarySearchTree_221();
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
        
        int[] pre = new int[] {10, 5, 1, 7, 40, 50};
        Node root = constructTree(pre, pre.length);
        Node.inOrder(root);

	}

}
