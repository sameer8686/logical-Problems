package Logic_Based_programs;

import java.util.Scanner;

//Consecutive String 
//Create a program to find in String to consecutive letters
public class String_Consecvtive_letters {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
				break;
			}
		}
		if(count++<=2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
	}

}
