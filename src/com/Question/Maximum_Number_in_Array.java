package com.Question;

public class Maximum_Number_in_Array {
	public static void main(String[] args) {
		int max= Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int arr[] = new int[4];
//		int size = arr.length;
//		int max = arr[0];
		arr[0] = 69;
		arr[1] = -4;
		arr[2] = 17;
		arr[3] = -1;
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i] > max) {
				max = arr[i];	
			}
			if(arr[i]<min) {
				min = arr[i];
			}
			
		}
		System.out.println("Maximum number in the array: "+ max);
		System.out.println("Minimum number in the array: "+ min);

}
}
