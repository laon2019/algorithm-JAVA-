package Test2566;

import java.util.Scanner;

public class Test2566 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max =0;
		int x=0;
		int y=0;
		int[][] array = new int[10][10];
		for(int i = 1;i<=9;i++) {
			for(int j =1;j<=9;j++) {
				array[i][j] = in.nextInt();
				if(array[i][j] > max) {
					max = array[i][j];
					x = i;
					y = j;
				}
			}
		}
		System.out.println(max+"\n"+x+" "+y);
	}
}
