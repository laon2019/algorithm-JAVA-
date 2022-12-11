package Test10807;

import java.util.Scanner;

public class Test10807 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int array[] = new int[x];
		for(int i = 0;i<x;i++) {
			array[i] = in.nextInt();
		}
		int count = in.nextInt();
		int countnum = 0;
		for(int j =0;j<x;j++) {
			if(array[j] == count) {
				countnum++;
			}
		}
		System.out.println(countnum);

	}

}
