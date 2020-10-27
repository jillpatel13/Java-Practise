// A Java program to swap kth 
// node from the beginning with 
// kth node from the end 

class Node { 
	int data; 
	Node next; 
	Node(int d) 
	{ 
		data = d; 
		next = null; 
	} 
} 

class LinkedList { 
	Node head; 

	/* Utility function to insert 
	a node at the beginning */
	void push(int new_data) 
	{ 
		Node new_node = new Node(new_data); 
		new_node.next = head; 
		head = new_node; 
	} 

	/* Utility function for displaying linked list */
	void printList() 
	{ 
		Node node = head; 
		while (node != null) { 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(""); 
	} 

	/* Utility function for calculating 
	length of linked list */
	int countNodes() 
	{ 
		
	} 

	/* Function for swapping kth nodes from 
	both ends of linked list */
	void swapKth(int k) 
	{ 
		// Count nodes in linked list 
		
	} 

	// Driver code to test above 
	public static void main(String[] args) 
	{ 
		LinkedList llist = new LinkedList(); 
		for (int i = 8; i >= 1; i--) 
			llist.push(i); 

		System.out.print("Original linked list: "); 
		llist.printList(); 
		System.out.println(""); 

		for (int i = 1; i < 9; i++) { 
			llist.swapKth(i); 
			System.out.println("Modified List for k = " + i); 
			llist.printList(); 
			System.out.println(""); 
		} 
	} 
} 
