package com.Question;

public class EvenCountinArray {
	public static void main(String args[]) {
		int evenCount =0;
		 
		int arr[] = new int[]{1,4,5,2,6};
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] % 2 ==0) {
				evenCount++;
			}
		}
		System.out.println("Number of even elements in the array: " +evenCount); // Ans: 3
	}

}
