package studio1;

import java.util.Scanner;

public class Ordered {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean isOrdered;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();

		
		
		System.out.println("Value for y?");
		int y = in.nextInt();
		
		
		
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		isOrdered = (y > x && z > y || y < x && z < y);
		
		System.out.println(isOrdered);
		
	}

}
