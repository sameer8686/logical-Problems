package Logic_Based_programs;
//Given a String s,and a array indices of the same length,The String s will be shuffled such

import java.util.Scanner;

//that the characters at the 'i'th postion moves to indices[i] in the shuffled String,return
//		shuffled String

//Test case: String = aiohn Array=31420 output:nihao
//                                             01234
public class String_Array_indexes {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String value :");
		String s=sc.nextLine();
		int n=s.length();
		int[] a=new int[n];
		System.out.println("Enter the array values :");
		for(int i=0;i<n ;i++) {
			a[i]=sc.nextInt();
		}
		char[] b=new char[n];
		for(int i=0;i<n;i++) {
			b[a[i]]=s.charAt(i);
		}
		System.out.println("It will Arrange,and got your Value:"+new String(b));
		
		
		
		
		
		
		
		
		
		
		
	}

}
