package Logic_Based_programs;
import java.util.Scanner;
public class First_Capital_Letter_inString {

//	implement a program to return First Capital letter in String
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				System.out.println("The first Captial letter is :"+s.charAt(i));
				break;
			}
		}
		
		
	}

}
