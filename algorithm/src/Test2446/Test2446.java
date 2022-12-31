package Test2446;
import java.util.Scanner;

public class Test2446 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for(int i=1;i<=x;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=x*2;j>i*2-1;j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=1;i<x;i++) {
			for(int j=x-i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i*2+1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}