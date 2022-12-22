package Test1427;
import java.util.Scanner;
import java.util.Arrays;
 
public class Test1427{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] arr = in.nextLine().toCharArray();
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
 
	}
}
