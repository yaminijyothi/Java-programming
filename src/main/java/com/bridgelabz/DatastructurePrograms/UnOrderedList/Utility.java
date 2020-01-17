package com.bridgelabz.DatastructurePrograms.UnOrderedList;

public class Utility {

	Node head; // pointing the node.
	// insertion to list
	public void insert(String data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else { 
			// if the muliple elements are added
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	//display method
	public String show() {
		Node node = head; // taking the head pointer
		String data=" ";
		while (node.next != null) {
			System.out.println(node.data);
			data+=node.data+" ";
			node = node.next;

		}
		System.out.println(node.data);
		return data;
	}
	//insertion at starting
	public void insertAtStart(String data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head; // pointer has to come to first node.
		head = node; // insert the data at first node.
	}
	//insertion at particular index
	public void insertAt(int index, String data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	//to search a word in file
	public boolean search(String word) {

		Node node = head; // taking the head pointer
		int index = 0;
		while (node.next != null) {	

			if (node.data.equalsIgnoreCase(word)) {

				delAt(index);
				return true;
			} 
			index++;
			node = node.next;
		}
		System.out.println(node.data); //printing the last node data
		if (node.data.equalsIgnoreCase(word)) {
			delAt(index);
			return true;
		} 
		return false;
	}
	//remove at paricular index
	public void delAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("delted:" + n1.data);
			n1 = null;
		}
	}

}



