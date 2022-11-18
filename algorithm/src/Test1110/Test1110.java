package Test1110;

import java.util.Scanner;

public class Test1110 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int count = 0;
		int i = N;
		while(true) {
			N = (N%10*10) +(((N/10) +N %10)%10);   
			count++;
			if(i==N) {
				break;
			}		 
		}	
		System.out.println(count);
	}
}
