package com.Question;

import java.util.Scanner;

public class SumEvenNumtoN2 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = sc.nextInt();
		 // Calculating the number of even numbers up to 'num' 
		//(i.e., how many even numbers exist between 1 and 'num')
		int n = num/2;
		 
		// Using the formula sum = n * (n + 1) to calculate the sum of all even numbers up to 'num'	
		int sum = n*(n+1);
		
		// Printing the final sum of even numbers up to 'num'
		
		System.out.println("Sum of even number to "+num+ " is: "+sum);
		sc.close();
		
		/*output:  Enter your number: 8
Sum of even number to 8 is: 20
		 */
	}

}
