package dijkstra;

import java.util.ArrayList;

public interface VertexInterface {

	public int getAbs();
	public int getOrd();
	public void setDistanceFromSource(int i);
	public int getDistanceFromSource();
	public ArrayList<Vertex> getSuccessors();
	public String toString();
	public boolean equals(Vertex v);// l'egalit� se fait par le m�me label, abs et ord
	public String getLabel();

}
