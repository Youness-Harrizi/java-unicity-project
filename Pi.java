package dijkstra;


import java.util.Hashtable;

import LabyrinthProject.Maze;

public class Pi implements PiInterface {
	private Hashtable<VertexInterface,Integer> distances;
	Maze maze;
	public Pi(Maze g) {
		maze=g;
		distances=new Hashtable<>();
		for(VertexInterface c:maze.getNodes()) {
			distances.put(c,Integer.MAX_VALUE);
		}
		
	}

	@Override
	public int getPi(VertexInterface e) {
		return distances.get(e);
	}

	@Override
	public void setPi(VertexInterface e, int p) {
		distances.put(e, p);
		
		
	}


	@Override
	public void setInf(VertexInterface e) {
		// TODO Auto-generated method stub
		
		
	}

}
