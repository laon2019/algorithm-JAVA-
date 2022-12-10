package Test2292;

import java.util.Scanner;

public class Test2292 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int num =1;   // 비교할 값
		int count =1;  // 칸수
		while(N > num) {
			num += 6 *count;
			count++;
		}
		System.out.println(count);
		
	}

}
