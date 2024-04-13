package Logic_Based_programs;
import java.util.*;
public class Reverse_the_Number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number for Resevese:");
		int i;
		int n=sc.nextInt();
		while(n != 0)
		{
			i=n%10;                            //n%10 for the reminder
			System.out.print(i);               //n/10 for the coffient
			n=n/10;
		}
		
		
		
	}

}
