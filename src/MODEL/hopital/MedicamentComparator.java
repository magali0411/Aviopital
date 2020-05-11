package MODEL.hopital;

import java.util.Comparator;

public class MedicamentComparator implements Comparator<Medicament>{

	@Override
	public int compare(Medicament o1, Medicament o2) {
		
		int result =  o1.getDateLimite().compareTo(o2.getDateLimite());
		return result;
	}

}
