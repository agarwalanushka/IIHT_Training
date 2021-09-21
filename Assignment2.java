package assignmentSep21;

import java.util.*;

public class Assignment1 {
	public static void main(String[] args) {
		int val1,val2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values 1 and 2:");
		val1 = sc.nextInt();
		val2 = sc.nextInt();
		
		if(val1 % 2==0) {
			System.out.printf(" %d is even",val1);
			int mul = val2/val1;
			
			System.out.println();
			if(val2/val1==val1 && val2 % val1 ==0) {
				System.out.printf("%d is a square and multiple of %d and ",val2,val1);
				
				System.out.printf("%d is %d times of %d",val2,mul,val1);
			}
			else if(val2/val1!=val1 && val2 % val1 ==0) {
				System.out.printf("%d is a multiple of %d and is %d times of %d",val2,val1,mul,val1);
			}
			else {
				System.out.printf("%d is neither a multiple nor square of %d",val2,val1);
			}
		}
		else {
			System.out.printf("%d is not even",val1);
		}
		}
}
