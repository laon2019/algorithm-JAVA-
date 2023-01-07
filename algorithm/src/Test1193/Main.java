package Test1193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int sell = 1;
		int sell_sum = 0;
		
		while(true) {
			if(T <= sell_sum+ sell) {
				if(sell % 2 ==1) {
					System.out.println((sell - (T-sell_sum-1)) +"/"+(T - sell_sum));
					break;
				} else {
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
