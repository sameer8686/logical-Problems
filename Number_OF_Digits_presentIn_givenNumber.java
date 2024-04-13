package Logic_Based_programs;
import java.util.*;
public class Number_OF_Digits_presentIn_givenNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to Count the digitd");
		int n=sc.nextInt();
		int count=0;
		int d;
		while(n!=0)
		{
			d=n%10;
			n=n/10;
			count++;
		}
		System.out.println("The Number of digits present in given number is:"+count);
		
	}

}
