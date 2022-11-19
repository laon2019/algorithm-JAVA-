package Test2738;

import java.util.Scanner;

public class Test2738 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int[][] N = new int[x][y];
		int[][] M = new int[x][y];
		int[][] sum = new int[x][y];
		
		
		for(int i=0;i<x;i++) {
			for(int j=0;i<y;j++) {
				N[i][j] = in.nextInt();
				sum[i][j] += N[i][j]; 
			}
		}
		for(int i=0;i<x;i++) {
			for(int j=0;i<y;j++) {
				M[i][j] = in.nextInt();
				sum[i][j] += N[i][j];
			}
		}
		for(int i=0;i<x;i++) {
			for(int j=0;i<y;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
