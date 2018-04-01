package L1;

import java.util.Arrays;
import java.util.Scanner;


public class Èý¿¼ÊÔ×ùÎ»ºÅ {
	public static class MyMap implements Comparable<MyMap>{
		String s;
		int sj;
		int ks;
		
		public MyMap() {
	
		}
		public MyMap(String s, int sj, int ks) {
			this.s = s;
			this.sj = sj;
			this.ks = ks;
		}
		@Override
		public int compareTo(MyMap o) {
			
			return this.sj >= o.sj ? (this.sj == o.sj ? 0 : 1) : -1;
		}
	};

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		MyMap map[] = new MyMap[N]; 
		int a[] = new int[N + 1];
		
		for (int i = 0 ; i < N; i++) {
			String s = sc.next();
			int sj = sc.nextInt();
			int ks = sc.nextInt();
			map[i] = new MyMap(s,sj,ks);
			a[sj] = i;
			
		}
		
		int M = sc.nextInt();
		while (M-- != 0) {
			int b = sc.nextInt();
			System.out.println(map[a[b]].s + " " + map[a[b]].ks);
		}
	}
}
