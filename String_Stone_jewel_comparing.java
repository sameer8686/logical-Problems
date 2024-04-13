package Logic_Based_programs;
//jewels and Stone
//You are given String jewels representing the types of stone that are jewels and stones representing 
//the stones you have,each character is stone is type of stone you have ,you want to know many of the stones
//you have in jewel

import java.util.Scanner;

// Test case: stone=aA jewel=aaAbbb  output=3  (a is present 2 times in jewel, A present 1 time)

public class String_Stone_jewel_comparing {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Stones you have :");
		String stone=sc.nextLine();
		System.out.println("Enter the Jewel you jave :");
		String jewel=sc.nextLine();
		int count=0;
		for(int i=0;i<stone.length();i++) {
			
			for(int j=0;j<jewel.length();j++) {
				
				if(stone.charAt(i) == jewel.charAt(j)) {
					count++;
				}
			}
			
		}
		System.out.println("Number of Stone in your Jewel match is:"+count);
		
			
	}

}
