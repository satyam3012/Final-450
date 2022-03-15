package BinarySearchTree;

import java.util.Arrays;

public class BinarySearchTree_222 {
	static int index;
	
	public static void arrayToBST(Node root, int[] arr) {
		if(root == null)
			return;
		
		arrayToBST(root.left, arr);
		
		root.data = arr[index++];
		
		arrayToBST(root.right, arr);
	}
	
	public static void storeInorder(Node root, int[] arr) {
		if(root == null)
			return;
		
		storeInorder(root.left, arr);
		
		arr[index++] = root.data;
		
		storeInorder(root.right, arr);
	}
	
	public static int countNodes(Node root) {
		if(root == null)
			return 0;
		
		return countNodes(root.left) + countNodes(root.right) + 1;
	}
	
	public static void binaryToBST(Node root) {
		if(root == null)
			return;
		
		int n = countNodes(root);
		int[] arr = new int[n];
		
		storeInorder(root, arr);
		
		Arrays.sort(arr);
		index = 0;
		arrayToBST(root, arr);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;
		 
        /* Constructing tree given in the above figure
            10
            / \
            30 15
        /     \
        20     5 */
        root = new Node(10);
        root.left = new Node(30);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.left.right = new Node(5);
        
        Node.inOrder(root);
        System.out.println();
        System.out.print("After conversion of binary to BST : ");
        binaryToBST(root);
        Node.inOrder(root);

	}

}
