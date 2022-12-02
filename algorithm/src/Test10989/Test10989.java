package Test10989;

import java.util.Arrays;
import java.util.Scanner;

public class Test10989 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++) {
			array[i] = in.nextInt();
		}
		Arrays.sort(array);
		
		for(int j : array) {
			System.out.println(j);
		}
	}
}
