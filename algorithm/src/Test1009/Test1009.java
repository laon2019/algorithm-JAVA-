package Test1009;

import java.util.Scanner;

public class Test1009 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int a,b;
		int[] arr = new int[T];
		for(int i=0;i<T;i++) {
			a=in.nextInt();
			b=in.nextInt();
			int r =1;
			for(int j=0;j<b;j++) {
				r = (r*a)%10;
			}
			if(r==0) {
				arr[i] = 10;
			} else {
				arr[i] = r;
			}
		}
		for(int k : arr) {
			System.out.println(k);
		}
	}
}
