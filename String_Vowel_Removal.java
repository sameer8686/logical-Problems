package Logic_Based_programs;

import java.util.Scanner;

//Create a function that remove all vowels in the given String and give new vowel removed String
public class String_Vowel_Removal {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s.replaceAll("[aeiou]", ""));
		
		
	}

}
