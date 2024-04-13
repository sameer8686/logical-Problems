package Logic_Based_programs;

import java.util.Scanner;

//Andy,Ben and Charlotte playing board game
//The three of them come up with new score System
//A players first intinal('A''B'&'C')denotes players scoreing single point
//given a String of Capitial letters and return Array of the Score
public class String_letters_Score_board {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toUpperCase();
		int a=0,b=0,c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A') {
				a++;
			}
			if(s.charAt(i)=='B') {
				b++;
			}
			if(s.charAt(i)=='C') {
				c++;
			}
		}
		System.out.println("A player Score is:"+a);
		System.out.println("B player Score is:"+b);
		System.out.println("C player Score is:"+c);

		
		
		
		
	}

}
