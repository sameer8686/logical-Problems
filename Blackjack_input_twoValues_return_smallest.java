package Logic_Based_programs;

import java.util.*;
public class Blackjack_input_twoValues_return_smallest {

//	implement the following function int black jack (int n1,int n2)
//	the function accepts two +ve values n1,n2 as its Arguments.args.
//	implemnet the function on given two values to return an int value as follows
//			ewturn which ever is nearest to 21 without going over .return if they go both go over
	static int bj(int n1,int n2)
	{
		if(n1>21 && n2>21)
			return 0;
		if(n1>21)
			return n2;
		else if(n2>21)
			return n1;
		else
			return Math.max(n1, n2);
		
	}
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(bj(n1,n2));
		
	}

}
