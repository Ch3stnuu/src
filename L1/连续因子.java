package L1;

import java.util.ArrayList;
import java.util.Scanner;

public class 连续因子 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		long N = sc.nextLong();
		int l = (int) Math.sqrt(N) + 1;
		
		for (int len = 12; len >= 1; len--) {
			for (int start = 2; start <= l; start++) {
				long sum = 1;
				for (int i = start ;i - start <= len - 1 ; i++) {
					sum *= i;
				}
				if (N % sum == 0) {
					System.out.println(len);
					System.out.print(start);
					for (int i = start + 1; i - start <= len - 1; i++)
						System.out.print("*" + i);
					System.out.println();
					return;
				}
			}
		}
		System.out.println(1);
		System.out.println(N);
		
		
	}

}
