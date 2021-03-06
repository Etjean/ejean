import java.awt.Polygon;

public class Carre extends Figure {
	
	//Attributs
	private int largeur;
	
	
	//Constructeurs
	public Carre(int x, int y, int l) {
		super(x, y);
		largeur = l;
	}
	
	//Accesseurs
	public int getLargeur() {return largeur;}
	public int getHauteur() {return largeur;}
	
	
	
	//Methodes
	public Polygon creePolygon() {
		int x1, x2;
		int y1, y2;
		x1 = this.getPosX() - this.getLargeur()/2;
		x2 = this.getPosX() + this.getLargeur()/2;
		y1 = this.getPosY() - this.getHauteur()/2;
		y2 = this.getPosY() + this.getHauteur()/2;
		int[] abs = {x1, x1, x2, x2};
		int[] ord = {y1, y2, y2, y1};
		Polygon p = new Polygon(abs, ord, 4);
		return p;
	}
	
	
}
