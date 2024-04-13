package Logic_Based_programs;
import java.util.*;
public class Reverse_Integer_Given_input {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to Reserve This number");
		int n=sc.nextInt();
		int d;
		
		while(n!=0)
		{
		d=n%10;
		n=n/10;
		System.out.print(d);
		}

	}

}
