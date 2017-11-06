public class Partie {
	
	// ATTRIBUTS
	private String Difficulte;
	
	// METHODES
	public Partie(String d) {
		// Ouvrir le XML "'d'.xml"
    
    // déclaration d'un fichier Java standard
    File fichier =  new File("'d'.xml") ;
    // création d'un objet de type SAXReader 
    SAXReader reader =  new SAXReader() ;
    // lecture de ce fichier à l'aide de ce reader, et construction d'un objet Document
    Document doc = reader.read(fichier) ;
  }

}
