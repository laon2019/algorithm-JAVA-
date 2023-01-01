package Test2010;

import java.util.Scanner;

public class Test2010 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int count = 0;
		for(int i=0;i<x;i++) {
			int y = in.nextInt();
			count += y;
		}
		System.out.println(count-(x-1));
	}
}
