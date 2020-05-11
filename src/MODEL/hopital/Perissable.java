package MODEL.hopital;

import java.util.Date;
import java.util.List;

public interface Perissable  {
	
	/**
	 * Convertit une chaîne de caractère en date
	 * @return date
	 */
	Date getDateLimite();
	
	/**
	 * Tri une liste de matériel selon leur date de péremption
	 * @param liste
	 * @return
	 */
	List<Medicament> triDate(List<Medicament> liste);

}
