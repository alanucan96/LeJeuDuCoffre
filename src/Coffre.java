import java.util.Vector;

public class Coffre {
	
	// ATTRIBUTS
	private int Numero;
	private boolean ouvert;
	private int nbreCadenas;
	private Vector<Cadena> listeCadenas;
	private int coordX, coordY;
	
	// METHODES
	public Coffre(int num, int nbC, Vector<Cadena>listeC, int x, int y) {
		Numero = num;
		ouvert = false;
		nbreCadenas = nbC;
		listeCadenas = listeC;
		coordX=x;
		coordY=y;
	}
	
	public void ouvert(){
		boolean ouvrir = true;
		
		for(int i=0; i<nbreCadenas; i++){
			if(listeCadenas.elementAt(i)!=true){
				ouvrir=false;
			}
		}
		
		if(ouvrir=true){
			ouvert=true;
		}
	}
	
	public void afficher(){
		ImageIcon img = new ImageIcon("images/coffre.jpg");
		JLabel Fond = new JLabel(img);
		//positionner
}
