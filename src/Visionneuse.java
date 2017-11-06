import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Visionneuse extends Fenetre{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//ATTRIBUTS
	private Vector <Media> listeMedia;
	
	// MÉTHODES
	public Visionneuse(int x, int y){
		super(x,y);
		listeMedia = new Vector<Media>();
	}
	
	public void ajouterMedia(Media m) { 
		listeMedia.add(m);
	}
	
	public void automatique(){
		for(int i=0;i<listeMedia.size();i++){
			listeMedia.elementAt(i).afficher(this);
		}
	}
	
	public void automatique(String nomMusic){
		URL fichierSon=null;
		try{fichierSon = new URL("file:"+nomMusic);}
		catch (MalformedURLException mue) {System.out.println("url incorrecte");}
		AudioClip son = Applet.newAudioClip(fichierSon);
		son.play();
		
		for(int i=0;i<listeMedia.size();i++){
			listeMedia.elementAt(i).afficher(this);
		}
	}
}
