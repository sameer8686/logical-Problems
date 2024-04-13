package Logic_Based_programs;

import java.util.Scanner;
import java.util.StringTokenizer;

//Longest Word
//Find the logest word in the sentence in the given String 
//if two or more character are found then return first character
public class String_Find_Longest_Character {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s);
		String res="";
		int m=0;
		while(st.hasMoreElements()) {
			
			String token=st.nextToken();
			if(token.length()>m) {
				m=token.length();
				res=token;
			}
									
		}
		System.out.println(res);
		
	}

}
