package BinaryTree;
import java.util.*;

public class BinaryTree_178 {
	Node node;

	void reverseLevelOrder(Node root) {
		Stack<Node> s = new Stack();
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			s.push(temp);
			
			if(temp.right != null)
				q.add(temp.right);
			if(temp.left != null)
				q.add(temp.left);
		}
		
		while(!s.isEmpty()) {
			System.out.print(s.pop().data + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree_178 bin = new BinaryTree_178();
		bin.node = new Node(1);
		bin.node.left = new Node(2);
		bin.node.right = new Node(3);
		bin.node.left.left = new Node(4);
		bin.node.left.right = new Node(5);
		
		System.out.println("Reverse level order traversal : ");
		bin.reverseLevelOrder(bin.node);

	}

}
