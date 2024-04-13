package Logic_Based_programs;

import java.util.Scanner;

//Create a Function to find Middle Character of the String 
//if the character length is even print middle two character if odd print only one middle char
public class String_Find_Middle_Character {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    int n=s.length();
	    if(n%2==0) {
	    	System.out.println(s.charAt(n/2 - 1)+""+s.charAt(n/2));
	    }
	    if(n%2!=0) {
	    	System.out.println(s.charAt(n/2 ));
	    }

	}

}
