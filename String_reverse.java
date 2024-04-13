package Logic_Based_programs;

import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		StringBuffer n = sb.reverse();
		System.out.println("Reversed String is:"+n.toString());

	}

}
