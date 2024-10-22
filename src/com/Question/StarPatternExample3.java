package com.Question;

//solving pattern question with the help of Relational Method

public class StarPatternExample3 {
	public static void main(String[] args) {
		//outer loop for rows
		
		for(int i =1; i<=5; i++) {
			
			// First Inner loop for spaces
			
			for(int j=1; j<=5 -i; j++) {
			System.out.print(" ");
		}
		// second Inner loop for star
		
		for(int j =1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
