package Test2490;

import java.util.Scanner;

public class Test2490 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int[] arr = new int[4];
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=4;j++) {
				arr[j] = in.nextInt();
				if(arr[j] == 1) {
					sum++;
				}
			}
			if(sum == 0) {
				System.out.println("D");
			} else if(sum ==1) {
				System.out.println("A");
			} else if(sum ==1) {
				System.out.println("B");
			} else if(sum ==1) {
				System.out.println("C");
			} else if(sum ==1) {
				System.out.println("F");
			}
	}
}
}
