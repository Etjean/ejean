import java.util.Date;


public class Supermarket {
	public static void main(String[] args) {
		
	}
	
	
	Glace[] glaces = new Glace[100];						//Attributs Supermarket
	Tomate[] tomates = new Tomate[100];
	Mouchoirs[] mouchoirs = new Mouchoirs[100];
	Date today = new Date(2017, 10, 28);
	
	
	
	public int countglace(){								//Methode d'instance Supermarket
		int c = 0;
		for (int i=0; i<100; i++){
			if (glaces[i].ok(this.today)){c++;}
		}
		return c;
	}
	
	public int counttomate(){
		int c = 0;
		for (int i=0; i<100; i++){
			if (tomates[i].ok(this.today)){c++;}
		}
		return c;
	}
	
	public int countmouchoirs(){
		return mouchoirs.length;
	}
	
}








