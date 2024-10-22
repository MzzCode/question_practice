package com.Question;

public class AverageOfElement_inArray {
	public static void main(String[] args) {
		double sum = 0.0;
		
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		for(int i=0; i<=4;i++) {
			sum =  sum + arr[i];
		}
		double average = sum/4;
		System.out.println("average: "+average);
	}

}
