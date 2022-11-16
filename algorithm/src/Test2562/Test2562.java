package Test2562;

import java.util.Scanner;

public class Test2562 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = 0;
		int count = 0;
		for(int i =1;i<10;i++) {
			int x = in.nextInt();
			if(max<x) {
				max = x;
				count = i;
			}
		}
		System.out.println(max+"\n"+count);

	}

}
