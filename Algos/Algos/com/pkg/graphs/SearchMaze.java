package com.pkg.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class SearchMaze {
	
	private static boolean[] visited;
	private static void findPath(int[][] paths){
		visited = new boolean[paths[0].length*paths.length];
		Queue<Integer> queue = new LinkedList();
		queue.add(0);
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			if(temp < paths.length -2 && paths[temp][temp+1] == 1)
				queue.add(temp+1);
			//if(temp < paths[0].length-2 && paths[temp+1][temp] == 1)
				//queue.add(e);
		}
	}

	public static void main(String[] args) {

	}

}
