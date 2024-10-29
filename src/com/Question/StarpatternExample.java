package com.Question;

public class StarpatternExample {
public static void main(String args[]) {
	
	// i = 1, 1<=5 (true), j loop will run 1 time (1 star will be printed), i = 2
    // i = 2, 2<=5 (true), j loop will run 2 time (2 star will be printed), i = 3
    // i = 3, 3<=5 (true), j loop will run 3 time (3 star will be printed), i = 4
    // i = 4, 4<=5 (true), j loop will run 4 time (4 star will be printed), i = 5
    // i = 5, 5<=5 (true), j loop will run 5 time (5 star will be printed), i = 6

	for(int i= 1; i<=5; i++) { // 5 rows
		
		for(int j= 1; j<=i; j++) { // what we print in rows: 5 star
			
			System.out.print("*"); // print star
		}
		System.out.println(); // change line
	}
}
}
