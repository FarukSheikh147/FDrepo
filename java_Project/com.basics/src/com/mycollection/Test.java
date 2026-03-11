package com.mycollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		
	List <String> emp= new ArrayList();
		emp.add("Rahul Mahajan");
		emp.add("Faruk Sheikh");
		emp.add("Mohan Singh");
		emp.add("Ravi Raj");
		emp.add("Kajal Sharma");
		System.out.println(emp);
		
		System.out.println("------------------------");
		// for each loop
		for(String employees : emp) {
			System.out.println(employees);
		}
		System.out.println("------------------------");
		
		System.out.println("Traversing Using Iterator");
		Iterator <String> it =emp.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("------------------------");
		
		System.out.println("Traversing element in forward order");
		ListIterator <String> listit = emp.listIterator();
		while(listit.hasNext()) {
			System.out.println(listit.next());
		}
		System.out.println("------------------------");

		System.out.println("Reverse Order Printing");
		while(listit.hasPrevious()) {
			System.out.println(listit.previous());
		}
		
	}

}
