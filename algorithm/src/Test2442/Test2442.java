package Test2442;

import java.util.Scanner;

public class Test2442 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for(int i =1;i<=x;i++) {
			for(int j=1;j<=x-i;j++) {
				System.out.print(" ");
			}
			for(int k =1;k<= 2*i-1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
