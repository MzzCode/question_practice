package com.Question;
import java.util.*;

public class AreaofRectangle {
			
		public static void main(String args[]) {
			
			// Write code here
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter length");
			int length  = sc.nextInt();
			System.out.println("Enter breath");
			int breath = sc.nextInt();
			int area = length*breath;
			System.out.println(area);
			sc.close();
		}
	}
