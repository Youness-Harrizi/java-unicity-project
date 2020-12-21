package dijkstra;

public interface PiInterface {
	
	// return the Pi value of the VertexInterface e
	public int getPi(VertexInterface e);
	
	// set p to the Pi value of the VertexInterface e
	public void setPi(VertexInterface e, int p);
	
	// set inf to the Pi value of the VertexInterface e
	public void setInf(VertexInterface e) ;
}
