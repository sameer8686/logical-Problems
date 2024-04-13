package Logic_Based_programs;
import java.util.*;
public class Special_Two_Digit_Number {

//	special two digit number is a number such that when the sum of digits added to product of that 
//	two digits should be equal to orginal value given by user
//	
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a,b,c;
       
       a=n%10;
       b=n/10;
       c=(a+b)+(a*b);
       if(n==c)
       {
    	   System.out.println("yes it is special number");
       }
       else
       {
    	   System.out.println("No it not special number");
       }
		
		
	}

}
