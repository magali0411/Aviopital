package MODEL.hopital;

public class Structure extends Materiel implements Structurel{
	
	private String secteur;
	private String nominal;
	private Boolean complet;
	private Boolean optionnel;

	public Structure(String id, String name, String secteur, String optionnel) {
		super(id,name);
		setSecteur(secteur);
		setOptionnel(optionnel);		
	}
	
	@Override
	public void Completer() {
		this.setComplet(true);
		
	}

	public Boolean getOptionnel() {
		return optionnel;
	}

	public void setOptionnel(String optionnel) {
		
		if(optionnel == "Optionnel")
			this.optionnel = true;
		else 
			this.optionnel = false;
	}
	
	public String getSecteur() {
		return this.secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}



	public String getNominal() {
		return nominal;
	}

	public void setNominal(String nominal) {
		this.nominal = nominal;
	}

	public Boolean getComplet() {
		return complet;
	}

	public void setComplet(Boolean complet) {
		this.complet = complet;
	}

}
