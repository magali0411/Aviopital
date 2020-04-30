package app.colis;

public class ColisMedicament extends Caisse {

	public ColisMedicament() {
		
	}

	

	/**
	 * Création d'un colis médicament
	 * @param nom_caisse
	 * @param num_caisse
	 */
	public ColisMedicament(String nom_caisse, int num_caisse) {
		super(nom_caisse, num_caisse);
		// Définition d'une caisse standard
		setPoids(20);
		setVolume(1);
		setLongueur(120);
		setLargeur(80);
		setHauteur(100);
	}

}
