package Test3003;

import java.util.Scanner;

public class Test3003 {
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,2,8};
		Scanner in = new Scanner(System.in);
		for(int i=0;i<6;i++) {
			int x = in.nextInt();
			if(x>0) {
				arr[i]-=x;
			} 
			System.out.print(arr[i]+" ");
		}
	}
}
