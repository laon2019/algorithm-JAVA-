package Test14681;

import java.util.Scanner;

public class Test14681 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		if (x > 0) {
			if (y > 0) {
				System.out.print(1);
			} else {
				System.out.print(4);
			}
		}
		else {
			if (y > 0) {
				System.out.print(2);
			} else {
				System.out.print(3);
			}
		}
	}

}