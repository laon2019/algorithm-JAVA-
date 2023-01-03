package Test1453;

import java.util.Scanner;

public class Test1453 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int count =0;
		int[] arr = new int[101];
		for(int i=1;i<=x;i++) {
			int num = in.nextInt();
			if(arr[num] == 1) {
				count++;
			} else {
				arr[num] =1;
			}
		}
		System.out.println(count);
	}
}
