package Logic_Based_programs;
import java.util.*;
public class Extract_Digits_From_Number {
	
//	Implement a program to extract digitd from th given number
	

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to Extract Digits");
		int n=sc.nextInt();
		int d;
		while(n != 0)
		{                                                       // n%10 for reminder                             
			d=n%10;                                             //  n/10 for coffient                            
			System.out.println(d);                                                                 
			n=n/10;                                                                       
		}
		
		
		
	}

}
