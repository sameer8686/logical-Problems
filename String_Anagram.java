package Logic_Based_programs;

import java.util.Arrays;
import java.util.Scanner;

//Anagram
//Two String a and b are called anagram ,if they contain all the same characters in the same
//fewquencies
//test Case: a=abc b=bca o/p:true  if a=abc , b=bcc o/p:false

public class String_Anagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch1[]=sc.nextLine().toCharArray();
		char ch2[]=sc.nextLine().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.equals(ch1,ch2));
		
		
	}

}
