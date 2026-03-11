package com.search;

public class LinearSearch {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int target=3;
		int flag=0;
		for(int i =0 ; i<arr.length; i++) {
			if(arr[i]==target) {
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("Element Found");
		}else {
			System.out.println("Element Not Found");
		}

	}

}
