package Logic_Based_programs;

import java.util.Scanner;

//Create a function to find the first index value in the given String 
//take String value
//return index vlaue
public class String_Find_Index_Of_FirstVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
				break;
			}
		}

		System.out.println("First index vowel in String is at place of :"+count);
	}

}
