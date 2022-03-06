package bst;

public class BinaryMain {

	/**
	 * 
	 * @param args UC-1:- Create a Binary Search Tree by adding 56 and then adding
	 *             30 & 70.
	 *             ===============================================================
	 *             Procedure:- ========== 1. Creating object to access the function
	 *             of function class 2. Adding the sub-nodes of Binary Tree
	 *             3.Printing the elements
	 */

	public static void main(String[] args) {

		/*
		 * 1. Creating an object of function class
		 */
		BinaryTree a = new BinaryTree();
		BinaryNode root = null;

		/*
		 * 3.Adding sub-nodes to the Binary Tree
		 */
		root = a.insert(root, 56);
		root = a.insert(root, 30);
		root = a.insert(root, 70);

		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();

	}
	/* inOrder */

	public static void inOrder(BinaryNode root) {
		// TODO Auto-generated method stub
		if (root == null)
			return;

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);

	}

	/* postOrder */
	public static void postOrder(BinaryNode root) {
		// TODO Auto-generated method stub
		if (root == null)
			return;

		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.data + " ");

	}

	public static void preOrder(BinaryNode root) {
		// TODO Auto-generated method stub
		if (root == null)
			return;
		System.out.print(root.data + " ");
		inOrder(root.left);
		inOrder(root.right);

	}
}