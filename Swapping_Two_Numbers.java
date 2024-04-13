package Logic_Based_programs;

import java.util.Scanner;

public class Swapping_Two_Numbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the A value:");
		int a=sc.nextInt();
		System.out.println("Enter the B value:");
		int b=sc.nextInt();
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("After Swapping the both numbers A and B  ");
		System.out.println("The Value of A is Now:  "+a);
		System.out.println("The value of  B is Now:  "+b);

	}

}
