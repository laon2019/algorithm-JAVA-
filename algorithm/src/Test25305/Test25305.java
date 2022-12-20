package Test25305;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test25305 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
		Integer[] array = new Integer[N];
		for(int i=0;i<N;i++) {
			array[i] = in.nextInt();
		}
		Arrays.sort(array,Collections.reverseOrder());
		
		System.out.println(array[X-1]);
		
	}
}
