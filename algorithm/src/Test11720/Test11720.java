package Test11720;

import java.util.Scanner;

public class Test11720 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String s =in.next();
		int sum =0;
		for(int i =0;i<N;i++) {
			sum += s.charAt(i)-'0'; // charAt()은 아스키코드 값을 반환하여 -'0' 을 해줘야함
		}
		System.out.println(sum);

	}

}
