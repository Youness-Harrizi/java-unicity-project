package dijkstra;

import java.util.ArrayList;

import LabyrinthProject.Maze;

public class Dijkstra {
	// le plus petit chemin entre r et y

	public static ArrayList<VertexInterface> main(Maze g, VertexInterface r,VertexInterface y) throws Exception {
		Aset A=new Aset();
		Pi pi=new Pi(g);
		A.ajoute(r);
		VertexInterface pivot=r;
		Previous previous=new Previous();
		// on doit initialiser notre pere
		int n=g.getNbreNodes();
		//System.out.println(n);
		if(pivot!=null) {
		pi.setPi(pivot, 0);
		//System.out.println("pi de pivot :"+pi.getPi(pivot));
		}
		//tant que y n'est pas encore pivot
		int distanceMinimale=Integer.MAX_VALUE;
		if(r==null) {
			throw new Exception("depart n'est pas déclaré");
			
		}
		if(y==null) {
			throw new Exception("arrivée nonn déclarée");
		}
		
		
		
		
for(int i=0;i<n-1;i++) {
			
		
		for(VertexInterface y1:g.successeurs(pivot))// on ne rentre  pas dans cette boucle ===> c'est getSuccesors de Graphe ou est le probleme
		{
			if( (A.appartient(y1)==false) && y1!=null  )
			{
					//System.out.println("on rentre dans 1"+y1);
				
				//System.out.println(pi.getPi(y1) +"dista,ce pi(y1)");
		
					if(pi.getPi(pivot )+ 1  < pi.getPi(y1)) {
						//System.out.println("on rentre dans la boucle2");
						pi.setPi(y1, pi.getPi(pivot)+1);
						//System.out.println(pi.getPi(y1));
						previous.setPere(y1,pivot);
						//System.out.println(previous.getPere(y1));
						
						// le probleme getDistanceFromSource redemarre de 0;
						// le pivot a tjrs une distance from source =1
				}
				
				
			}
			
		}
			
		// chercher le pivot (sommet non dans A avec distance minimale)
			distanceMinimale =Integer.MAX_VALUE;// valeur infini pour trouver le minimum
			for(VertexInterface c:g.getNodes()) {
			
			//System.out.println("on rentre dans 3");
			//System.out.println(c.getDistanceFromSource());
			if((A.appartient(c)==false && pi.getPi(c)<distanceMinimale ) ){//l'erreur est dans  get	Distance tous les vertex trouvent leur distanceFromSource inchangé
				//System.out.println("on rentre dans la boucle 4");
				
				pivot=c;
				distanceMinimale=pi.getPi(c);
				//System.out.print(distanceMinimale);
				//System.out.println(pivot);
				
				
																				}
			
											}
			A.ajoute(pivot);
		}

	
 return	previous.getshortestPath(y, r);
		}
		// maintenant on a obtenu le tableau pere
		// il suffit d'appler les methodes de prviuous Interface avec ce nouveau Pere
	
	
		
		
		
	
	
}
	
	
	




