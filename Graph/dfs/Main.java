package undirectional.dfs;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int noOfVertices = 7;
		ArrayList<Edge> graph [] = new ArrayList[noOfVertices];
		
		GraphOps.graphCreation(graph);
		
		boolean vis[] = new boolean[graph.length];
		System.out.println("DFS of the connected graph is as follows:");
		GraphOps.dfsOps(graph, 0, vis);

	}

}
