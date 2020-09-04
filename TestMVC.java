package gestion_etudiant;

public class TestMVC {

	public static void main(String[] args) {
		System.out.println("welcome!");
		View v = new View("Gestion des Etudiant");
		Model m = new Model();
		Controlleur c = new Controlleur(v, m);
	}

}
