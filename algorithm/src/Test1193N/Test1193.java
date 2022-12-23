package Test1193N;

import java.util.Scanner;

public class Test1193 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i =1;i<=n;i++) {
			if(n%3==2) {
				System.out.println(" ");
			}else {
				System.out.println("*");
			}
		}
	}
}
