package com.Question;

import java.util.Scanner;

//solving pattern question with the help of Extra variable Method
// input from user

public class StarPatternExample4 {
public static void main(String[] args) {
	
	// taken input from user
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your number:");
	int n= sc.nextInt();
	
	
	// Extra Variable
	int numberOfSpaces = n-1;
	int numberOfStar = 1;
	
	// outer loop for rows
	for(int i=1; i<=n; i++) {
		
		// first inner loop for spaces
		for(int j=1; j<=numberOfSpaces; j++) {
			System.out.print(" ");
		}
			// 2nd inner loop for star
			for(int j=1; j<=numberOfStar; j++) {
				System.out.print("*");
			}
			numberOfSpaces = numberOfSpaces -1;
			numberOfStar = numberOfStar + 1;
			System.out.println();
			sc.close();

		}
			
	}
}
