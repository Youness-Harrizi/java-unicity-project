package dijkstra;

public final class Edge {
	private VertexInterface  NodeDebut;
	private VertexInterface NodeFin;
	private int length;
	public Edge(VertexInterface a, VertexInterface  b, int length) {// CTRL+SHIFT+S pour génere le constructeur
		super();
		NodeDebut = a;
		NodeFin = b;
		this.length = length;
	}
	public boolean neigbour(VertexInterface pivot, VertexInterface y1) {
		if(NodeDebut.equals(pivot) && NodeFin.equals(y1)) 
			return true;
		if(NodeDebut.equals(y1) && NodeFin.equals(pivot)) 
			return true;
		else 
			return false;
		
		
	}
	public int getLength() {
		// la longueur d'un arc
		return length;
	}
	public VertexInterface getNodeDebut() {
		return NodeDebut;
	}
	public VertexInterface getNodeFin() {
		return NodeFin;
	}
	public String toString() {
		return NodeDebut.toString() +NodeFin.toString();
		
	}
	// test d'egalité:
	public boolean equals(Edge e)
	{return e.getNodeDebut()==this.NodeDebut &&e.getNodeFin()==this.NodeFin;}
	
	

}




