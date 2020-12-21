package dijkstra;

public interface AsetInterface {
	//contient les sommets non encores attribués
	// l'algorithme de Djikstra se fait sur n-1 etapes ou n est le degre
	public boolean appartient(VertexInterface s);
	//tester si s n'est plus dispo
	public void ajoute(VertexInterface s);
	// ajouter un sommet à A
	

}
