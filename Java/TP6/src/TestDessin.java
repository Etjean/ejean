import java.awt.Color;
import java.awt.Polygon;
public class TestDessin{
    public static void main(String args[]){
	Dessin d = new Dessin(400,400);
	
	int[] abs = new int[3];//abscisse du polygone
	int[] ord = new int[3]; //ordonnees du polygone
	abs[0] = 10; ord[0] = 50;
	abs[1] = 70; ord[1] = 50;
	abs[2] = 40; ord[2] = 150;
	Polygon p = new Polygon(abs, ord, 3);
    d.fixeCouleur(Color.black);
	d.dessine(p);
	
	Triangle t = new Triangle(140, 100, 120, 100);
	d.fixeCouleur(Color.blue);
	d.dessine(t.creePolygon());
	
	Rectangle r = new Rectangle(240, 100, 60, 100);
	d.fixeCouleur(Color.orange);
	d.dessine(r.creePolygon());
	
	Rectangle rd = r.deforme(0.3, 1.2);
	d.fixeCouleur(Color.red);
	d.dessine(rd.creePolygon());
	
	
    }
}
