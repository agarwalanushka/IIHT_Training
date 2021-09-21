package assignmentSep21;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		if(sc.hasNextByte()) {
			System.out.println("The data type can be byte, short, int, long but recommended is byte");
		}
		else if(sc.hasNextShort()) {
			System.out.println("The data type can be short, int, long but recommended is short");
		}
		else if(sc.hasNextInt()) {
			System.out.println("The data type can be int, long but recommended is int");
		}
		else if(sc.hasNextLong()) {
			System.out.println("The data type can long");
		}
		else if(sc.hasNextFloat()) {
			System.out.println("The data type can be float and double but recommended is float");
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
