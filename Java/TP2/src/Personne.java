import java.util.*; //importation de Scanner

public class Personne {
	
	String nom;
	String prenom;
	
	Personne () {										//Constructeur 1
		Scanner clavier = new Scanner(System.in);
		System.out.println("Nom ?");
		this.nom = clavier.nextLine();
		System.out.println("Prenom ?");
		this.prenom = clavier.nextLine();
		//clavier.close();
	}
	
	Personne (String nom, String prenom) {				//Constructeur 2
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	String presentation () {
		return (this.nom +" "+ this.prenom);
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//Personne moi = new Personne(); 
		//System.out.println(moi.prenom);
		
		Personne lui = new Personne("Dubois", "Léonard");
		System.out.println(lui.prenom);
		
		System.out.println(lui.presentation());
		
		
		
	}
	
	
	
	
	
	
}