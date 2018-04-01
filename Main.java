import java.util.Arrays;
import java.util.Scanner;

class Main {
	
	final static int INF = 505; 
	static int N, M, S, D;
	static int[][] mp;
	static int[] val, dis, totval, path, pathnum, re;
	static boolean[] vis;
	
	static void Dijkstra(int v0) {
		dis = new int[N];
		path = new int[N];
		totval = new int[N];
		vis = new boolean[N];
		pathnum = new int[N];
		
		for (int i = 0; i < N; i++)
			dis[i] = INF;
		
		vis[v0] = true;
		dis[v0] = 0;
		totval[v0] = val[v0];
		pathnum[v0] = 1;
		
		for (int i = 0; i< N; i++) {
			if (i != v0 && mp[v0][i] != INF) {
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
					if (dis[j] > mp[u][j] + dis[u]) {
						dis[j] = mp[u][j] + dis[u];
						path[j] = u;
						pathnum[j] = pathnum[u];
						totval[j] = totval[u] + val[j];
						
						
					} else if (dis[j] == mp[u][j] + dis[u]){
						pathnum[j] +=pathnum[u];
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
		val = new int[N];
		mp = new int[N][N];
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
		re = new int[N];
		while (cur != S) {
			re[num++] = cur; 
			cur = path[cur];
		}
		re[num++] = S;
		System.out.println(pathnum[D] + " " + totval[D]);
		for (int i = num - 1; i > 0; i--)
			System.out.print(re[i] + " ");
		System.out.println(re[0]);
	}
}