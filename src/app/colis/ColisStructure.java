package app.colis;

public class ColisStructure extends Caisse {

	
	private String secteur;
	private String designation;
	private String precision;

	private boolean complet;

	public ColisStructure() {};
	
	/**
	 * Constructeur de la classe caisse 
	 * @param name
	 * @param num
	 * @param poids
	 * @param volume
	 * @param hauteur
	 * @param largeur
	 * @param longueur
	 * @param secteur
	 * @param designations
	 * @param precision
	 */
	
	public ColisStructure(String name, int num, double poids, double volume, int hauteur, int largeur, int longueur, 
			String secteur, String designations, String precision) {
		super(name, num, poids, volume, hauteur, largeur,longueur);
		setSecteur(secteur);
		setDesignation(designations);
		setPrecision(precision);
	}

	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPrecision() {
		return precision;
	}

	public void setPrecision(String precision) {
		this.precision = precision;
	}

	public boolean isComplet() {
		return complet;
	}

	public void setComplet(boolean complet) {
		this.complet = complet;
	}
}
