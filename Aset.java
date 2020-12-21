package dijkstra;
import java.util.ArrayList;

// la liste des vertexs marqués

public final  class Aset implements AsetInterface {
	ArrayList<VertexInterface> A=new ArrayList<>();

	public ArrayList<VertexInterface> getA() {
		return A;
	}

	public void setA(ArrayList<VertexInterface> a) {
		A = a;
	}

	@Override
	public boolean appartient(VertexInterface s) {
		return A.contains(s);
		
		
	}

	@Override
	public void ajoute(VertexInterface pivot) {
		A.add(pivot);
		
	}

	



}
