package Logic_Based_programs;

import java.util.Scanner;

//Create a function which take String and return Strin gin the form of each letter should contain 
//		space betwwen them
public class String_separate_With_Space_eachWord {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+" ");
		}
		
//		String s=sc.nextLine();
//		System.out.println(s.replace(""," "));
//		
		
	}

}
