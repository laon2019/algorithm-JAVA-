package Test1929;

import java.util.Scanner;

public class Test1929 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		for(int i =M;i<=N;i++) {
			 int x = 0;
	            if(i == 1) continue;
	            for(int j = 2; j <= Math.sqrt(i); j++){
	                if(i % j == 0){
	                    x++;
	                }
	                if(x == 1) break;
	            }
	            if(x == 0) System.out.println(i);
	        }
	    }
	}
	
