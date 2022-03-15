package BinaryTree;
import java.util.*;

public class BinaryTree_187 {
	Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree_187 bin = new BinaryTree_187();
		bin.root = new Node(1);
		bin.root.left = new Node(2);
		bin.root.right = new Node(3);
		bin.root.left.left = new Node(4);
		bin.root.left.right = new Node(5);
		
		System.out.print("Normal view : ");
		new BinaryTree_177().levelOrder(bin.root);
		
		System.out.println();
		
		System.out.print("Top View : ");
		bin.topView(bin.root);
	}
	
	public static void topView(Node root) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		topViewUtil(root, 0, map);
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}
	}
	
	public static void topViewUtil(Node root, int hd, TreeMap<Integer, Integer> map) {
		if(root==null)
			return;
		
		if(!map.containsKey(hd)) 
			map.put(hd, root.data);
		
		topViewUtil(root.left, hd-1, map);
		topViewUtil(root.right, hd+1, map);
	}

}
