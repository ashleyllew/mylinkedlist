public class MyLinkedList {

	public int count;
	public boolean error;
	
	public MyLinkedList() {
	}
	
	public void insert(Node givenNode, Node test1) {
		if (test1 == null) {
			error = true;
		}
		else {
			if (givenNode == null) {
				error = true;
			}
			else {
				Node nextNode = givenNode.getNextNode();
				givenNode.setNextNode(test1);
				test1.setNextNode(nextNode);
				count++;
			}
		}
	}
	
	public void add(Node root, Node test1) {
		if (test1 == null) {
			error = true;
		}
		if (root.getNextNode() == null) {
			root.setNextNode(test1);
			count++;
		}
		else {
			Node currNode = root;
			while (currNode.getNextNode() != null) {
				currNode = currNode.getNextNode();
			}
			currNode.setNextNode(test1);
			count++;
		}
	}
	
	public void removeNode(Node root) {
		if (root == null) {
			error = true;
		}
		else {
			if (root.getNextNode() == null) {
				root = null;
				count--;				
			}
			else {
				Node currNode = root;
				while (currNode.getNextNode() != null) {
					currNode = currNode.getNextNode();
				}
				// currNode.getNextNode() should be null
				currNode.setNextNode(null);
				count--;
			}
		}
	}
	
	public boolean contains(Node root, Node node) {
		Node currNode = root;
		if (node == root) {
			return true;
		}
		while (currNode.getNextNode() != null) {
			if (currNode == node) {
				return true;
			}
			else {
				currNode = currNode.getNextNode();						
			}
		}
		if (currNode == node) {
			return true;
		}
		return false;
	}
	
	public boolean error() {
		return error;
	}
	
	public int length() {
		return count;
	}
}
