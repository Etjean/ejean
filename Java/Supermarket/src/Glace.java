import java.util.Date;

public class Glace extends Froid {
	static double prix;													//Attributs Glace
	Glace (int temperature, Date date, double cout, double prix) {		//Constructeur Glace
		super(temperature, date, cout);
		Glace.prix = prix;
	}
}
