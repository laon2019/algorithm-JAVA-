package Test2739;

import java.util.Scanner;

public class Test2739 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(x + "*" + i + "=" + x * i);
		}
	}
}
