package Test10872;

import java.util.Scanner;

public class Test10872 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int sum = 1;
		if(N == 0) {
			System.out.println(1);
		} else {
			for(int i=1;i<=N;i++) {
				sum *= i ;
			}
			System.out.println(sum);
		}
	}
}
