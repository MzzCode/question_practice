package com.Question;

public class MaxandMininArray {
	
	// Method to find and print the maximum and minimum elements in the array
	public static void minAndMaxInArray(int arr[], int n) {
	
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		// Loop through the array to find the max and min values
		for(int i= 0; i<n; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
			if(arr[i]<min) {
				min = arr[i];
			}
			
		}
	System.out.println("max element: "+ max);
	System.out.println("min element: "+ min);
    
	}
	public static void main(String args[]) {
		 // Initialize an array
		int arr[] = {2,6,-3,-8,1,7,3,2,5};
		
		int n = arr.length;
		
		// Call the method to find and print the max and min elements		
		minAndMaxInArray(arr, n);
		}

}
