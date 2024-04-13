package Logic_Based_programs;

import java.util.Scanner;

//Create a program to add rows of the Matrix
public class Array_sum_Of_rowsInMatrix {

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
        
		for (int i = 0; i < n; i++) {

			int sum=0;
			
			for (int j = 0; j < m; j++) {
				sum=sum+a[i][j];
			}
			System.out.println(sum);
		
		}

		
	}

}
