package Logic_Based_programs;

import java.util.Scanner;

//The E-commerce compnay bookshelf wishes to analyse it's monthly sales data between minimumrange 30is min and 100 max
//the company has catogoried three book sales into four groups depending on the number of sales with the help 
//of these company will know it's stock they should increse or decrese in thier inventory
//
//sales tange             groups
//30-50 ----------------->D
//51-60------------------->C
//61-80------------------->B
//81-100------------------>A

public class SalesCount_Bookshelf {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 int salesCount=sc.nextInt();
		 if(salesCount>=30 && salesCount<=100)
		 {
			 if(salesCount>=30 && salesCount<=50)
			 {
				 System.out.println("D");
			 }
			 else if(salesCount>=51 && salesCount<=60)
			 {
				 System.out.println("c");
			 }
			 else if(salesCount>=61 && salesCount<=80)
			 {
				 System.out.println("B");
			 }
			 else
			 {
				 System.out.println("A");
			 }

		 }
		 else
		 {
			 System.out.println("Invalid");
		 }
		

		
		
	}

}
