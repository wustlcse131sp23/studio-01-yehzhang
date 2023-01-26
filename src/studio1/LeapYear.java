package studio1;

import java.util.Scanner;

public final class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Year: ");
		int year = in.nextInt();
		
		boolean divisible4 = year % 4 == 0;
		boolean not100 = year % 100 != 0;
		boolean divisible400 = year % 400 == 0;
		
		boolean leapyear = (divisible4 && not100) || divisible400;
		
		System.out.println(year + "is a leap year: " + leapyear);
	}

}
