package Logic_Based_programs;
import java.util.*;
class Sum_prime_numbers_inGiven_Number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to sum the Prime number present in numbers:");
		int n=sc.nextInt();
		int d=0;
		int sum=0;
		while(n != 0)
		{
			d=n%10;
			if(d==2 || d==3 || d==5 || d==7)
			{
				sum=sum+d;
			}
			n=n/10;
		}
		System.out.println("sum of Prime Number In given Number Is :"+sum);
	}

}
