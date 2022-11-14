package Test2884;

import java.util.Scanner;

public class Test2884 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		if(M>=45 && H>=0) {
			M -= 45;
		} else if(M<45 && H>0) {
			H--;
			M += 15; 
		} else if(M<45&& H==0) {
			H = 23;
			M+= 15;
		}
		System.out.println(H+" : "+M);

	}

}
