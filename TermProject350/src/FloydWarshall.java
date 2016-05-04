import java.util.ArrayList;


public class FloydWarshall {
	
	AdjacencyMatrix<String> predecessor;
	AdjacencyMatrix<Double> distances;
	
	public FloydWarshall(ArrayList<String> vertices, ArrayList<Edge> edges) {
		// set up the adjacency matrix
		predecessor = new AdjacencyMatrix<String>(vertices, edges);
		distances = new AdjacencyMatrix<Double>(vertices, edges);
		for (int i = 0; i < vertices.size(); i++) {
			for (int j = 0; j < vertices.size(); j++) {
				predecessor.set(i,j,"");
				distances.set(i,j,Double.POSITIVE_INFINITY);
			}
		}
		//create the initial matrices
		for (int i = 0; i < vertices.size(); i++) {
			for (int j = 0; j < vertices.size(); j++) {
				for (int k = 0; k < edges.size(); k++) {
					if (i == j) {
						distances.set(i, j, 0.0);
						break;
					}
					else if (edges.get(k).getParentV().equals(vertices.get(i))
							&& edges.get(k).getChildV().equals(vertices.get(j))) {
						distances.set(i, j, (double) edges.get(k).getDistance());
						predecessor.set(i, j, edges.get(k).getParentV());
						break;
					}
				}
			}
		}
		// iterate that jazz
		for (int i = 0; i < vertices.size(); i++) {
			for (int j = 0; j < vertices.size(); j++) {
				for (int k = 0; k <= i; k++) {
					
				}
			}
		}
		
	}

}
