
public class Test {
	
	
	public static void main(String[] args) {						//MAIN
		Personne pers1 = new Personne("Cretin", "Gabriel");
		Personne pers2 = new Personne("Lematre", "Sophie");
		System.out.println(pers1.presentation());
		System.out.println(pers2.presentation());
		System.out.println(creeNPersonnes(6)[2].presentation());
		
	}
	
	
	
	static Personne[] creeNPersonnes(int n) {						// Fonction 1
		Personne[] tabPers = new Personne[n]; //reserve une zone pour potentiellement n Personnes. Initialement ces Personnes n'existent pas, elles sont null
		for (int i=1; i<n; i++) {
			tabPers[i]= new Personne(randomWord(3), randomWord(6));
		}
		return tabPers;
	}
	
	
	static String randomWord (int n) {										//Fonction 2
		String word = "";
		for (int i=1; i<=n; i++) {
			char l = (char) ((Math.random()*26)+'a');
			word += l;
		}
		return word;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
