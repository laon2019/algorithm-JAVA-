package Test1292N;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int ans =0;
		int cnt=0;
		for(int i=1;;i++) {
			for(int j=1;j<=i;j++) {
				cnt++;
				if(a<=cnt && cnt<=b) {
					ans+=i;
				}
			}
			if(cnt>b) {
				break;
			}
		}
		System.out.println(ans);
	}
}