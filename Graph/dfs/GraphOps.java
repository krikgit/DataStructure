package undirectional.dfs;

import java.util.ArrayList;

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
	
	public static void dfsOps(ArrayList<Edge> graph[],int curr,boolean visited[]) {
				
		System.out.print(curr+" ");
		visited[curr] = true;
		
		for(int i=0;i<graph[curr].size();i++) {
			Edge edge = graph[curr].get(i);
			if(visited[edge.getDst()]==false)
			dfsOps(graph,edge.getDst(),visited);
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
