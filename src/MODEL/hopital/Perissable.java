package MODEL.hopital;

import java.util.Date;
import java.util.List;

public interface Perissable  {
	
	/**
	 * Convertit une cha�ne de caract�re en date
	 * @return date
	 */
	Date getDateLimite();
	
	/**
	 * Tri une liste de mat�riel selon leur date de p�remption
	 * @param liste
	 * @return
	 */
	List<Medicament> triDate(List<Medicament> liste);

}
