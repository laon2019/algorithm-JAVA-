package Test2439;

import java.util.Scanner;

public class Test2439 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 1;i<n+1;i++) {
			for(int j = 0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k = 0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
