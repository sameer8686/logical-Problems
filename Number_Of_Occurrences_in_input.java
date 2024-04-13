package Logic_Based_programs;
import java.util.*;
public class Number_Of_Occurrences_in_input {

//	number Of Occurrences
//	Program to find number of occurences of the given digit
//	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number first: ");
		int i=sc.nextInt();
		System.out.println("Enter the number you want see how many times it repeted: ");

		int o=sc.nextInt();
		int d,count=0;
		while(i!=0)
		{
			d=i%10;
			if(d==o)
			{
				count++;
			}
			i=i/10;
		}
		System.out.println("It repeted:"+count);

		
		
	}

}
