package BinaryTree;

public class BinaryTree_202 {
	Node root;
	
	static int maxLen;
    static int maxSum;
	
	public static int sumOfLongRootToLeafPath(Node root)
    {
        //code here
		if(root == null)
			return 0;
		
		maxSum = Integer.MIN_VALUE;
		maxLen = 0;
		
		sumOfLongRootToLeafPath(root, 0, 0);
		
		return maxSum;
		
    }
	
	public static void sumOfLongRootToLeafPath(Node root, int sum, int len) {
		if(root == null) {
			if(maxLen < len) {
				maxLen = len;
				maxSum = sum;
			}
			else if(maxLen == len && maxSum < sum)
				maxSum = sum;
			return;
		}
		
		sumOfLongRootToLeafPath(root.left, sum+root.data, len+1);
		sumOfLongRootToLeafPath(root.right, sum+root.data, len+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree_202 bin = new BinaryTree_202();
		bin.root = new Node(1);
		bin.root.left = new Node(2);
		bin.root.right = new Node(3);
		bin.root.left.left = new Node(4);
		bin.root.left.right = new Node(5);
		bin.root.right.left = new Node(6);
		bin.root.right.right = new Node(7);
		
		System.out.println(sumOfLongRootToLeafPath(bin.root));
	}

}
