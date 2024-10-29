package com.Question;

//solving pattern question with the help of Extra variable Method

public class StarpatternExample2 {
	public static void main(String[] args) {
		
		int numberOfSpaces =4; // create extra variable for space
		int numberOfStar = 1; // create extra variable for Star
		
		for(int i=1; i<=5; i++) { // outer loop for no. of rows
			
			//first inner loop for no.of spaces
			
			for(int j =1; j<=numberOfSpaces; j++) 
			{
				System.out.print(" ");	
			}
			//Second inner loop for no.of star
			
			for(int j=1; j<=numberOfStar; j++) 
			{
				System.out.print("*");
			}
			
			numberOfSpaces = numberOfSpaces - 1;
			numberOfStar = numberOfStar + 1;
			System.out.println();
		}
		
	}

}
