package com.general;
public class LinkedListNew {
	protected Node head;
	protected Node tail;
	public int size;

	public LinkedListNew() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public Node add(Object data) {
		Node n = new Node(data, null);
		if (head == null) {
			head = n;
			tail = head;
		} else {
			tail.setNode(n);
			tail = n;
		}
		size++;
		return n;

	}

	public void delete(int index) {
		Node temp = head;
		if (index == 1) {
			head.data = "";
			head.setNode(null);
			head = head.getNode();
			size--;
			return;
		}

		else if (index == size) {
			while (temp != null) {
				tail = temp;
				temp = temp.getNode();
			}
			tail.data = "";
			tail.setNode(null);
			size--;
			return;
		} else {
			for (int i = 1; i < size; i++) {
				if (i <= 2) {
					tail = temp;
					temp = temp.getNode();
				} else {
					head = head.getNode();
					tail = temp;
					temp = temp.getNode();
				}
				if (i == index) {
					tail.data = "";
					tail.setNode(null);
					head.setNode(temp);
					size--;
					return;
				}
			}
		}

	}

	public static void main(String args[]) {
		LinkedListNew lst = new LinkedListNew();
		Node n1 = lst.add("Praful");
		Node n2 = lst.add(3);
		Node n3 = lst.add('c');
		Node n4 = lst.add(23.5);
		Node n5 = lst.add("Peter");
		System.out.println("Node1 : " + n1);
		System.out.println("Node1 value: " + n1.data);
		System.out.println("Node1 link: " + n1.node);
		System.out.println("Node2 : " + n2);
		System.out.println("Node2 value: " + n2.data);
		System.out.println("Node2 link: " + n2.node);
		System.out.println("Node3 : " + n3);
		System.out.println("Node3 value: " + n3.data);
		System.out.println("Node3 link: " + n3.node);
		System.out.println("Node4 : " + n4);
		System.out.println("Node4 value: " + n4.data);
		System.out.println("Node4 link: " + n4.node);
		System.out.println("Node5 : " + n5);
		System.out.println("Node5 value: " + n5.data);
		System.out.println("Node5 link: " + n5.node);
		System.out.println("Size of Linked list: " + lst.size);
		System.out.println("-------------------");
		lst.delete(2);
		lst.delete(3);
		System.out.println("Node1 : " + n1);
		System.out.println("Node1 value: " + n1.data);
		System.out.println("Node1 link: " + n1.node);
		System.out.println("Node2 : " + n2);
		System.out.println("Node2 value: " + n2.data);
		System.out.println("Node2 link: " + n2.node);
		System.out.println("Node3 : " + n3);
		System.out.println("Node3 value: " + n3.data);
		System.out.println("Node3 link: " + n3.node);
		System.out.println("Node4 : " + n4);
		System.out.println("Node4 value: " + n4.data);
		System.out.println("Node4 link: " + n4.node);
		System.out.println("Node5 : " + n5);
		System.out.println("Node5 value: " + n5.data);
		System.out.println("Node5 link: " + n5.node);
		System.out.println("Size of Linked list: " + lst.size);

	}

}