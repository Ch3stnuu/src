package L1;

import java.util.Arrays;
import java.util.Scanner;

public class ¿¼ÊÔ×ùÎ»ºÅ¶þ·Ö {
	
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
		
		for (int i = 0 ; i < N; i++) {
			String s = sc.next();
			int sj = sc.nextInt();
			int ks = sc.nextInt();
			map[i] = new MyMap(s,sj,ks);
		}
		Arrays.sort(map);
		int M = sc.nextInt();
		while (M-- != 0) {
			int a = sc.nextInt();
			int l = 0;
			int r = N - 1;
			while (l <= r) {
				int m = l + r;
				if(map[m].sj == a) {
					System.out.println(map[m].s + " " + map[m].ks);
					break;
				}
				if(map[m].sj > a) {
					r = m - 1;
				} else {
					l = m + 1;
				}
					
			}
		}
	}
}
