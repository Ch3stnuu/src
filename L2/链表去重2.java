package L2;

import java.util.Scanner;

public class ¡¥±Ì»•÷ÿ2 {
	
	final static int MAX = 100005;
	
	static class Node1 {
		int key;
		int next;
	}
	
	static class Node2 {
		int address;
		int key;
	}

	
	static Node1[] a = new Node1[MAX];
	static Node2[] b = new Node2[MAX];
	static int m = 0;
	static boolean[] vis = new boolean[MAX];

	private static void print2() {
		 for(int i=0;i<m-1;i++)  
		    {  
			 System.out.printf("%05d %d %05d\n",b[i].address,b[i].key,b[i+1].address);  
		    }  
		 System.out.printf("%05d %d -1\n",b[m-1].address,b[m-1].key);  
	}


	private static void print1(int start) {
		if (start == -1)  
	        return ;  
	    if(a[start].next==-1)  
	       System.out.printf("%05d %d %d\n",start,a[start].key,a[start].next);  
	    else  
	    	System.out.printf("%05d %d %05d\n",start,a[start].key,a[start].next);  
	    print1(a[start].next);  
	}


	private static void delete(int pre, int next) {
		boolean f = false;
		if (next == -1) {
			return;
		}
		if (!vis[Math.abs(a[next].key)]) {
			vis[Math.abs(a[next].key)] = true;
		} else {
			a[pre].next = a[next].next;
			b[m].address = next;
			b[m].key = a[next].key;
			m++;
			f = true;
		}
		if (f) {
			delete(pre, a[next].next);
		} else {
			delete(next, a[next].next);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		for (int i = 0; i < MAX; i++) {
			a[i] = new Node1();
			b[i] = new Node2();
		}
		
		
		Scanner sc = new Scanner(System.in);
		int n, start, tstart, key, tnext;
		start = sc.nextInt();
		n = sc.nextInt();
		
		
		while (n-- != 0) {
			tstart = sc.nextInt();
			key = sc.nextInt();
			tnext = sc.nextInt();
			a[start].key = key;
			a[start].next = tnext;
		}
		delete (-1, start);
		print1 (start);
		if (m > 1)
			print2();
	}
}
