package Logic_Based_programs;
import java.util.*;
public class primenumber_low_high {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number:");
		int l=sc.nextInt();
		System.out.println("Enter the End number :");
		int h=sc.nextInt();
		
		for(int i=l;i<=h;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{

				count++;
				}
			}
			if(count==2)
			{
				System.out.print(" "+i+" ");
			}
		}
			
			
		
		
	}

}
