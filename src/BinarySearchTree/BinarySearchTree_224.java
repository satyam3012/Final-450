package BinarySearchTree;

import java.util.*;

public class BinarySearchTree_224 {
	static ArrayList<Node> list1 = new ArrayList<>();
	static ArrayList<Node> list2 = new ArrayList<>();
	
	public static Node buildTree(ArrayList<Node> list, int l, int h) {
		if(l > h)
			return null;
		
		int mid = (l + h)/2;
		Node temp = list.get(mid);
		
		temp.left = buildTree(list, l, mid - 1);
		temp.right = buildTree(list, mid + 1, h);
		
		return temp;
	}
	
	public static ArrayList mergeList(ArrayList<Node> l1, ArrayList<Node> l2, int n1, int n2) {
		ArrayList<Node> l3 = new ArrayList<Node>();
		
		int i = 0, j = 0;
		
		while(i < n1 && j < n2) {
			if(l1.get(i).data <= l2.get(j).data) {
				l3.add(l1.get(i));
				i++;
			}
			else {
				l3.add(l2.get(j));
				j++;
			}
		}
		
		while(i < n1) {
			l3.add(l1.get(i));
			i++;
		}
		
		while(j < n2) {
			l3.add(l2.get(j));
			j++;
		}
		
		return l3;
	}
	
	public static void storeInorder(Node root, ArrayList<Node> list) {
		if(root == null)
			return;
		
		storeInorder(root.left, list);;
		list.add(root);
		storeInorder(root.right, list);
	
	}
	
	public static Node merge(Node root1, Node root2) {
		storeInorder(root1, list1);
		storeInorder(root2, list2);
		
		ArrayList<Node> mergedList = mergeList(list1, list2, list1.size(), list2.size());
		
		return buildTree(mergedList, 0, mergedList.size() - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Node root1 = null, root2 = null;
     
        /* Let us create the following tree as first tree
                3
            / \
            1 5
        */
        root1 = new Node(3) ;
        root1.left = new Node(1);
        root1.right = new Node(5);
     
        /* Let us create the following tree as second tree
                4
            / \
            2 6
        */
        root2 = new Node(4) ;
        root2.left = new Node(2);
        root2.right = new Node(6);
        
        Node.inOrder(merge(root1, root2));

	}

}
