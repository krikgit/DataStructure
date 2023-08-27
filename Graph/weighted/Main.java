package undirectional.weighted;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfVertices = 4;
		
		ArrayList<Edge> graph[] = new ArrayList[noOfVertices];
		
		GraphOps.createGraph(graph);
		
		GraphOps.showNodes(graph, 3);
	}

}
