package Logic_Based_programs;

import java.util.Scanner;

//There is great war between the even and odd numbers,You have to determine which group sums
// larger ,the even or the odd ,the larger,group wins\
//create a function that takes an array of integer,sum's the even and odd seperately then
//return the difference between sum of even and odd numbers

public class Array_of_Sum_of_EvenAndOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		int n = sc.nextInt();
		System.out.println("Enter the values:");
		int[] x = new int[n];
		int c, even = 0, odd = 0;
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		for (int j = 0; j < n; j++) {

			if (x[j] % 2 == 0) {
				even = even + x[j];
			} else {
				odd = odd + x[j];
			}
		}
		System.out.println("Even number sum is :"+even);
		System.out.println("Odd number sum is :"+odd);
		c=even-odd;
		System.out.println("Differnce of both is :"+(c));

	}

}
