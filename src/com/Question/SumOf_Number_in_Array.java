package com.Question;

public class SumOf_Number_in_Array {
	public static void main(String[] args) {
		
		int sum =0;
//		int arr[] = new int[]{1,4,2}; // it is also a method to represent element in array
		
//		int arr[] = {1,4,2}; // it also a way
		
		int arr[] =new int[3];  // we can also use 
		arr[0] = 1;
		arr[1] = 4;
		arr[2] = 2;
		int size = arr.length;
		for(int i=0; i<size; i++) {
			sum = sum + arr[i];
		}
		System.out.print("Sum: "+sum);
		
	}

}
