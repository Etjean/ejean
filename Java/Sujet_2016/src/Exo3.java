import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Exo3 {
	public static void main(String[] args) {
		//Paris7
		Personne p1 = new Personne("Gabriel");
		Personne p2 = new Personne("Thomas");
		Travailleur t1 = new Travailleur("Sophie", 12000);
		Travailleur t2 = new Travailleur("Hélène", 15000);
		Etudiant e1 = new Etudiant("Sandrine", 12, Formation.SCIENCES);
		Etudiant e2 = new Etudiant("Miara", 4, Formation.DROIT);
		Travailleur prez = new Travailleur("Moroy", 1600);
		Set<Personne> mbs = new HashSet<Personne>();
		mbs.add(p1); 
		mbs.add(p2); 
		mbs.add(t1); 
		mbs.add(t2); 
		mbs.add(e1); 
		mbs.add(e2);
		Université paris7 = new Université(mbs, prez);
		List<Etudiant> scientists = paris7.listeEtudiants(Formation.SCIENCES);

		//Toulouse3
		Etudiant e3 = new Etudiant("Jean", 3, Formation.LETTRES);
		Etudiant e4 = e2;
		Travailleur prezToulouse = new Travailleur("Pascal-Bertrand", 80000);
		Set<Personne> mbs2 = new HashSet<Personne>();
		mbs2.add(e3);
		mbs2.add(e4);
		Université toulouse3 = new Université(mbs2, prezToulouse); 
		
		
		Université p7t3 = Université.fusion(paris7, toulouse3);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

}
