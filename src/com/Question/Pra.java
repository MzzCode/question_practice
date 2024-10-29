package com.Question;
import java.util.*;
public class Pra {
public static void main(String[] args) {
	System.out.println("*\n**\n***\n****");
	System.out.println("area of circle");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your radius: ");
	int r = sc.nextInt();
	System.out.println("pi value: ");
	float pi = sc.nextFloat();
	
	int area = (int)pi*r*r;
	System.out.println("Arae of circle is: " +area);
	sc.close();

}
}
