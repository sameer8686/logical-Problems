package Logic_Based_programs;
import java.util.*;
public class Sum_of_even_inRange {

//	implementa program to find sum of even number between x and y
	
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the x value");
       int x=sc.nextInt();
       System.out.println("Enter the y value");
       int y=sc.nextInt();
       int sum=0;
       
       for(int i=x;i<=y;i++)
       {
    	   if(i%2==0)
    	   {
    		   sum=sum+i;
    	   }
       }
		System.out.println("The sum Of even digits in given range is:"+sum);
		
		
	}

}
