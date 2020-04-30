package app.hopital;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class Medicament extends Materiel implements Therapeutique, Perissable, Consommable, Serializable{
	
	private String DCI;
	private String forme_dosage;
	private String classe;
	private String DLU;
	
	private String lot;
	private int quantite;
	
	private static final Logger logger = Logger.getLogger("Escrim");
	
	public Medicament(String name, String dci, String dosage, String classe, String DLU, String lot, int quantite) {
		super(name);
		setDCI(dci);
		setForme_dosage(dosage);
		setClasse(classe);
		setDLU(DLU);
		setLot(lot);
		setQuantite(quantite);
		
	}
	
	@Override
	public void Consommer() {
		System.out.println("Le medicament " + super.getName() + " vient d'être consommé.");
	}
	
	@Override
	public Date getDateLimite() {
		
		String dateS = this.getDLU();
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");  
		Date date_exp = null;
		try {
			date_exp = formatter.parse(dateS);
		} catch (ParseException e) {
			e.printStackTrace();
			logger.warning("Date d'expiration non valide");
			
		}
		return date_exp;
		
	}

	@Override
	public List<Medicament> triDate(List<Medicament> liste) {
		Comparator<Medicament> Comparator = new MedicamentComparator();
		liste.sort(Comparator);
		return liste;
	}


	@Override
	public boolean isSameClasse(String classe_terapheutique1, String classe_terapeuthique2) {
		return classe_terapheutique1.contentEquals(classe_terapeuthique2);
	}
	
		
	public String getDCI() {
		return DCI;
	}

	public void setDCI(String dCI) {
		DCI = dCI;
	}


	public String getForme_dosage() {
		return forme_dosage;
	}


	public void setForme_dosage(String forme_dosage) {
		this.forme_dosage = forme_dosage;
	}


	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}


	public String getDLU() {
		return DLU;
	}


	public void setDLU(String dLU) {
		DLU = dLU;
	}


	public String getLot() {
		return lot;
	}


	public void setLot(String lot) {
		this.lot = lot;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}



}
