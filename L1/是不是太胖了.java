package L1;

import java.util.Scanner;

public class 是不是太胖了 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		double result = (H - 100) * 0.9 * 2;
		System.out.printf("%.1f",result);
			
	}

}
