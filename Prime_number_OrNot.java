package Logic_Based_programs;
import java.util.*;
public class Prime_number_OrNot {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check Prime Or Not");
		int num=sc.nextInt();
		int count=0;
		
		//method 1;
		
		for(int i=2;i<=num;i++)
		{
			count++;
			if(num%i !=0 && count++ == 1)
			{
				System.out.println("Entered number is prime :"+num);
			}
			else if(count++ <=2)
			{
				System.out.println("enter number is not prime:"+num);

			}
		}

		//method 2
		
//		for(int i=1;i<=num;i++)
//		{
//			if(num%i==0)
//			{
//				count++;
//			}
//		}
//    if(count==2)
//    {
//    	System.out.println("it is prime number");
//    }
//    else
//    {
//    	System.out.println("it is not prime number");
//    }
		
		
	}

}
