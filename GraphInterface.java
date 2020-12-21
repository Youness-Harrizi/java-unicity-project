package dijkstra;

import java.util.ArrayList;

public interface GraphInterface {
public ArrayList<VertexInterface> getSuccessors(VertexInterface v);// return the succesors of vertexInterface
public ArrayList<Edge> getEdges();// return all edges
public ArrayList<VertexInterface>  getNodes();//return all nodes
public boolean succesor(VertexInterface pivot,VertexInterface y1);// etape intermediaire pour getSuccessors


}
