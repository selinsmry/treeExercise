import java.util.Stack;
import java.util.LinkedList;

class Main {
	public static void main(String[] args) {
		Node root = buildTree("43-12+*");
		printTree(root);
	}

	public static Node buildTree(String postfixFormula) {

		Stack<Node> stack = new Stack<Node>();

		for (char c : postfixFormula.toCharArray()) {
			if (Character.isDigit(c))
				stack.push(new Node(c));

			else {
				Node node = new Node(c);

				if (!stack.isEmpty())
					node.right = stack.pop();
				if (!stack.isEmpty())
					node.left = stack.pop();

				stack.push(node);

			}

		}

		return (stack.pop());

	}

	public static void printTree(Node root) {
		if (root == null)
			return;

		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int lineSize = queue.size();

			for (int i = 0; i < lineSize; i++) {
				Node current = queue.remove();
				System.out.print(current.c + " ");
				
				if(current.left != null) queue.add(current.left);
				if(current.right != null) queue.add(current.right);
			}
			System.out.println();

		}

	}
}
