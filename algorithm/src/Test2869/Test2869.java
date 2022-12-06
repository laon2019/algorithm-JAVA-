package Test2869;

import java.util.Scanner;

public class Test2869 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int V = in.nextInt();
		int sum = 0;
		int days = 0;
		while(true) {
			days++;
			sum = sum + A;
			if(V <= sum) {
				System.out.println(days);
				break;
			} else {
				sum = sum - B;
			}
		}
	}

}
