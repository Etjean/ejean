
public class Mult extends Poly {
	
	//Attributs
	Poly u;
	Poly v;
	
	//Constructeur
	Mult(Poly u, Poly v){
		this.u = u;
		this.v = v;
	}
	
	//Méthodes
	int eval(int x) {return u.eval(x)*v.eval(x);}
	
	public String toString() {};
	
	Dev dev() {return null;}

	

	
}
