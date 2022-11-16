package Test2438;

import java.util.Scanner;

public class Test2438 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for(int i =0;i<x;i++) {
			for(int k =0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
