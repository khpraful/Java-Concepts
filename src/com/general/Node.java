package com.general;


public class Node {
	protected Object data;
	protected Node node;
		
	public Node(Object data, Node node) {
		this.data = data;
		this.node = node;
		
	}
	public Node() {
		this.data = null;
		this.node = null;
		
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}	
	
		
}
