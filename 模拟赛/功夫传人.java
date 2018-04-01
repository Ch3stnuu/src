package 模拟赛;

import java.util.Scanner;

public class 功夫传人 {
	static int N,count = 0;
	static double Z, r, sum = 0;
	static int[] a;

	
	static void findfather(int x) {

		if (x == 0) 
			return;
		count++;
		findfather(a[x]);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		Z = sc.nextDouble();
		r = sc.nextDouble();
		a = new int[N];
		
		
		
		for (int i = 0; i < N; i++) {
			int k = sc.nextInt();
			if (k == 0) {
				count = 0;
				double curR = sc.nextInt();
				findfather(i);
				sum += Z * Math.pow((100 - r) * 0.01, count) * curR;
			} else {
				for (int j = 0; j < k; j++) {
					int id = sc.nextInt();
					a[id] = i;
				}
			}
		}
		System.out.println((int)sum);
	}

}
