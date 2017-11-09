import java.util.Vector;

public class Coffre {
	
	// ATTRIBUTS
	private boolean ouvert;
	private int nbreCadenas;
	private Vector<Cadena> listeCadenas;
	
	// METHODES
	public Coffre(int num, int nbC, Vector<Cadena>listeC, int x, int y) {
		ouvert = false;
		nbreCadenas = nbC;
		listeCadenas = listeC;
	}
	
	public void ouvert(){
		boolean ouvrir = true;
		
		for(int i=0; i<nbreCadenas; i++){
			if(listeCadenas.elementAt(i).getEtat()!=true){
				ouvrir=false;
			}
		}
		
		if(ouvrir=true){
			ouvert=true;
		}
	}

}