package Logic_Based_programs;

import java.util.Scanner;

//Nobody Know's
//create a funtion that check wether given String contain O and X if found 
//Rules:
//	1.return true if both O and X have in same number 
//			2.return false if they dont have same number of O and X
//					3.return true if String doesn't contain any O and X
public class String_Find_O_X {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		int o=0;
		int x=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='o') {
				o++;
				}
			if(s.charAt(i)=='x') {
				x++;
			}
		}
		if(x==o) {
			System.out.println("true ");
		}else {
			System.out.println("false");
		}
		
	}

}
