package undirectional.bfs;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int noOfVertices = 7;
		ArrayList<Edge> graph [] = new ArrayList[noOfVertices];
		
		GraphOps.graphCreation(graph);
		GraphOps.showNodes(graph, 4);
		
		GraphOps.bfsOpsConnectedGraph(graph, 0);
		
		boolean vis[] = new boolean[graph.length];
		for(int i=0;i<graph.length;i++) {
			if(vis[i] == false) {
				GraphOps.bfsOpsDisconnectedGraph(graph, i, vis);
			}
		}

	}

}
