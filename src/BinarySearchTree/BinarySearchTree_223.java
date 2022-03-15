package BinarySearchTree;

import java.util.ArrayList;

public class BinarySearchTree_223 {
	Node root;
	static ArrayList<Node> list = new ArrayList<>();
	
	public static Node buildTree(int l, int h) {
		if(l > h)
			return null;
		
		int m = (l + h)/2;
		Node node = list.get(m);
		
		node.left = buildTree(l, m - 1);
		node.right = buildTree(m + 1, h);
		
		return node;
	}
	
	public static void storeInorder(Node root) {
		if(root == null)
			return;
		
		storeInorder(root.left);
		list.add(root);
		storeInorder(root.right);
	}
	
	public static Node BstToBalanced(Node root) {
		if(root == null)
			return null;
		
		storeInorder(root);
		int n = list.size();
		
		return buildTree(0, n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        /* Constructed skewed binary tree is
               10
              /
             8
            /
           7
          /
         6
        /
       5   */
       BinarySearchTree_223 tree = new BinarySearchTree_223();
       tree.root = new Node(10);
       tree.root.left = new Node(8);
       tree.root.left.left = new Node(7);
       tree.root.left.left.left = new Node(6);
       tree.root.left.left.left.left = new Node(5);
       
       System.out.print("BST Preorder traversal : ");
       Node.preOrder(tree.root);
       
       System.out.println();
       
       Node temp = BstToBalanced(tree.root);
       System.out.print("Balanced BST Preorder traversal : ");
       Node.preOrder(temp);
	}

}
