package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub

		System.out.print("Enter the year ");
		double year = in.nextInt();
		
		boolean t1 = year % 4 == 0;
		boolean t2 = year % 100 != 0;
		boolean t3 = year % 400 == 0;
	
		boolean leapYear = (t1 && t2 || t3);
		
		System.out.println(year + " is a leap year: " + leapYear);
		
		
	}

}
