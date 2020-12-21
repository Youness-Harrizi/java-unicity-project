package dijkstra;

import java.util.ArrayList;
import java.util.Hashtable;

public final class Previous implements PreviousInterface {
	Hashtable<VertexInterface,VertexInterface> pere=new Hashtable<>();
	
	// value is the pere , the key is the node
	
	@Override
	public VertexInterface getPere(VertexInterface v) {
		// equivalent à getValue
		 
			return pere.get(v);
		
		
	}
	@Override
	public void setPere(VertexInterface v, VertexInterface valuePere) {
		//Si tu fait deux put() successif avec la même clef 
		//tu auras bien une seule clef avec la dernière valeur..
		pere.put(v,valuePere);
		
		
		
	}
	// le problème est ici car le boucle est infini
	@Override
	public ArrayList<VertexInterface> getshortestPath(VertexInterface v,VertexInterface root) {
		VertexInterface sommetCourant =v;
		ArrayList<VertexInterface>res=new ArrayList<>();
		if(sommetCourant!=null && root!=null) {
		while(!(sommetCourant.equals(root))) {
			res.add(sommetCourant);
			// on remonte au pere jusqu'à la racine
		   sommetCourant=this.getPere(sommetCourant);
			
									}
		
		}
		else {
			System.out.println("sommetCourant null");// dans le cas ou on a pas le depart et l'arrivée dans le programme
		}
		
		return res;
		
		
	}

}