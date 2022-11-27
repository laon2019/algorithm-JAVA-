package Test8958;

import java.util.Scanner;

public class Test8958 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for(int i = 0; i<x;i++) {
			int count =0;
			int sum =0;
			String s = in.next();
			for(int j =0;j<s.length();j++) {
				if(s.charAt(j)=='o') {
					count++;
					sum+= count;
				} else if(s.charAt(j)=='x'){
					count=0;
				}
			}
			System.out.println(sum);
		}
	}

}
