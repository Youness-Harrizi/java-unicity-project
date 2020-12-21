package dijkstra;

import java.util.ArrayList;

// représente le père de chaque arête dans la configuration final
public interface PreviousInterface {

	// retourne le chemin le plus court depuis la racine vers v
	// même si on a qu'un paramètre dans les consignes
	public ArrayList< VertexInterface> getshortestPath(VertexInterface v,VertexInterface root);
	// retourne la valeur du pere du vertex
	public VertexInterface getPere(VertexInterface v);
	// modifie la valeur du pere de v (pere(v) pren,d une vlle valeur
	public void  setPere(VertexInterface v,VertexInterface value);
	
	
	

}
