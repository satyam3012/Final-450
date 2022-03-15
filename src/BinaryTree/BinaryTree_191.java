package BinaryTree;
import java.util.*;

public class BinaryTree_191 {
	Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree_191 bin = new BinaryTree_191();
		bin.root = new Node(1);
		bin.root.left = new Node(2);
		bin.root.right = new Node(3);
		bin.root.left.left = new Node(4);
		bin.root.left.right = new Node(5);
		
		System.out.print("Normal view : ");
		new BinaryTree_177().levelOrder(bin.root);
		
		System.out.println();
		
		System.out.print("Diagonal traversal : ");
		bin.diagonalTraversal(bin.root);
	}
	
	public static void diagonalTraversal(Node node) {
		// create an empty multimap to store the diagonal element in every slope
        Map<Integer, List<Integer>> map = new HashMap<>();
 
        // perform preorder traversal on the tree and fill the map
        printDiagonal(node, 0, map);
 
        // traverse the map and print the diagonal elements
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
	}
	
	public static void printDiagonal(Node node, int diagonal, Map<Integer, List<Integer>> map) {
		if(node == null)
			return;
		
		map.putIfAbsent(diagonal, new ArrayList<>());
		map.get(diagonal).add(node.data);
		
		printDiagonal(node.left, diagonal+1, map);
		printDiagonal(node.right, diagonal, map);
	}

}
