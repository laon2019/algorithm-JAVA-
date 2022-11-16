package Test2480;

public class Test2480 {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 6) + 1;
		int b = (int) (Math.random() * 6) + 1;
		int c = (int) (Math.random() * 6) + 1;
		int sum = 0;
		int max = 0;
		if (a == b && b == c) {
			sum = 10000 + c * 1000;
			System.out.println("첫 번째 수 : "+a+" 두 번째 수 :"+b+" 세 번째수 : "+c+"\n당청금 : "+sum);
		} else if (a == b || b == c) {
			sum = 1000 + b * 100;
			System.out.println("첫 번째 수 : "+a+" 두 번째 수 :"+b+" 세 번째수 : "+c+"\n당청금 : "+sum);
		} else if (a == c) {
			sum = 1000 + c * 100;
			System.out.println("첫 번째 수 : "+a+" 두 번째 수 :"+b+" 세 번째수 : "+c+"\n당청금 : "+sum);
		} else if (a > b && a > c) {
			sum = a * 100;
			System.out.println("첫 번째 수 : "+a+" 두 번째 수 :"+b+" 세 번째수 : "+c+"\n당청금 : "+sum);
		} else if (b > c && b > a) {
			sum = b * 100;
			System.out.println("첫 번째 수 : "+a+" 두 번째 수 :"+b+" 세 번째수 : "+c+"\n당청금 : "+sum);
		} else if (c > b && c > a) {
			sum = c *100;
			System.out.println("첫 번째 수 : "+a+" 두 번째 수 :"+b+" 세 번째수 : "+c+"\n당청금 : "+sum);
		}

	}
}
