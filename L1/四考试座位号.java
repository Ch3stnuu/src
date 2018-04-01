package L1;

import java.util.Scanner;

public class ËÄ¿¼ÊÔ×ùÎ»ºÅ {
	public static class MyMap {
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
		int b[] = new int [M];
		for(int i = 0; i < M; i++)
			b[i] = sc.nextInt();
		for(int i = 0; i < M; i++)
			System.out.println(map[a[b[i]]].s + " " + map[a[b[i]]].ks);
	
	}

}
