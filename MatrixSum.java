package assignmentSep22;

import java.util.Scanner;

public class MatrixSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 2d matrix size: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] mat1 = new int[n][m];
		int[][] mat2 = new int[n][m];
		int[][] sum = new int[n][m];
		
		System.out.println("Enter matrix 1: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0 ;j < m; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter matrix 2: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0 ;j < m; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0 ;j < m; j++) {
				sum[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		
		System.out.println("Resultant Matrix: ");

		for(int i = 0; i < n; i++) {
			for(int j = 0 ;j < m; j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}
