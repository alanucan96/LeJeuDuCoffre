import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.json.*;

public class Partie extends JFrame{

	private static final long serialVersionUID = 1L;
	
	// ATTRIBUTS
	private String Difficulte;
	
	// METHODES
	public Partie(String d) {
		
		Difficulte = d;
		BufferedReader br = null;
		FileReader fr = null;
		String  json = "";
		
		// CONSTRUCTION
 		this.setTitle("Jeu du Coffre");
 		//addWindowListener(new GestionFenetre()); // si on voulait sauver avant de fermer
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			// MISE EN PLACE INTERFACE
			BorderLayout placement=new BorderLayout();
			getContentPane().setLayout(placement);
 				
			JPanel cases = new JPanel();
			getContentPane().add(cases, BorderLayout.CENTER);
			cases.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));
 				
			// METTRE L'IMAGE DE FOND
			ImageIcon img = new ImageIcon("Image/coffre.png");
			JLabel Fond = new JLabel(img);
			this.add(Fond, BorderLayout.CENTER);
			
		try {

			br = new BufferedReader(new FileReader(Difficulte + ".json"));
			
			String sCurrentLine;
			
			while ((sCurrentLine = br.readLine()) != null) {
				json += sCurrentLine;
			}

		} catch (IOException e) {
	
			e.printStackTrace();
	
		} finally {
	
			try {
	
				if (br != null)
					br.close();
	
				if (fr != null)
					fr.close();
	
			} catch (IOException ex) {
	
				ex.printStackTrace();
	
			}
	
		}
		
	    // LECTURE JSON
		JSONObject obj;
		try {
			
			obj = new JSONObject(json);
			//String coffre = obj.getJSONObject("Coffre").getString("pageName");
			
			// On récupère le tableau d'objets qui nous concernent
	        JSONArray array = obj.getJSONArray("Cadena1");
	        
	        // Pour tous les objets on récupère les infos
	        for (int i = 0; i < array.length(); i++) {
	            // On récupère un objet JSON du tableau
	            array.getString(i);
	            // On fait le lien Personne - Objet JSON
	            Cadena cadena = new Cadena(obj.getBoolean("Etat initial"), i, obj.getInt("x"), obj.getInt("y"));
	            
	            ImageIcon img2 = new ImageIcon("Image/ouvert.png");
				JLabel Fond2 = new JLabel(img2);
				cases.add(Fond2, BorderLayout.SOUTH);
	        }

		} catch (JSONException e) {
			e.printStackTrace();
			
		}
 			pack();
 			setVisible(true);
	}

}