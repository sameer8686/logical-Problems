package Logic_Based_programs;

import java.util.Scanner;

public class Even_with_Conditions {

	public static void main(String[] args) {

//		take input from user n
//		if n is odd,print weird,
//		if n is even and in inclusive range of 2 and 5 ,print Not weird
//		if n is even and in inclusive range of 6 and 20 ,print weird
//		if n is even and in inclusive range of 21 and infintiy ,print Not weird

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Integer number to Check Even or Odd:");
		int n=sc.nextInt();
		if(n>=0)
		{
			if(n%2==0)
			{
				if(n>=2 && n<=5)
				{
					System.out.println("Not Weird");
				}
				else if(n>=6 && n<=20)
				{
					System.out.println("weird");
				}
	 			else if(n>=21)
				{
					System.out.println("Not Weird");
				}
			}
			else
			{
				System.out.println("Entered number is Odd"+n+"it is Weird");
			}
		}
		else
		{
			System.out.println("Enter Integer only");
		}
		
		
	}

}
