package BinaryTree;
import java.util.*;

public class BinaryTree_177 {
	Node root;
	
	void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			System.out.print(temp.data + " ");
			
			if(temp.left != null)
				q.add(temp.left);
			if(temp.right != null)
				q.add(temp.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree_177 bin = new BinaryTree_177();
		bin.root = new Node(1);
		bin.root.left = new Node(2);
		bin.root.right = new Node(3);
		bin.root.left.left = new Node(4);
		bin.root.left.right = new Node(5);
		
		System.out.println("Level order traversal : ");
		bin.levelOrder(bin.root);
		
	}

}
