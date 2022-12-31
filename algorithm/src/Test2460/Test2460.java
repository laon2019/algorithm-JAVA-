package Test2460;

import java.util.Scanner;

public class Test2460 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum =0;
		int max =0;
		for(int i=1;i<=10;i++) {
			int x = in.nextInt();
			sum -= x; 
			int y = in.nextInt();
			sum += y;
			if(max<sum) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}
