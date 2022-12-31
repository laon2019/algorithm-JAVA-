package Test2444;

import java.util.Scanner;

public class Test2444 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=x-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=x*2-1;j>i*2;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
