package undirectional.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphOps {
	
	public static void graphCreation(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i] = new ArrayList<Edge>();
		}
		
		/*
		 Network style be like
		 0 -> [0,1],[0,2]
		 1 -> [1,0],[1,3]
		 2 -> [2,0],[2,4]
		 3 -> [3,1],[3,4],[3,5]
		 4 -> [4,2],[4,3],[4,5] 
		 5 -> [5,3],[5,4],[5,6]
		 6 -> [6,5]
		*/
		
		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));
		
		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 3));
		
		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 4));
		
		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 4));
		graph[3].add(new Edge(3, 5));
		
		graph[4].add(new Edge(4, 2));
		graph[4].add(new Edge(4, 3));
		graph[4].add(new Edge(4, 5));
		
		graph[5].add(new Edge(5, 3));
		graph[5].add(new Edge(5, 4));
		graph[5].add(new Edge(5, 6));
		
		graph[6].add(new Edge(6, 5));
	}
	
	public static void bfsOpsConnectedGraph(ArrayList<Edge> graph[],int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start); //indicating starting point of traversal
		
		boolean[] visited  = new boolean[graph.length];
		System.out.println("BFS of the connected graph is as follows:");
		while (!queue.isEmpty()) {
			int curr = queue.remove();
			if(visited[curr] == false) {
				System.out.print(curr+" ");
				visited[curr] = true;
				
				for(int i=0;i<graph[curr].size();i++) {
					queue.add(graph[curr].get(i).getDst());
				}
			}
		}
		
	}
	
	public static void bfsOpsDisconnectedGraph(ArrayList<Edge> graph[],int start,boolean visited[]) { //recommended
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start); //indicating starting point of traversal
		
		System.out.println("\nBFS of the  disconnected graph is as follows:");
		while (!queue.isEmpty()) {
			int curr = queue.remove();
			if(visited[curr] == false) {
				System.out.print(curr+" ");
				visited[curr] = true;
				
				for(int i=0;i<graph[curr].size();i++) {
					queue.add(graph[curr].get(i).getDst());
				}
			}
		}
		
	}
	
	public static void showNodes(ArrayList<Edge> graph[],int source) {
		if(source >= graph.length) {
			int range = graph.length-1;
			throw new RuntimeException("Source range should be between 0 to "+range);
		}
		System.out.println("Neighbour of "+source+" is/are:");
		for(int i=0;i<graph[source].size();i++) {
			 System.out.println(graph[source].get(i).getDst());
			
		}
		
	}

}
