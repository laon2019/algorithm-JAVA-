package Test1463N;

import java.util.Scanner;

public class Test1463 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int count = 0;
		while(true) {
			if(x%3==0) {
				x/=3;
				count++;
			} else if(x%2==0) {
				x/=2;
				count++;
			} else if(x ==1) {
				System.out.println(count);
				break;
			} else {
				x--;
				count++;
			}
		}

	}

}
