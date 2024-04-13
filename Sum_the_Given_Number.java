package Logic_Based_programs;

import java.util.Scanner;

public class Sum_the_Given_Number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to Sum given number :");
		int n = sc.nextInt();
		int d;
		int sum =0;
		
		while(n != 0)
		{
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println(" Sum is :"+sum);

		
	}

}
