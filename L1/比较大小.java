package L1;

import java.util.Scanner;

public class 比较大小 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		long mid = 0;
		for (int i = 0; i < 3; i++) {
			long a = sc.nextLong();
			mid = a < max ? (a > min? a : min) : max;
			max = Math.max(max, a);
			min = Math.min(min, a);
			
		}
		System.out.println(min + "->" + mid + "->" + max);
	}

}
