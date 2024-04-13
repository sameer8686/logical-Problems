package Logic_Based_programs;
import java.util.*;
public class Sum_OF_Digits_Dividable_by_Three {

//	Implenment a program to sum of digits divisible by 3
	
	public static void main(String[] args) {

		//first logic 
		
		Scanner sc=new Scanner(System.in);
		int i,d,s=0;
		i=sc.nextInt();
//		while(i!=0)
//		{
//			d=i%10;
//			if(d%3 == 0)
//			{
//				s=s+d;
//			}
//			i=i/10;
//		}
//		System.out.println(s);
//		
		
		//second logic
		
		while(i!=0)
		{
			d=i%10;
			if(d==1||d==3||d==6||d==9)
			{
				s=s+d;
			}
			i=i/10;
		}
		System.out.println(s);
	}

}
