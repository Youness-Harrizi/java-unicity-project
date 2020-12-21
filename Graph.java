package dijkstra;

import java.util.ArrayList;

public class Graph implements GraphInterface {
	private ArrayList<VertexInterface> nodes;// liste des sommets
	private ArrayList<Edge> edges;// liste des arêtes 
	private int nbreEdges;
	private int nbreNodes;
	public ArrayList<VertexInterface> getNodes() {
		return nodes;
	}
	public ArrayList<Edge> getEdges() {
		return edges;
	}
	
	public int getNbreEdges() {
		return nbreEdges;
	}
	public int getNbreNodes() {
		return nbreNodes;
	}
	
	// constructeur
	public Graph(ArrayList<Edge> edges, ArrayList<VertexInterface> nodes) {
		this.edges=edges;
		this.nodes=nodes;
		nbreEdges=edges.size();
		nbreNodes=nodes.size();
		
		
		
	}
	
	

	
	public int areteValue(VertexInterface pivot,VertexInterface y1) {
		// donne la longueur d'une arête en connaissant les 2 sommets qui le composent
		for(Edge edge:getEdges()) {
			if(edge.getNodeDebut()==pivot && edge.getNodeFin()==y1) {
				return edge.getLength();
			}
			if(edge.getNodeDebut()==y1 && edge.getNodeFin()==pivot) {
				return edge.getLength();
		}
			
		
	}
		return Integer.MAX_VALUE;
	
	}
	
	
	public boolean succesor(VertexInterface pivot,VertexInterface y1) {
		
		for(Edge c:edges) {
			if(c.neigbour(pivot, y1)) {// si r et r2 sont adjacents
				return true;
		}
		}
			return false;
		
	}
	
	
	
	@Override
	public ArrayList<VertexInterface> getSuccessors(VertexInterface v) {
		ArrayList<VertexInterface> L=new ArrayList<>();
		
		
		for(VertexInterface c:getNodes()) {
			if(succesor(v, c)==true)
				L.add(c);
		}
		return L;
		
	}
	
	
	
	public void setNodes(ArrayList<VertexInterface> nodes) {
		this.nodes = nodes;
	}
	/**
	 * @param edges the edges to set
	 */
	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}
	
	
	
}















