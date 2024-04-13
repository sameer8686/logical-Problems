package Logic_Based_programs;

import java.util.Scanner;

//Defanging an IP address
//Given a valid IP address a defanged version of that IP address.
//A defanged IPadress replaces every Period   '.'   with "[.]"

public class String_replace_withDot {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s.replace(".", "[.]"));
			
		}
		
		
	

}
