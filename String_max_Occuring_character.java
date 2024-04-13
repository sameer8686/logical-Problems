package Logic_Based_programs;

import java.util.Scanner;

//Max Occuring Character
//Given a String ,implement a program to find max occuring character in the given String
//test case:welcome =>e 
public class String_max_Occuring_character {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int a[]=new int[256];
		int max;
		for(int i=0;i<s.length();i++) {
			a[(int)s.charAt(i)]++;
		}
		max=0;
		for(int i=0;i<256;i++) {
			if(a[i]>a[max])
			max=i;
		}
		System.out.println((char)max);
		
	}

}
