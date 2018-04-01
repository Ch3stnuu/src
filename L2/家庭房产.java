package L2;

import java.util.Arrays;
import java.util.Scanner;

public class  ¼ÒÍ¥·¿²ú {
	
	static class  FamilyHouse implements Comparable<FamilyHouse>{
		int id;
		int perCount;
		double houseCount;
		double houseAre;
		@Override
		public int compareTo(FamilyHouse o) {
			return this.houseAre > o.houseAre ? -1 : (Math.abs(this.houseAre - o.houseAre) < 0.0001 ? (this.id > o.id ? 1 : -1) : 1);
		}
	}
	

	final static int MAX = 10005;
	static FamilyHouse[] familyHouses1, familyHouses2, familyHouses3;
	static int[] father;
	static int N;
	static boolean[] vis, vis2;
	
	
	static int findMinId (int x) {
		return father[x] == x ? x : (father[x] = findMinId(father[x]));
	}
	
	static void join (int x, int y) {
		int o = findMinId(x);
		int p = findMinId(y);
		if (o != p) {
			if (o < p)
				father[p] = o;
			else
				father[o] = p;
		}
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		familyHouses1 = new FamilyHouse[MAX];
		familyHouses2 = new FamilyHouse[MAX];
		familyHouses3 = new FamilyHouse[MAX];
		vis = new boolean[MAX];
		vis2 = new boolean[MAX];
		father = new int[MAX];
		for (int i = 0; i < MAX; i++) {
			familyHouses1[i] = new FamilyHouse();
			familyHouses2[i] = new FamilyHouse();
			familyHouses3[i] = new FamilyHouse();
			father[i] = i;
		}
		N = sc.nextInt();
		int id, fId, mId, k, cId;
		while (N-- != 0) {
			id = sc.nextInt();
			vis[id] = true;
			fId = sc.nextInt();
			if (fId != -1) {
				vis[fId] = true;
				join(id, fId);
			}
			mId = sc.nextInt();
			if (mId != -1) {
				vis[mId] = true;
				join(id, mId);
			}
			familyHouses1[id].id = id;
			k = sc.nextInt();
			while (k-- != 0) {
				cId = sc.nextInt();
				if (cId != -1) {
					vis[cId] = true;
					join(cId, id);
				}
				
			}
			familyHouses1[id].houseCount = sc.nextDouble();
			familyHouses1[id].houseAre = sc.nextDouble();
		}
		

		for (int i = 0; i < MAX; i++) {
			if (vis[i]) {
				id = findMinId(i);
				vis2[id] = true;
				familyHouses2[id].perCount++;
				familyHouses2[id].houseAre += familyHouses1[i].houseAre;
				familyHouses2[id].houseCount += familyHouses1[i].houseCount;
			}
		}
		int num = 0;
		
		for (int i = 0; i < MAX; i++) {
			if (vis2[i]) {
				familyHouses3[num].id = i;
				familyHouses3[num].perCount = familyHouses2[i].perCount;
				familyHouses3[num].houseCount = familyHouses2[i].houseCount / familyHouses2[i].perCount;
				familyHouses3[num].houseAre = familyHouses2[i].houseAre / familyHouses2[i].perCount;
				num++;
			}
		}
		Arrays.sort(familyHouses3);
		for (int i = 0; i < num; i++) {
			System.out.printf("%04d %d %.3f %.3f\n", familyHouses3[i].id, familyHouses3[i].perCount, familyHouses3[i].houseCount, familyHouses3[i].houseAre);
		}
		
		
		
		
	}
}