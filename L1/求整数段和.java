package L1;

import java.util.Scanner;

public class 求整数段和 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int count = 0;
		int sum = 0;
		while (A <= B) {
			sum += A;
			System.out.printf("%5d",A++);
			count++;
			if(A > B && count != 5)
				System.out.println();
			if(count == 5) {
				count = 0;
				System.out.println();
			}
		}
		System.out.println("Sum = " + sum);

	}

}
