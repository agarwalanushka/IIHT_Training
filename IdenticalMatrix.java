package assignmentSep22;

import java.util.Scanner;

public class IdenticalMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 2d matrix size: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
				
		int[][] mat1 = new int[n][m];
		int[][] mat2 = new int[n][m];
		int[][] res1 = new int[n][m];
		int[][] res2 = new int[n][m];
		
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
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0 ;j < m; j++) {
				if(mat1[i][j]==mat2[i][j]) {
					res1[i][j]=mat1[i][j];
					res2[i][j]=mat2[i][j];
				}
				else {
					count = 1;
					res1[i][j] = 0;
					res2[i][j] = 0;
				}
			}
		}
		
		if(count ==0) {
			System.out.println("Identical matrices");
		}
		else {
			for(int i = 0; i < n; i++) {
				for(int j = 0 ;j < m; j++) {
					System.out.print(res1[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
			for(int i = 0; i < n; i++) {
				for(int j = 0 ;j < m; j++) {
					System.out.print(res2[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
