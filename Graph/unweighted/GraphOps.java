package undirectional.unweighted;

import java.util.ArrayList;

public class GraphOps {
	
	public static void graphCreation(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i] = new ArrayList<Edge>();
		}
		
		/*
		 Network style be like
		 0 -> [0,2]
		 1 -> [1,2],[1,3]
		 2 -> [2,0],[2,1],[2,3]
		 3 -> [3,1],[3,2] 
		*/
		
		graph[0].add(new Edge(0, 2));
		
		graph[1].add(new Edge(1, 2));
		graph[1].add(new Edge(1, 3));
		
		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 1));
		graph[2].add(new Edge(2, 3));
		
		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 2));
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
