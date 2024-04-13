package Logic_Based_programs;

import java.util.Scanner;

//Check if String ending matches second String
//create a function/method that takes Two String and return true of the first String end with 
//		Second String,otherwise return false
public class String_ending_match_second_String {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String :");
		String s1=sc.nextLine();
		System.out.println("Enter the Second String to check if ends with first String :");
		String s2=sc.nextLine();
		if(s1.endsWith(s2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
		
		
	}

}
