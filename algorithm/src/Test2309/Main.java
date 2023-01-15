package Test2309;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i=0;i<arr.length;i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		for(int n : arr) {
			System.out.println(n);
		}
	}
}
