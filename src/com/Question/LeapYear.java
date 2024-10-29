package com.Question;

public class LeapYear {
			public static void main(String args[]) {
				int year = 2000;
			//  int year = 2003;
			if(year%4 == 0)
			{
			    if(year%100 == 0)
			    {
			        // now it has to be divisible by 400 for being a leap year 
			        if(year%400 == 0) // divisible by 4, divisible by 100 and 400, Example - 2000, 1600, 1200
			        {
			            System.out.println(+year+ " is leap year" );
			        }
			        else // Example - 1900, 1700, 1500 (They are not leap)
			        {
			        	 System.out.println(+year+ " is not leap year" );
			        }
			    }
			    else // Example - 2008, 2012, 2004, 2016, 2020 
			    {
			    	 System.out.println(+year+ " is leap year" );
			    }
			}
			else // not divisible by 4 (Not a leap year) // Example - 1997, 2003, 2007, 2005 
			{
				 System.out.println(+year+ " is not leap year" );
			}
		}
	}
