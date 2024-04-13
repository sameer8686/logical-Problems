package Logic_Based_programs;

import java.util.Scanner;

//create a function/method to fing vowel in the given String and return number of vowels in the
//		String
public class String_Find_Vowels {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ) {
				count++;
			}
		}
		
		System.out.println("Number of vowels present in the String is:"+count);
		
		
	}

}
