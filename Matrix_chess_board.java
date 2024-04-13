package Logic_Based_programs;

import java.util.Scanner;

//Determine the color of a chess board square
//you are given coordinate,a String that ewpresents the coordinate of a square of the chess
//Return true if the Square is in white ,and false is in black
//if i/p:a1=black=false,i/p=a2=white=true;i/p:b1=white=true
public class Matrix_chess_board {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		int x=s.charAt(0)-96;
		int y=s.charAt(1);
		System.out.println(x%2!=y%2);
		
		
		
	}

}
