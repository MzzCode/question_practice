package com.Question;

public class StarpatternExample5 {
	public static void main(String args[]) {
		
		// Extra variable
		int n=3;
		int numberOfSpaces = n-1;
		int numberOfStars = 1;
		
		// outer loop for rows
		for(int i=1; i<=n; i++) {
			
			//first inner loop for spaces
			for(int j =1; j<=numberOfSpaces; j++) {
				System.out.print(" ");
			}
			
			// 2nd inner loop for star
			for (int j= 1; j<=numberOfStars; j++) {
				System.out.print("*");
			}
			numberOfSpaces = numberOfSpaces -1;
			numberOfStars = numberOfStars + 2;
			System.out.println();
		}
	}

}
