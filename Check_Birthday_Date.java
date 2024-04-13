package Logic_Based_programs;
import java.util.*;
public class Check_Birthday_Date {
	
//	lisa always forget her birthday which is on 5th july so develop a function/method which will help to
//	remember her birthday
//	
//	The function/meyhod checkbirthday return an integet 1,if her birthday else return 0
//			the fuction should accept two arguments month and date

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month:");
		String month=sc.nextLine();
		System.out.println("Enter the day:");

		int day=sc.nextInt();
		if(month.equals("july") && day==5)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
		
	}

}
