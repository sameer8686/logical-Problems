package Logic_Based_programs;
import java.util.*;
public class Paliandrom_Number {

	//palimdron program to check the number or letters palimdrom are not
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s2=new String(sb);

		if(s.equals(s2))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("NO");
		}
		
		
		
	}

}
