package Test1152;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test1152 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		StringTokenizer st = new StringTokenizer(s," ");
		System.out.println(st.countTokens());
		
	}
}
