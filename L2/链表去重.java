package L2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ¡¥±Ì»•÷ÿ {
	static class Node {
		String address;
		int key;
		String nextAdd;
		
		public Node() {
		}

		public Node(String address, int key, String nextAdd) {
			this.address = address;
			this.key = key;
			this.nextAdd = nextAdd;
		}

		@Override
		public String toString() {
			return address + " " + key + " " + nextAdd;
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String startAdd = sc.next();
		int N = sc.nextInt();
		Node[] nodes = new Node[N];
		String address;
		int key;
		String nextAdd;
		int curI = 0;
		for (int i = 0; i < N; i++) {
			address = sc.next();
			key = sc.nextInt();
			nextAdd = sc.next();
			nodes[i] = new Node(address, key, nextAdd);
			if (address.equals(startAdd))
				curI = i;
		}
		ArrayList<Node> resuleList = new ArrayList<Node>();
		ArrayList<Node> deleteList = new ArrayList<Node>();
		HashSet<Integer> set = new HashSet<Integer>();
		resuleList.add(nodes[curI]);
		set.add(nodes[curI].key);
		set.add(- nodes[curI].key);
		while (resuleList.size() + deleteList.size() != N) {
			for (int i = 0; i < N; i++) {
				if (nodes[i].address.equals(nodes[curI].nextAdd)) {
					if(set.contains(nodes[i].key)) {
						if (deleteList.size() != 0) {
							Node node = deleteList.get(deleteList.size() - 1);
							node.nextAdd = nodes[i].address;
							deleteList.set(deleteList.size() - 1, node);
						}
						deleteList.add(nodes[i]);
					} else {
						if (resuleList.size() != 0) {
							Node node = resuleList.get(resuleList.size() - 1);
							node.nextAdd = nodes[i].address;
							resuleList.set(resuleList.size() - 1, node);
						}
						resuleList.add(nodes[i]);
						set.add(nodes[i].key);
						set.add(- nodes[i].key);
					}
					curI = i ;
				}
			}
		}
		for (int i = 0; i < resuleList.size(); i++) {
			
			if(i == resuleList.size() - 1) {
				System.out.println(resuleList.get(i).address + " " + resuleList.get(i).key + " " + "-1");
			} else {
				System.out.println(resuleList.get(i).toString());
			}
		}
		for (int i = 0; i < deleteList.size(); i++)
			if(i == deleteList.size() - 1) {
				System.out.println(deleteList.get(i).address + " " + deleteList.get(i).key + " " + "-1");
			} else {
				System.out.println(deleteList.get(i).toString());
			}
	}

}
