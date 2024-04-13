package Logic_Based_programs;

import java.util.Scanner;

/* jackson a math student ,is develping an application non prime number .....
jackson  has to write an algorithum to find the sum of all prime number of the given Range

*  Ex: range from 1 to 10 is 2,3,5,7, sum is :17
*/

public class Prime_number_Range_calculation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int l=sc.nextInt();
		System.out.println("Enter the End number :");
		int h=sc.nextInt();
		int sum=0;
		
		for(int i=2;i<=h;i++) {
			
			int count=0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					count++;
				}
				
			}
			if(count++==2) {
				System.out.print(" "+i);
				sum=sum+i;
			}
			
		}
		System.out.println(" ");
		System.out.println( " sum of the range is :"+sum);
		
		
	}

}
