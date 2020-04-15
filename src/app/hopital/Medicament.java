package app.hopital;

import java.io.Serializable;
import java.sql.Date;

public class Medicament extends Materiel implements Therapeutique, Perissable, Consommable, Serializable{
	
	private String produit;
	private Date DCI;
	private String forme_dosage;
	private String classe;
	
	@Override
	public void Consommer() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Date getDLUO() {
		return this.DCI;
	}
	@Override
	public String getClasse() {
		return this.classe;
	}
	@Override
	public String getFormeDosage() {
		return this.forme_dosage;
	}
	
	
	public String getProduit() {
		return produit;
	}
	public void setProduit(String produit) {
		this.produit = produit;
	}



}
