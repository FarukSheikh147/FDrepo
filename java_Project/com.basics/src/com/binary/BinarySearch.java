package com.binary;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of ele");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Ele");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		Arrays.sort(arr);
		for(int a:arr) {
			System.out.println(a);
		}
	
		int res=binarySearch(arr,5);
if(res==-1) {
	System.out.println("Ele not found");
}else {
	System.out.println("Ele found at"+res);

}
		
	}

	private static int binarySearch(int[] arr, int key) {
		int low=0;
		int high=arr.length-1;
		int mid;
		
		while(low<=high) {
			mid=low+high/2;
			if(arr[mid]==key) {
				return mid;
			}else if(key<arr[mid]) {
				//searching left
				high=mid-1;
			}else {
				//searching right
				low=mid+1;
			}
		}
		return -1;
		
	}
	
	

}