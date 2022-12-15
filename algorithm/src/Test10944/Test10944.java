package Test10944;

import java.util.Scanner;

public class Test10944 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int n = in.nextInt();
			int x = (int)(Math.random()*10001);
			System.out.println(x);  // x값 변환 확인
			if(n==x) {
				System.out.println(x);
				System.out.println("끝");
				break;
			}
		}
	}
}
