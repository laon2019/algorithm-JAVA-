package Test2441;

import java.util.Scanner;

public class Test2441 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for(int i=0;i<x;i++) {
			for(int j=x-i;j<x;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<x;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
