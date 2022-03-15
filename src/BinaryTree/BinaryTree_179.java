package BinaryTree;
import java.util.*;

public class BinaryTree_179 {
	Node root;
	
	int height(Node root) {
		if(root == null)
			return 0;
		int left = height(root.left);
		int right = height(root.right);
		
		return (1+Math.max(left, right));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree_179 bin = new BinaryTree_179();
		bin.root = new Node(1);
		bin.root.left = new Node(2);
		bin.root.right = new Node(3);
		bin.root.left.left = new Node(4);
		bin.root.left.right = new Node(5);
		
		System.out.println("Height of binary tree : ");
		System.out.println(bin.height(bin.root)); 
	}

}
