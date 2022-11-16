package Test2588;

import java.util.Scanner;

public class Test2588 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int i=B/100;
		int j=B%100/10;
		int k=B%10;
		
		System.out.println(k*A);
		System.out.println(j*A);
		System.out.println(i*A);
		System.out.println(A*B);
	}
}
