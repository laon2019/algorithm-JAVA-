package Test25304;

import java.util.Scanner;

public class Test25304 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int N = in.nextInt();
		int sum =0;
		for(int i=0;i<N;i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			sum += x*y;
		}
		if(T==sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
