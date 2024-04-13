package Logic_Based_programs;

import java.util.Scanner;

public class Even_Odd_number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in)
				;
						int n;
						n=sc.nextInt();
						if(n>=0)
						{
							
						
						if(n%2 ==0)
						{
							System.out.println("enter number is Even");
						}
						else
						{
							System.out.println("enter number is Odd");

						}
						}
						else
						{
							System.out.println("Enter the postive number");
						}
						System.out.println("Given number is :"+n);
					}
		
	}


