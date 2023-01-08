package Test10250;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i=0;i<T;i++) {
			int H =in.nextInt();
			int W = in.nextInt();
			int num = in.nextInt();
			if(num%H==0) {
				System.out.println((H*100)+(num/H));
			} else {
				System.out.println((num%H*100)+(num/H+1));
			}
		}
	}
}
