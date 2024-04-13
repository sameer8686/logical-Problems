package Logic_Based_programs;
import java.util.*;
public class Amstrom_number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int d;
		int sum=0;
		while(n!=0)
		{
			d=n%10;
             if(d<=9)
             {
            	 sum=sum+d*d*d;
             }
			n=n/10;
		}

		if(temp == sum)
		{
		System.out.println("it is amstrom number:"+sum);
		}
		else
		{
			System.out.println("it is not amstrong number:"+sum);
		}
	}
		
		
	}


