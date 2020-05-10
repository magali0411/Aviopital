package GUI.ModelTemp;

import java.util.ArrayList;
import java.util.Collection;

public class ColisStructureTemp {

    private ArrayList<String> colis = new ArrayList<>();

    public ColisStructureTemp(){
        getColis().add("ColisStructure 1");
        getColis().add("ColisStructure 2");
        getColis().add("ColisStructure 3");
    }


    public ArrayList<String> getColis() {
        return colis;
    }

    public void setColis(ArrayList<String> colis) {
        this.colis = colis;
    }
}
