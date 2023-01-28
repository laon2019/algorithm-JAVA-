package Test1100;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[][] arr = new String[8][8];
		int sum = 0;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				arr[i][j] =in.next();
			}
		}
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(i%2==0) {
					if(j%2==0) {
						if(arr[i][j]=="F") {
							sum++;
						}
					} 
				} else {
					if(j%2==1) {
						if(arr[i][j]=="F") {
							sum++;
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}
