package Logic_Based_programs;

import java.util.Scanner;

public class Conversion_Varios_temp_degrees {

//	Implement a program to convert celsius to fahrenheit  
//	formula:f=(c*9/5)+32
//	Implement a program to convert  fahrenheit to celsius
//	formula:C = 5/9(F-32)
//	
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the value of celsius c:");
//     int c=sc.nextInt();
//     int f;
//     f=(c*9/5)+32;
//     System.out.println("The of fahrenheat is F:"+f);
//     
     System.out.println("Enter the value of fahranheat F:");
     int f=sc.nextInt();
     int c;
     c=(f-32)*5/9; 
     System.out.println("The of celsuis is C:"+c);
     
		
	}

}
