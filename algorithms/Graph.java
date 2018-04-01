package algorithms;

import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
	int V;
	int E;
	LinkedList<Integer>[] adj;
	public Graph (int V) {
		this.V = V;
		this.E = 0;
		adj = new LinkedList[V];
		for (int v = 0; v < V; v++)
			adj[v] = new LinkedList<Integer>();
	}
	
	public Graph (Scanner sc) {
		this(sc.nextInt());
		int E = sc.nextInt();
		for (int i = 0; i < E; i++) {
			int v = sc.nextInt();
			int w = sc.nextInt();
			addEdge(v, w);
		}
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
		E++;
	}
	
	public LinkedList<Integer> adj(int v) {
		return adj[v];
	}
}
