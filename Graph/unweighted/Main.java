package undirectional.unweighted;

import java.util.ArrayList;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int noofVertices = 4;
		
		ArrayList<Edge> graph[] = new ArrayList[noofVertices];
		
		GraphOps.graphCreation(graph);
		
		GraphOps.showNodes(graph, 5);

	}

}
