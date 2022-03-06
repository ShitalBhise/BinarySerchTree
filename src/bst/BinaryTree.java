package bst;

public class BinaryTree {
	public BinaryNode createNewNode(int k) {
		BinaryNode a = new BinaryNode();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}

	/*
	 * 1. Creating new node if there is no Binary Tree exists then
	 */
	public BinaryNode insert(BinaryNode node, int value) {
		if (node == null) {
			return createNewNode(value);
		}
		if (value < node.data) {
			node.left = insert(node.left, value);
		} else if (value > node.data) {
			node.right = insert(node.right, value);
		}

		return node;

	}

	/*
	 * 2. Method for printing the Binary Tree
	 */
	public static void printBST(BinaryNode root) {
		if (root == null) {
			return;
		}
		printBST(root.left);
		System.out.print(root.data + " -> ");
		printBST(root.right);
	}

}