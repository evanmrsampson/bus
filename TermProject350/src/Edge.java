import java.sql.Time;


public class Edge {
	
	private String parentV, childV; 	// corresponding vertices
	private int distance;
	private Time time;
	
	public Edge(String parentVertice, String childVertice, int distance, Time time) {
		parentV = parentVertice;
		childV = childVertice;
		this.distance = distance;
		this.time = time;
	}

	public String getParentV() {
		return parentV;
	}

	public void setParentV(String parentV) {
		this.parentV = parentV;
	}

	public String getChildV() {
		return childV;
	}

	public void setChildV(String childV) {
		this.childV = childV;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
