package Logic_Based_programs;

import java.util.Scanner;

//Create a program to add coloum in the matrix
public class Array_sum_Of_Column_inMatrix {

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
				sum=sum+a[j][i];
			}
			System.out.println(sum);
		
		}


	}

}
