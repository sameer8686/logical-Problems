package Logic_Based_programs;

import java.util.Scanner;

//Write a program to find word in the given String "bomb" and it is not case sensetive
//create a function/method to find the word bomb  if found print duck or else print there is no 
//bomb relax
public class String_FindWord_Bomb {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
	    if(s.contains("bomb")) {
	    	System.out.println("Duck!");
	    }else {
	    	System.out.println("Relax there is no bomb");
	    }
		
		
		
		
		
	}

}
