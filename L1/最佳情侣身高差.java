package L1;

import java.util.Scanner;

public class ���������߲� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String sex = "";
		double h = 0;
		while (N-- != 0) {
			sex = sc.next();
			h = sc.nextDouble();
			if (sex.equals("M")) {
				System.out.printf("%.2f",h / 1.09);
				System.out.println();
			} else {
				System.out.printf("%.2f",h * 1.09);
				System.out.println();
			}
		}
	}

}
