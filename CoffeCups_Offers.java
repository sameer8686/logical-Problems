package Logic_Based_programs;

import java.util.Scanner;

public class CoffeCups_Offers {

//	For each of the 6 coffe cups Ibuy,I get a 7th cup free.In total ,i get 7 cups.
//	Implement a program that takes n cups bought and print as an integer the total number of cups I would
//	get.
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("For every 6 coffee cups You Buy ,YOu will get 1 Coffee Cup Free");

		System.out.println("Enter the coffee cups u want to buy:");
		int n=sc.nextInt();
		int offer;
	    offer=n + n/6 ;
	    System.out.println("you bought coffee cups:"+n);
	    System.out.println("you get free coffee cups is :"+ n/6);
		
		
	}

}
