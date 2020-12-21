package LabyrinthProject;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import dijkstra.Edge;
import dijkstra.Graph;
import dijkstra.Vertex;
import dijkstra.VertexInterface;

public class Maze extends Graph   {
	
   String[][] labyrinthe=new String[10][10];
			// mon labyrinthe est une matrice de chaines de caractères soit w,D,E,A
   private int length=10;
   private int largeur=10;
	
	
	
   		public Maze() throws FileNotFoundException
   		{
   			labyrinthe=this.initFromTextFile("src/LabyrinthProject/new/labyrinth");
   			setNodes(this.getAllVertices());
   			setEdges((this.getEdges()));
   		}
   		
		
		
		
		
		// pour implementer les edges il faut implementer getsuccesors et getAllVertices
		public ArrayList<Edge> getEdges()
		{
				ArrayList<Edge> edges=new ArrayList<>();
				
				for (VertexInterface x:this.getAllVertices()) {
				for(VertexInterface y:this.getSuccessors(x)) {
				edges.add(new Edge(x, y, 1));
				}
				
		        }
				return edges;
				
		}
			
		//first method
		public ArrayList<VertexInterface> getAllVertices() {
			 ArrayList<VertexInterface> res=new ArrayList<>();
			for(int i=0;i<length;i++) {
				for(int j=0;j<largeur;j++)  {   
					if (labyrinthe[i][j].equals("A")) {res.add(new ArrivalBox(i,j));}
					if (labyrinthe[i][j].equals("D")) {res.add(new DepartureBox(i,j));}
					if (labyrinthe[i][j].equals("E")){res.add(new EmptyBox(i,j));}
					if (labyrinthe[i][j].equals("W")) {res.add(new WallBox(i,j));}
				}
			}
						 
		return res; 
		}
			
		//second method les succeseurs sont (i-1,j);(i+1,j);(i,j-1);(i,j+1)
		public ArrayList<VertexInterface> getSuccessors(VertexInterface vertex){
			ArrayList<VertexInterface>succesors=new ArrayList<>();
			
			Vertex box=(Vertex)vertex;
			int i=box.getAbs() , j=box.getOrd();
			ArrayList<String >list=new ArrayList<>();
			
			//1er cas
			if(i>=1 && i<10 && j>=0 &&j<10) {String a=labyrinthe[i-1][j]; list.add(a);}
			if(i>=0 && i<9 && j>=0 &&j<10) {String b=labyrinthe[i+1][j]; list.add(b);}
			if(i>=0 && i<10 && j>=1 &&j<10) {String c=labyrinthe[i][j-1]; list.add(c);}
			if(i>0 && i<10 && j>=0 &&j<9) {String d=labyrinthe[i][j+1] ; list.add(d);}
			
			
			
			


					for(String k:list) {
				if(!k.equals("w")) {
					succesors.add(new Vertex(k,i,j));
									}
								}
							         
		
			
			
			return succesors;
			
		}
			
	// transformer un fichier en tableau bidimensionnelle
			
			public final String[][] initFromTextFile(String fileName) throws FileNotFoundException {
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
			
			
	
			
			//sauvegarder l'etat du labyrinthe dans un fichier
			public final void saveToTextFile(String fileName) {
				String[][]maze=this.labyrinthe;
				
				PrintWriter pw;
				try {
				
				pw=new PrintWriter( new FileOutputStream(fileName));
				for (int j = 0; j < length; j++) {
					for (int i = 0; i < largeur; i++) {
						pw.print(maze[i][j]);
						
					}
					pw.println();// le saut d'indice après chaque ligne
					
				}
				}catch(IOException e) {System.err.println(e.getMessage() +"file couldn't be saved");}
				
			}
			
			
		}
		
		
