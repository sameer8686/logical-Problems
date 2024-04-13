package Logic_Based_programs;

import java.util.Scanner;

//Create a function that take name and number if number is '1' then print Hello+name else "bye+name"
public class String_Number_ByName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name=sc.nextLine();
		System.out.println("Enter the number '1' or '0' :");
	    int num=sc.nextInt();
	    if(num==1) {
	    	System.out.println("Hello "+name);
	    }else {
	    	System.out.println("Bye "+name);
	    }

	}

}
