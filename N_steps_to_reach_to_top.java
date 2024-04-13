package Logic_Based_programs;

import java.util.Scanner;

public class N_steps_to_reach_to_top {

//	You are climbing a stair case.
//	it takes n steps to reach the the top.
//	each time you can climb 1 or 2 steps in how many distanct ways can you climb to the top?
//			NoTE:iven n will be Positive number
//	
	static int fib(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
			return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println(fib(n));
		
	}

}
