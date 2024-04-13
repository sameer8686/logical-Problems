package Logic_Based_programs;

import java.util.Scanner;

//Re-form the Word
//A word has been split into a left and right part,Re-form the word by adding both halves together
//changing the first to an UpperCase Letter.
public class String_upperCase_Concat {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Left part :");
		String s1=sc.nextLine();
		System.out.println("Enter the Right part :");
		String s2=sc.nextLine();
		String last=s1.substring(0,1).toUpperCase()+s1.substring(1)+s2;
		System.out.println(last);
		
	}

}
