package BinaryTree;
import java.util.*;

public class BinaryTree_196 {
	static int preIndex = 0;
	
	public static Node buildTree(int[] preorder, int start, int end, HashMap<Integer, Integer> map) {
		if(start > end)
			return null;
		
		int node = preorder[preIndex++];
		Node tNode = new Node(node);
		
		if(start == end)
			return tNode;
		
		int inIndex = map.get(node);
		
		tNode.left = buildTree(preorder, start, inIndex-1, map);
		tNode.right = buildTree(preorder, inIndex+1, end, map);
		
		return tNode;
	}
	
	public static Node construct(int[] inorder, int[] preorder, int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++)
			map.put(inorder[i], i);
		
		return buildTree(preorder, 0, n-1, map);
	}
	
	public static void inOrder(Node root) {
		if(root == null)
			return;
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inorder = { 4, 2, 1, 7, 5, 8, 3, 6 };
        int[] preorder = { 1, 2, 4, 3, 5, 7, 8, 6 };
        int n = inorder.length;
        Node root = construct(inorder, preorder, n);
        System.out.println("Inorder traversal : ");
        inOrder(root);
	}

}
