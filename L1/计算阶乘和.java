package L1;

import java.util.Scanner;

public class ¼ÆËã½×³ËºÍ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[11];
		int b[] = new int[11]; 
		a[0] = b[0] = 0 ;
		a[1] = b[1] = 1;

		for(int i = 2 ; i <= 10 ; i ++) {
			a[i] = i * a[i - 1];
			b[i] = b[i - 1] + a[i];
		}
		int N = sc.nextInt();
		System.out.println(b[N]);
		
	}

}
