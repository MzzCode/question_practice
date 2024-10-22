package com.Question;

import java.util.Scanner;

public class SumEvenNumtoN {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Number: ");
	
	int n = sc.nextInt();
	 // Initializing a variable 'sum' to store the sum of even numbers
	int sum = 0;
	
	// A for loop that starts from 2 and increments by 2 on each iteration
    // This loop will add all even numbers from 2 to 'n' to the 'sum'
	
	for(int i= 2; i<=n; i += 2 ) {
		sum += i;
	}
	
	// Printing the final sum of even numbers up to 'n'
	System.out.println("Sum of Even number till "+n+ " is: " +sum);
	
	sc.close();
	
/*
Step-by-Step Execution for n = 12:
Iteration 1: i = 2, sum = 0 + 2 = 2
Iteration 2: i = 4, sum = 2 + 4 = 6
Iteration 3: i = 6, sum = 6 + 6 = 12
Iteration 4: i = 8, sum = 12 + 8 = 20
Iteration 5: i = 10, sum = 20 + 10 = 30
Iteration 6: i = 12, sum = 30 + 12 = 42

Output: Enter your Number: 
12
Sum of Even number till 12 is: 42
 */
}
}