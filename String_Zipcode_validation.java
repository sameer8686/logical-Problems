package Logic_Based_programs;

import java.util.Scanner;

//Zipcode Validation
//Create a function that take String as Zipcode Check Below Validations
//1.zipcode should contain only numbers
//2.zipcode should contain any spaces
//3.zipcode length should be 5 only
public class String_Zipcode_validation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>= '0' && s.charAt(i) <= '9') {
				count++;
			}
		}
		if(5==count) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
