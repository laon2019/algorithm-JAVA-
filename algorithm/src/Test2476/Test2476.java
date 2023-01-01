package Test2476;

import java.util.Scanner;

public class Test2476 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x =in.nextInt();
		int sum =0;
		int max=0;
		for(int i=1;i<=x;i++) {
			int f = in.nextInt();
			int s = in.nextInt();
			int t = in.nextInt();
			if(f==s&&s==t) {
				sum = 10000+f*1000;
			} else if(f==s) {
				sum = 1000+f*100;
			} else if(s==t) {
				sum = 1000+s*100;
			} else if(t==f) {
				sum = 1000+t*100;
			} else {
				int max1 =f;
				if(max1<s) {
					max1=s;
				}
				if(max1<t) {
					max1=t;
				}
			}
			if(max<sum) {
				max = sum;
			}
			
		}
		System.out.println(max);
	}
}
