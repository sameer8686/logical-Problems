package Logic_Based_programs;
import java.util.*;
public class Sum_of_Digits_InGiven_Number {

	//Sum of even Digits
	//Implement a program to calculate sum of Even Digit in given number
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int d;
		int odd=0;
		
		while(n !=0)
		{
			d=n%10;
			if(d%2==0)
			{
				sum=sum+d;

			}
			else
			{
				odd=odd+d;
			}

			n=n/10;

		}
		System.out.println("Sum of Even Digits in Given Number is: "+sum);
		System.out.println("Sum of Odd Digits in Given Number is: "+odd);


		
		
	}

}
