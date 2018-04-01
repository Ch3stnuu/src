package L1;

import java.io.InputStreamReader;
import java.util.Scanner;

public class ¿¼ÊÔ×ùÎ»ºÅ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int N = sc.nextInt();
		long startTime = System.currentTimeMillis();
		String s[] = new String[N];
		int sj[] = new int [N];
		int ks[] = new int [N];
		int b[] = new int [N + 1];
		
		for (int i = 0 ; i < N; i++) {
			s[i] = sc.next();
			sj[i] = sc.nextInt();
			ks[i] = sc.nextInt();
			b[sj[i]] = i;
		}
		int M = sc.nextInt();
		while (M-- != 0) {
			int a = sc.nextInt();
			System.out.println(s[b[a]] + " " + ks[b[a]] );
		}
		System.out.println(System.currentTimeMillis()-startTime);
	}

}
