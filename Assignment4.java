package assignmentSep21;

//fibonacci series in reverse - upto 100

public class Assignment4 {
	public static void  main(String[] args) {
	
		int[] arr = new int[101];
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2;i<101;i++) {
			arr[i] = arr[i-2]+arr[i-1];
		}
		
		System.out.print("Series in reverse order: ");
		for(int i=100;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
