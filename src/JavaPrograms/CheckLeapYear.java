package JavaPrograms;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		// divisible by 4 for all the century years ---> century years means years which ending with 00
		// century year is leap year only when its perfectly divisible by 400.
		//1900 is not a leap year
		// 2012 is a leap year
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = s.nextInt();
		boolean leap = false;
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					leap = true;
				}
				else {
					leap = false;
				}
			}
			else {
				leap = true;
			}
		}
		else {
			leap = false;
		}
		if(leap) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}
	}

}
