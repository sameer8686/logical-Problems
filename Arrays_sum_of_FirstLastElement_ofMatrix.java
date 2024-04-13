package Logic_Based_programs;

import java.util.Scanner;

//create a program to add first and last element of the matrix of the 2*2 matrix
public class Arrays_sum_of_FirstLastElement_ofMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows :");
		int n = sc.nextInt();
		System.out.println("Enter the coloums :");
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
        System.out.println(a[0][0]+a[2][2]);
		

	}

}
