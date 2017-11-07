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
	
	public Cadena(Boolean etat, int numero) {
		this.etat = etat;
		this.numero = numero;
		imageCadena = new JLabel();
		if(etat == true) {
			imageCadena.setIcon(cadenaOuvert);
		}
		else {
			imageCadena.setIcon(cadenaFerme);
		}
	}
	
	public Boolean getEtat() {
		return this.etat;
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
