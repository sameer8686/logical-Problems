package Logic_Based_programs;
import java.util.Scanner;
public class Niven_Number {

//	Write a program to accept a number and check and display it is niven number or not.
//	Niven number is thst a number ehich is divisible by it's sum of digits
//	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d;
		int sum=0;
		int temp=n;
		
		while(n!=0)
		{
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		
		if(temp%sum==0)
		{
			System.out.println("It is Niven number");
		}
		else
		{
			System.out.println("it is not Niven Number");
		}
		
		
		
	}

}
