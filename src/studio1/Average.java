package studio1;

import java.util.Scanner;


public class Average {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.print("Enter the first number ");
		double n1 = in.nextInt();
		System.out.print("Enter the second number ");
		double n2 = in.nextInt();
		
		double averageNum = (n1 + n2)/2;
		
		System.out.println("the average is " + averageNum);
		
	}

}
