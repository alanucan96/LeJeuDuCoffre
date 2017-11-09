import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Cadena {

	private Boolean etat;
	private int numero;
	private JButton button;
	private Vector vectorRelation;
	private ImageIcon cadenaFerme, cadenaOuvert;
	private JLabel imageCadena;
	private int coordX; 
	private int coordY;
	
	public Cadena(Boolean etat, int numero, int x, int y) {
		this.etat = etat;
		this.numero = numero;
		this.coordX = x;
		this.coordY = y;
		cadenaFerme = new ImageIcon("Image/ferme.png");
		cadenaOuvert = new ImageIcon("Image/ouvert.png");
		imageCadena = new JLabel();
		if(etat == true) {
			imageCadena.setIcon(cadenaOuvert);
		}
		else {
			imageCadena.setIcon(cadenaFerme);
		}
	}
	
	public boolean getEtat() {
		return this.etat;
	}
	
	public void setEtat(boolean e) {
		this.etat = e;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void ouvrirCadena() {
		imageCadena.setIcon(cadenaOuvert);
	}
	
	public void fermerCadena() {
		imageCadena.setIcon(cadenaFerme);
	}
}