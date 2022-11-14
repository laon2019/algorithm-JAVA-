package Test2525;

import java.util.Scanner;

public class Test2525 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		int X = in.nextInt();
		if(H>=0&&X+M<60) {
			M +=X;
		} else if(H<22&&H>=0&&X+M>=60) {
			if(X+M>=120) {
				H += 2;
				M = X+M-120;
			}else {
				H++;
				M = X+M-60;
			}
		}  else if(H==23&&X+M>=60) {
			if(X+M>=120) {
				H = 1;
				M = X+M-120;
			}else {
				H = 0;
				M = X+M-60;
			}
		}  else if(H==22&&X+M>=60) {
			if(X+M>=120) {
				H = 0;
				M = X+M-120;
			}else {
				H = 23;
				M = X+M-60;
			}
		
	}
		System.out.println(H+" : "+M);
	}
}
