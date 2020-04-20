package app.hopital;

public class Structure extends Materiel implements Structurel{
	
	private String module;
	private String secteur;
	
	private Boolean optionnel;

	public Structure(String id, String name, String module, String secteur, String optionnel) {
		super(id,name);
		setModule(module);
		setSecteur(secteur);
		setOptionnel(optionnel);		
	}

	@Override
	public String getModule() {
		return this.module;
	}

	@Override
	public String getSecteur() {
		return this.secteur;
	}

	@Override
	public Boolean getOption() {
		return this.optionnel;
	}

	public void setModule(String module) {
		this.module = module;
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

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

}
