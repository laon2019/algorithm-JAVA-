package Test2750;



import java.util.Arrays;
import java.util.Scanner;

public class Test2750 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		
		for(int x : arr) {
			System.out.println(x);
		}
	}
}
