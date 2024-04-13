package Logic_Based_programs;
//Take input from user year,month,date and check condition for magic date

// 1) mm*dd is 1-digit then if it matches with last digit of the yyyy
//1) mm*dd is 2-digit then if it matches with two last digit of the yyyy
//1) mm*dd is 3-digit then if it matches with three last digit of the yyyy

import java.util.Scanner;

public class Magic_DateOfBirth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		System.out.println("Enter the month :");
		int month=sc.nextInt();
		System.out.println("Enter the date :");
		int date=sc.nextInt();
		
		if(month*date==year%10 || month*date== year%100 || month*date == year%1000 ) {
			System.out.println("You Have the Magic Date :"+date+"-"+month+"-"+year);
		}
		
		

		
		
		
		
		
		
		
		
		
	}

}
