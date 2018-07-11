import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Testing {

	@Test
	public void initialList() {
		MyLinkedList newList = new MyLinkedList();
		int count = newList.length();
		assertEquals(count, 0);
	}
	
	@Test
	public void addNode() {		
		MyLinkedList list = new MyLinkedList();
		Node root = new Node();
		root.setData("hello");
		list.add(root, null);
		int count = list.length();
		assertEquals(count, 1);
	}
	
	@Test
	public void removeTwoNodes() {
		MyLinkedList list = new MyLinkedList();
		Node root = new Node();
		root.setData("hello");
		list.add(root, null);
		
		Node node1 = new Node();
		root.setData("world");
		list.add(root, node1);
		
		int count = list.length();
		assertEquals(count, 2);
		list.removeNode(root);
		list.removeNode(root);
		count = list.length();
		assertEquals(count, 0);
	}
	
	@Test
	public void removeOneNode() {
		MyLinkedList list = new MyLinkedList();
		Node root = new Node();
		root.setData("hello");
		list.add(root, null);
		int count = list.length();
		assertEquals(count, 1);
		list.removeNode(root);
		count = list.length();
		assertEquals(count, 0);
	}
	
	@Test
	public void insertNode() {
		MyLinkedList list = new MyLinkedList();

		Node root = new Node();
		root.setData("peach");
		
		Node node1 = new Node();
		node1.setData("grows");
		
		Node node2 = new Node();
		
		node2.setData("tree");
		list.add(root, null);
		list.add(root, node2);
		
		list.insert(node1, node2);
		assertEquals(list.length(), 3);
	}
	
	@Test
	public void containsNode() {
		MyLinkedList list = new MyLinkedList();

		Node root = new Node();
		root.setData("peach");
		
		Node node1 = new Node();
		node1.setData("grows");
		
		Node node2 = new Node();
		node2.setData("tree");
		
		list.add(root, node1);
		list.add(root, node2);
		
		boolean contains = list.contains(root, root);
		contains = list.contains(root, node2);
		contains = list.contains(root, node1);
		assertEquals(contains, true);	
	}
	
	@Test
	public void doesNotContainNode() {
		MyLinkedList list = new MyLinkedList();

		Node root = new Node();
		root.setData("peach");
		
		Node node1 = new Node();
		node1.setData("grows");
		
		Node node2 = new Node();
		node2.setData("tree");
		
		list.add(root, node1);
		
		boolean contains = list.contains(root, node2);
		assertEquals(contains, false);	
	}

	
	@Test
	public void nullNodeAdd() {
		Node root = new Node();
		Node node1 = null;
		MyLinkedList list = new MyLinkedList();
		list.add(root, node1);
		
		boolean error = list.error();
		assertEquals(error, true);
	}
	
	@Test
	public void nullNodeInsert() {
		Node node1 = new Node();
		Node node2 = null;
		
		MyLinkedList list = new MyLinkedList();
		list.insert(node1, node2);
		
		boolean error = list.error();
		assertEquals(error, true);
	}
	
	@Test
	public void nullGivenNodeInsert() {
		Node node1 = null;
		Node node2 = new Node();
		
		MyLinkedList list = new MyLinkedList();
		list.insert(node1, node2);
		
		boolean error = list.error();
		assertEquals(error, true);
	}
	
	@Test
	public void bothNullInsert() {
		Node node1 = null;
		Node node2 = null;
		
		MyLinkedList list = new MyLinkedList();
		list.insert(node1, node2);
		
		boolean error = list.error();
		assertEquals(error, true);
	}
	
	@Test
	public void removeFromEmptyList() {		
		MyLinkedList list = new MyLinkedList();
		list.removeNode(null);
		
		boolean error = list.error();
		assertEquals(error, true);
	}
	
	@Test
	public void removeRootNode() {		
		MyLinkedList list = new MyLinkedList();
		Node root = new Node();
		list.add(root, null);
		int count = list.length();
		assertEquals(count, 1);
		list.removeNode(root);
		count = list.length();
		assertEquals(count, 0);
	}	
}
