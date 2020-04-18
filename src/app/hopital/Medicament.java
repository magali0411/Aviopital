package app.hopital;

import java.io.Serializable;
import java.sql.Date;

public class Medicament extends Materiel implements Therapeutique, Perissable, Consommable, Serializable{
	
	private String produit;
	private String DCI;
	private String DLU;
	private String forme_dosage;
	private String classe;
	
	@Override
	public void Consommer() {
		// TODO Auto-generated method stub
		
	}
	
	public String getProduit() {
		return produit;
	}
	public void setProduit(String produit) {
		this.produit = produit;
	}
	@Override
	public String getDLU() {
		return this.DLU;
	}
	
	public void setDLU(String DLU) {
		
		this.DLU = DLU;
		
	}


	@Override
	public String getClasse() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String getFormeDosage() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String getDCI() {
		// TODO Auto-generated method stub
		return null;
	}



	public void setDCI(String dCI) {
		DCI = dCI;
	}



	public void setForme_dosage(String forme_dosage) {
		this.forme_dosage = forme_dosage;
	}



	public void setClasse(String classe) {
		this.classe = classe;
	}



}
