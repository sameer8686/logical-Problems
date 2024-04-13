package Logic_Based_programs;
import java.util.*;
public class String_Count_Spaces_SpecialChar {

//	Program to count number of spcial characters and white speces in the given String
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i,counter=0;
		for(i=0;i<s.length();i++)
		{
			if((s.charAt(i)>=65 && s.charAt(i)<=90)||(s.charAt(i)>=97 && s.charAt(i)<=122)||s.charAt(i)<=48 && s.charAt(i)<=57)
				continue;
			else
				counter++;
		}
		System.out.println(counter);
		
	}

}
