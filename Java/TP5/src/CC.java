
public class CC extends MP{
	
	//Attributs
	private double decouvertMax;
	private double tauxDecouvert;
	private double solde;
	
	//Constructeur
	public CC(String c, String b, double d, double td) {
		super(c, b);
		solde=0;
		decouvertMax=d;
		tauxDecouvert=td;
	}
	
	//Methodes
	public boolean depot(double m) {
		if(m<0){return false;}
		else{solde+=m; return true;}
	}
	
	
}
