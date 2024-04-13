package Logic_Based_programs;
import java.util.*;
public class Palimdrome_String {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the name to check palidrom or not:");
   String s=sc.nextLine();
   StringBuffer sb=new StringBuffer(s);
   sb.reverse();
   String s1=sb.toString();
   if(s.equals(s1))
   {
	   System.out.println("it is palimdrom");
   }
   else
   {
	   System.out.println("it is not palimdrom");

   }
		
		
	}

}
