package LabyrinthProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import dijkstra.Dijkstra;
import dijkstra.Vertex;
import dijkstra.VertexInterface;

public class Main {//initiliser le fichier avec le dossier

	public static void main(String[]args) throws FileNotFoundException {

	/*String[][] maze=new String[10][10];
	maze=Main.initFromTextFile2("src/LabyrinthProject/new/labyrinth");
	// ca c'est propre*/
	
	Maze labyrinth=new Maze();
	// trouver le debut et  la fin
	Vertex y=null;
	Vertex r=null;
	for(VertexInterface c: labyrinth.getAllVertices()) {
		if(c.getLabel().equals("A")) {
			r=(Vertex) c;
		}
		if(c.getLabel().equals("D")) {
			y=(Vertex) c;
		}
	}
	
	
	
	 ArrayList<VertexInterface>resultat=Dijkstra.main(labyrinth, r, y);
	 for(VertexInterface c:resultat) {
		 System.out.println(c);
	 }
	 
	

}
	
	public final static String[][] initFromTextFile2(String fileName) throws FileNotFoundException {
		File file=new File(fileName);
		String[][]res=new String[10][10];
		BufferedReader bufferedReader=null;// aucun probleme avec nullPointerException car sinon c'est le premier catch qui sera activée
		try {
			bufferedReader=new BufferedReader(new FileReader(file));
			String line;
			int compteur=0;
			while((line=bufferedReader.readLine())!=null){
				String[]temporaire=line.split("");//transformer la ligne en caractères
				for (int j = 0; j <10; j++) {
					res[compteur][j]=temporaire[j];
					
											}
				compteur++;
				
				                                         }
				
			
			
		}catch(FileNotFoundException e){
			System.err.println(e.getMessage());
			}
		catch(IOException e){
			System.err.println(e.getMessage());
			
		}
		return res;
		 
	}
	
}