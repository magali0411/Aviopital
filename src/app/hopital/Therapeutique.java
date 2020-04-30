package app.hopital;

public interface Therapeutique {
	
	/**
	 * Compare 2 classes térapeuthique et renvoit vrai si elles sont pareils
	 * @param classe_terapheutique1
	 * @param classe_terapeuthique2
	 * @return
	 */
	boolean isSameClasse(String classe_terapheutique1, String classe_terapeuthique2);

}
