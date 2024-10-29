package com.Question;

import java.util.Scanner;

public class SumofallNaturalN {
	public static void main(String args[]) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
	
		
		/* by using iteration	
		int sum = 0;
		
	for(int i = 1; i<=num; i +=1 ) {
		sum = sum +i;
		
	}
	*/
		
		//by using formula
		// Using the formula to calculate the sum of all natural numbers up to 'num'
	
			int sum = num*(num+1)/2;
	
		System.out.println("sum of your natural number is: " +sum);
	
	sc.close();
	
	/* output
	 Enter your number: 4
sum of your natural number is: 10
	 */
	}

}
