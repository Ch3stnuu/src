package L2;

import java.util.Arrays;
import java.util.Scanner;

public class ΩÙº±æ»‘Æ1 {
	
	final static int INF = 505;
	final static int MAX = 505;
	static int N, M, S, D;
	static int[] val, dis, path, totval, pathnum, re; 
	static boolean[] vis;
	static int[][] mp;
	
	static void Dijkstra(int v0) {
		
		for (int i = 0; i < N; i++)
			dis[i] = INF;

		vis[v0] = true;
		dis[v0] = 0;
		totval[v0] = val[v0];
		pathnum[v0] = 1;
		
		for (int i = 0; i < N; i++) {
			if (i != v0 && mp[v0][i] != INF ) {
				dis[i] = mp[v0][i];
				path[i] = v0;
				totval[i] = val[v0] + val[i];
				pathnum[i] = pathnum[v0];
			}
		}
		
		for (int i = 0; i < N - 1; i++) {
			int mi = INF;
			int u = v0;
			for (int j = 0; j < N; j++) {
				if (!vis[j] && dis[j] < mi) {
					mi = dis[j];
					u = j;
				}
			}
			vis[u] = true;
			for (int j = 0; j < N; j++) {
				if (!vis[j]) {
					if (dis[u] + mp[u][j] < dis[j]) {
						pathnum[j] = pathnum[u];
						dis[j] = dis[u] + mp[u][j];
						totval[j] = totval[u] + val[j];
						path[j] = u;
					} else if (dis[u] + mp[u][j] == dis[j]) {
						pathnum[j] += pathnum[u];
						if (totval[j] < totval[u] + val[j]) {
							totval[j] = totval[u] + val[j];
							path[j] = u;
						}
					}
				}
			}
 		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		S = sc.nextInt();
		D = sc.nextInt();
		mp = new int[MAX][MAX];
		dis = new int[MAX];
		val = new int[MAX];
		path = new int[MAX];
		totval = new int[MAX];
		pathnum = new int[MAX];
		re = new int[N];
		vis = new boolean[MAX];
		
		for (int i = 0; i < N; i++) {
			val[i] = sc.nextInt();
			Arrays.fill(mp[i], INF);
		}
		
		int x, y, l;
		for (int i = 0; i < M; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			l = sc.nextInt();
			mp[x][y] = Math.min(mp[x][y], l);
			mp[y][x] = mp[x][y];
		}
		Dijkstra(S);
		int num = 0;
		int cur = D;
		
		while (cur != S) {
			re[num++] = cur;
			cur = path[cur];
		}
 		
		re[num++] = S;
		System.out.println(pathnum[D] + " " + totval[D]);
		for (int i = num - 1; i > 0; i--) {
			System.out.print(re[i] + " ");
		}
		System.out.println(re[0]);
		
	}

	

}
