package 模拟赛;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 家庭房产 {
	
	static class Person {
		int id = -1;
		int fid = -1;
		int mid = -1;
		ArrayList<Integer> hIdList = new ArrayList<Integer>();
		double fcount = 0;
		double fmianji = 0;
		
		public Person() {
			
		}
	}
	
	static class Family {
		int minId = Integer.MAX_VALUE;
		int personCount = 0;
		double Fcount = 0;
		double Fmianji = 0;
	}
	
	
	static int N, familyCur = 0;
	static boolean[] vis;
	static Person[] persons;
	static Family[] families;
	static int[] a;
	
	static void dfs (int x) {
		vis[x] = true;
		Person person = persons[x];
		families[familyCur].Fcount += person.fcount;
		families[familyCur].Fmianji += person.fmianji;
		families[familyCur].personCount++;
		families[familyCur].minId = Math.min(families[familyCur].minId, person.id);
		
		if (person.fid != -1 ) {
			families[familyCur].minId = Math.min(families[familyCur].minId, person.fid);
			if (a[person.fid] != -1 && !vis[a[person.fid]])
				dfs(a[person.fid]);
		}
		if (person.mid != -1 ) {
			families[familyCur].minId = Math.min(families[familyCur].minId, person.mid);
			if (a[person.mid] != -1 && !vis[a[person.mid]])
				dfs(a[person.mid]);
		}
		for (int i = 0; i < person.hIdList.size(); i++) {
			int id = person.hIdList.get(i);
			families[familyCur].minId = Math.min(families[familyCur].minId, id);
			if (id != -1 && a[id] != -1 && !vis[a[id]])
				dfs(a[id]);
		}
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		a = new int[10000];
		Arrays.fill(a, -1);
		persons = new Person[N];
		families = new Family[N];
		for (int i = 0; i < N; i++) {
			int id = sc.nextInt();
			int fid = sc.nextInt();
			int mid = sc.nextInt();
			int k = sc.nextInt();
			a[id] = i;
			persons[i] = new Person();
			persons[i].id = id;
			persons[i].fid = fid;
			persons[i].mid = mid;
			while (k-- != 0) {
				int hid = sc.nextInt();
				persons[i].hIdList.add(hid);
			}
			int fcount = sc.nextInt();
			double fmianji = sc.nextDouble();
			persons[i].fcount = fcount;
			persons[i].fmianji = fmianji;
		}
		families[familyCur] = new Family();
		vis = new boolean[N];
		for (int i = 0; i < N; i++) {
			if (vis[i])
				continue;
			dfs(i);
			familyCur++;
			families[familyCur] = new Family();
		}
		for (int i = 0; i < familyCur; i++) {
			System.out.printf("%d ", families[i].minId);
			System.out.println();
		}
	}

}
