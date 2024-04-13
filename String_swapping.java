package Logic_Based_programs;

import java.util.Scanner;

public class String_swapping {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First name:");
		String f=sc.nextLine();
		System.out.println("Enter the last name:");
		String l=sc.nextLine();
		System.out.println("Your Full name is:"+f+" "+l);
		String t=f;
		f=l;
		l=t;
		System.out.println("Your Full name After Swapping is:"+f+" "+l);
		
	}

}
