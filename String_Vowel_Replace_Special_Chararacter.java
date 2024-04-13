package Logic_Based_programs;

import java.util.Scanner;

//Create a function that take String and replace vowel in that with specified character
public class String_Vowel_Replace_Special_Chararacter {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		System.out.println("Enter the character to replace vowel :");
		String c=sc.nextLine();
		System.out.println(s.replaceAll("[aeiou]",c));
		
		
		
	}

}
