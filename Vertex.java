package dijkstra;

import java.util.ArrayList;


public class Vertex implements VertexInterface {
	private int distanceFromSource;// la différence
	private String label;
	private int abs;
	private int ord;
	private ArrayList<Vertex> succesors = new ArrayList<Vertex>();

	
	// les sommets sont distingués par leur index
	// dans le graphe les indices vont de 0 à n-1
	

	
	
	public String getLabel()
	{
		return label;
	}
	
	public void setLabel(String label)
	{
		this.label = label;
	}
	
	public int getDistanceFromSource() 
	{
		return distanceFromSource;
	}
	public void setDistanceFromSource(int distanceFromSource)
	{
		this.distanceFromSource = distanceFromSource;
	}
	
	
	// les getters pour la liste des arêtes 
	

	public Vertex(String label) 
	{
		super();
		this.label = label;
		this.distanceFromSource=Integer.MAX_VALUE;
	}
	public Vertex(String label, int abs, int ord)
	{
		super();
		this.label = label;
		this.abs = abs;
		this.ord = ord;
		this.distanceFromSource=Integer.MAX_VALUE;
	}
	public int getAbs() 
	{
		return abs;
	}
	public int getOrd() 
	{
		return ord;
	}
	
	
	@Override
	public ArrayList<Vertex> getSuccessors() 
	{
		return succesors;
	
	}
	
	
	
	
	public String toString() 
	{
		
		return "("+label+","+abs+","+ord+")";
	}

	@Override
	public boolean equals(Vertex v) {
	return 	(v.getAbs()==getAbs() && v.getOrd()==getOrd() && v.getLabel().equals(this.getLabel()));
		
	}
	
	
// solution creation de la classe pi

}

