package Logic_Based_programs;
import java.util.*;
class Toggle_ofString_ {

//	imlement a program to calculate toggle case of each character of string
//	
//	Toggle means if String is in upper case chnage to lower case vise varsa
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				System.out.print((char)(s.charAt(i)+32));
			}
			else
			{
				System.out.print((char)(s.charAt(i)-32));
			}
		}
	}

}
