package com.pkg.graphs;

import java.awt.PrintGraphics;
import java.util.LinkedList;
import java.util.Scanner;

public class DFS {

	private static boolean[] marked;
	private static LinkedList[] adjList;

	private static void dfs(int v, int source){
		marked = new boolean[v+1];
				dfsUtil(source);
		}
	
	private static void dfsUtil(int s){
		marked[s] = true;
		System.out.print(s + " ");
		for (int i=0; i< adjList[s].size(); i++) {
			int val = (Integer) adjList[s].get(i);
			if(!marked[val])
			dfsUtil(val);
		}
	}
	
	private static void createGraph(int vertices, int edges){
		Scanner src = new Scanner(System.in);
		adjList = new LinkedList[vertices+1];
		for (int i = 0; i <=vertices; i++) {
			adjList[i] = new LinkedList();
		}
		for (int i = 0; i < edges; i++) {
			int v1 = src.nextInt();
			int v2 = src.nextInt();
			adjList[v1].add(v2);
			adjList[v2].add(v1);
		}
	}
	
	private static void printGraph(){
		for (int i = 0; i < adjList.length; i++) {
			for (int j = 0; j < adjList[i].size(); j++) {
				System.out.print(adjList[i].get(j));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		createGraph(3, 3);
		printGraph();
		dfs(3, 1);
	}

}
