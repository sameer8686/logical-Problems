package Logic_Based_programs;
import java.util.*;
public class LeapYear_NotLeapYear {

	public static void main(String[] args) {

		System.out.print("Enter the Year:");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		if((y%4==0 && y%100!=0)||(y%400==0))
		{
			System.out.println(" true");
		}
		else
		{
			System.out.println("false");
		}
		
	}

}
