package com.ds.linkedlist;

public class LinkedList {
	
	Node head;
	
	class Node;
	
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
			
		}
}

public void insertFirst(int newData) {
	Node newNode = new Node(newData);
	newNode.next =head;
	head=newNode;
}
public void insertAtNode(int newData) {
	Node temp=head;
	while(temp!=null) {
		if (temp.data==prevData) {
			Node newNode = new (newData);
			newNode.next = temp.next;
			temp.next = newNode;
			return;
		}
		temp = temp.next;
	}
}
public void insertAtEnd(int newData) {
	Node newNode = new Node(newData);
	if(head == null) {
		head = newNode;
		return;
	}else {
		
		Node last;
		last = head;
		
		while(last.next != null) {
			last = last.next; 
		}
		//Move the control to the end of the list after completion of a while loop
		last.next = newNode;
	}
} 
	public void deleNode(int value) {
		boolean found = searchNode(value);
		if(found) {
			if(head.data==value) {
				
				head = head.next;
				
			}else {
				Node temp =head.next;
				Node prev =head;
				while(temp != null) {
					
					if (temp.data==value) {
						prev.next =temp.next;		
					}
					prev=prev.next;
					temp =temp.next;
					
				}
			}
			}else{
					
					System.out.println("Element not found");
				}
				
			}
		
	
	public boolean searchNode( int key) {
		Node temp = head;
		while(temp!= null) {
			if(temp.data==key) {
				return true;
			}else {
				temp = temp.next;
			}
		}
		return false;
		
	
  }
	public void  printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
   public static void main(String[]aegs) {
	   LinkedList l1= new LinkedList();
	   l1.insertAtNode(5);;
	   l1.insertAtNode(6);
	   l1.insertAtNode(7);
	   l1.insertAtNode(8);
	  
	   l1.insertFirst(2);
	   l1.insertAtNode(7,10);
	   l1.printList();
	   System.out.println("NodeList after deleting head");
	   l1.deleNode(8);
	   l1.printList();
	   
	   boolean result = l1.searchNode(7);
	   System.out.println(result);
	   
	   boolean result1 = l1.searchNode(9);
	   System.out.println(result1);
}


