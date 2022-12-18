package Test5597;

import java.util.Scanner;

public class Test5597 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] array = new int[31];  // 반 학생수 배열 선언
		for (int i = 1; i < 29; i++) {  
			int N = in.nextInt();   // 28명 입력
			array[N] = 1; //입력받은 28명의 학생만 1값을 입력
		}
		for (int i = 1; i < 31; i++) {
			if (array[i] != 1)
				System.out.println(i); //1값이 없던 학생 출력
		}
	}
}
