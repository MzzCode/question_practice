package com.Question;
import java.util.*;
public class SumOf_NumberIn_Range {
public static void main(String args[]) {
	int sum =0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your starting number: ");
	int start= sc.nextInt();
	System.out.print("enter your ending number ");
	int end = sc.nextInt();
	for(int i=start; i<=end; i++){
		sum = sum + i;
	}
	System.out.println("Sum of the given number in range "+start+" to " +end+" is: " +sum );
	
	sc.close();
	
}
}
