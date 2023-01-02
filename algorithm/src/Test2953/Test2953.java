package Test2953;

import java.util.Scanner;

public class Test2953 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = 0;
		int count =0;
		for(int i=0;i<5;i++) {
			int sum = 0;
			for(int j=0;j<4;j++) {
				int x = in.nextInt();
				sum += x;
				if(max <= sum) {
					max = sum;
					count =i+1;
				}
			}
		}
		System.out.println(count+" "+max);
		
	}
}
