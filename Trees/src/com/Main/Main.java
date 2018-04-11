package com.Main;

import com.binarytree.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node = new Node(100);
		node.insert(90);
		node.insert(600);
		node.insert(180);
		node.insert(80);
	
		boolean result1 = false;
		boolean result2 = false;
		boolean result3 = true;
	result1 = node.contains(50);
	result2 = node.contains(80);
	result3 = node.contains(500);
	
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	
	node.printInOrder();
	}

}
