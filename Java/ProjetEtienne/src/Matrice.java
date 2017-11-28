import java.util.Iterator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;


public class Matrice implements Graphe{

	
	//Attributs
	int nbN;
	int L, H;
	City[] cities;
	int[][] matrix;
	
	
	//Constructeur
	public Matrice(String filename) throws IOException {
		//Ouverture du fichier
		File f = new File(filename);
    	BufferedReader br = new BufferedReader(new FileReader(f));
    	//Nombre de noeuds
    	nbN = Integer.parseInt(br.readLine());
    	//Largeur & Hauteur
    	String line = br.readLine();
    	String[] words = line.split(" ");
    	L = Integer.parseInt(words[0]);
    	H = Integer.parseInt(words[1]);
    	//Creation des villes
    	cities = new City[nbN];
		Pattern p = Pattern.compile("([a-zA-Z\\s]+)\\s#|([0-9]+)");
    	for (int i=0; i<48 ; i++){
    		line = br.readLine();
    		Matcher m = p.matcher(line);
    		
    		int no = i+1;
    		m.find();
			String cityname = m.group(1).trim();
			m.find();
			String color = m.group(1).trim();
			m.find();
			int posX = Integer.parseInt(m.group(2));
			m.find();
			int posY = Integer.parseInt(m.group(2));
			
    		cities[i] = new City(no, cityname, color, posX, posY);
    	}
    	
    	//Creation de la matrice d'adjacence
    	while ((line = br.readLine()) != null) {
    	}
    	br.close();
    	
    	//Lire le nombre de noeuds N
    	//Extraire les dimensions de la fenêtre : L=1200, H=800
    	//Créer une matrice carrée d'adjacence NxN
    	//Lire ligne par ligne le fichier, et mettre des 1 sur les villes liées
    	//
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//Accesseurs
	@Override
	public int getNbNoeud() {
		return 0;
	}

	@Override
	public Iterator<Integer> getNoeudsVoisin(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	//Methodes
	@Override
	public void putEtiquette(String nomVille, int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addVoisins(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumNoeud(String nomVille) {
		// TODO Auto-generated method stub
		//Retourne le nombre de noeuds voisins de la ville
		return 0;
	}

	@Override
	public Iterator<String> getVillesVoisines(String ville) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}