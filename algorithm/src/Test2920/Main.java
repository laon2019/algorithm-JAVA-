package Test2920;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] music = new int[8];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<music.length; i++) {
			music[i] = sc.nextInt();
		}
		String res= "";
		for(int i=0; i<music.length-1; i++) {
			if(music[i]==music[i+1]-1) { // 각 배열i 값과 i+1 값을 비교하여i의 값과i-1이 맞으면 ascending 
				res = "ascending";
			}else if(music[i]==music[i+1]+1) {
				res = "descending";
			}else {
				res = "mixed";
				break;
			}
		}
		System.out.println(res);
	}
}