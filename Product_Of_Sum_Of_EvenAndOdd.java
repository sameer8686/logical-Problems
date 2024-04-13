package Logic_Based_programs;
//Ecommers website give discount to customer on the bill of by doing product of the 
// sum of even and sum of odd numbers
//write a program to find product of both sum of even and sum of odd number in the bill

import java.util.Scanner;

public class Product_Of_Sum_Of_EvenAndOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the bill amount :");
		int i=sc.nextInt();
		int c,d;
		int a=0;
		int b=0;
		
		while(i!=0) {
			d=i%10;
			if(d%2==0) {
				a=a+d;
			}else {
				b=b+d;
			}
			
			i=i/10;
		}
		c=a*b;
		
		System.out.println("Discount price from the bill is :"+c);
		
		
	}
	
}
