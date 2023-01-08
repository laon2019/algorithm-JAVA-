package Test1193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int sell = 1; // 줄마다 칸의 수
		int sell_sum = 0; // 칸의 
		
		while(true) {
			if(T <= sell_sum+ sell) {
				if(sell % 2 ==1) {// 홀수 
					System.out.println((sell - (T-sell_sum-1)) +"/"+(T - sell_sum));
					break;
				} else { //짝수
					System.out.println((T - sell_sum) +"/"+(sell - (T-sell_sum-1)));
					break;
				}
			}else {
				sell_sum += sell; 
				sell++;
			}
			
		}
	}
}
