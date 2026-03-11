package com.mycollection;

import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
	
		ArrayList a1= new ArrayList();
		a1.add(2);
		a1.add("Faruk Sheikh");
		a1.add(true);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		System.out.println("Second element of a collection: "+a1.get(2));

	}

}
