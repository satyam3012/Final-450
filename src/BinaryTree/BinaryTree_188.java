package BinaryTree;
import java.util.*;

public class BinaryTree_188 {
	Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree_188 bin = new BinaryTree_188();
		bin.root = new Node(1);
		bin.root.left = new Node(2);
		bin.root.right = new Node(3);
		bin.root.left.left = new Node(4);
		bin.root.left.right = new Node(5);
		
		System.out.print("Normal view : ");
		new BinaryTree_177().levelOrder(bin.root);
		
		System.out.println();
		
		System.out.print("Bottom View : ");
		bin.bottomView(bin.root);
	}
	
	public static void bottomView(Node root) {
		if(root == null)
			return;
		
		int hd = 0;
		root.hd = hd;
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.poll();
			hd = temp.hd;
			
			map.put(hd, temp.data);
			
			if(temp.left != null)  {
				temp.left.hd = hd - 1;
				q.add(temp.left);
			}
			
			if(temp.right != null) {
				temp.right.hd = hd + 1;
				q.add(temp.right);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}
	}

}
