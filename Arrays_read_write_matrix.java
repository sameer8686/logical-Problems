package Logic_Based_programs;

import java.util.Scanner;

//create a program to read and write the matrix
public class Arrays_read_write_matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows :");
		int n = sc.nextInt();
		System.out.println("Enter the coloums :");
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		//to read the values from user
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
        //to show the values to user
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
