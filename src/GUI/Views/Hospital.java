package GUI.Views;

import javafx.event.ActionEvent;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.GridPane;
import GUI.Controller;


public class Hospital extends ViewsModel {

    private GridPane hospitalGrid;

    public Hospital(Controller controller) {
        super(controller);
        setHospitalGrid(addHospitalGrid());
        addCheckBoxEventHandlers();
    }

    public GridPane getHospitalGrid() {
        return hospitalGrid;
    }

    public void setHospitalGrid(GridPane hospitalGrid) {
        this.hospitalGrid = hospitalGrid;
    }

    /*
    * --------------------------- FUNCTIONS  -------------------------------
     */

    public GridPane addHospitalGrid() {

        GridPane hospitalGrid = new GridPane();
        hospitalGrid.setVgap(10);
        hospitalGrid.setHgap(10);
        hospitalGrid.setGridLinesVisible(false);


        Label base = new Label("            Ajout d'une base");
        hospitalGrid.add(base, 0, 0);
        /* Si il y a plusieurs fois l'option pays froid pays chaud, c'est pour garder en flexibilite
         * Car ces options n'ajoute ou n'enleve que des parties
         */
        // ------------ DAHMO ---------------

        //Label DAHMO = new Label("-------------- DAHMO ----------------");
        Separator DAHMOSep = new Separator(Orientation.HORIZONTAL);
        hospitalGrid.add(DAHMOSep, 0, 1, 2, 1);
        CheckBox DAHMO = new CheckBox("DAHMO");

        DAHMO.setId("DAHMO");
        hospitalGrid.add(DAHMO, 0, 2, 2, 1);

        CheckBox DAHMOComplet = new CheckBox("DAHMO Complet (+ Pays chaud/froid");
        DAHMOComplet.setId("DAHMOComplet");
        hospitalGrid.add(DAHMOComplet, 0, 3, 2, 1);

        /*
        Label quantityLabel = new Label("Qty : ");
        hospitalGrid.add(base, 0,0);
        TextField quantity = new TextField();
        hospitalGrid.add(base, 0,0);
        */
        // ---------- DAC ------------------

        //Label DAC = new Label(" ---------------- DAC --------------");
        Separator DACSep = new Separator(Orientation.HORIZONTAL);
        hospitalGrid.add(DACSep, 0, 4, 2, 1);
        CheckBox DAC = new CheckBox("DAC");
        DAC.setId("DAC");
        hospitalGrid.add(DAC, 0, 5, 2, 1);

        CheckBox DACComplet = new CheckBox("DAC Complet (w/ Pays chaud & froid");
        DACComplet.setId("DACComplet");
        hospitalGrid.add(DACComplet, 0, 6, 2, 1);

        CheckBox hotCountry = new CheckBox("Pays chaud");
        hotCountry.setId("DAC_hot");
        hospitalGrid.add(hotCountry, 0, 7, 1, 1);

        CheckBox coldCountry = new CheckBox("Pays froid");
        coldCountry.setId("DAC_cold");
        hospitalGrid.add(coldCountry, 1, 7, 1, 1);


        // ---------- Base Vie ( min: 41m3 / 11t  max: 59m3 / 14,4t ------------

        //Label detachementBase = new Label("------ Detachement Commandement Logistique Vie ------");
        Separator detachementBase = new Separator(Orientation.HORIZONTAL);
        CheckBox baseVie = new CheckBox("Base vie");
        // lot complementaire (douche, cuisine, etc..) add 2,3 t & 10m3 = complet donc chaud + froid
        hospitalGrid.add(detachementBase, 0, 8, 2, 1);
        hospitalGrid.add(baseVie, 0, 9, 2, 1);
        CheckBox longueDuree = new CheckBox("Mission longue duree (w/ pays chaud/froid");
        hospitalGrid.add(longueDuree, 0, 10, 2, 1);
        // add 0,4 t & 2 m3
        CheckBox hotCountryBase = new CheckBox("Pays chaud");
        hospitalGrid.add(hotCountryBase, 0, 11, 1, 1);
        // add 0,7 t & 6 m3
        CheckBox coldCountryBase = new CheckBox("Pays froid");
        hospitalGrid.add(coldCountryBase, 1, 11, 1, 1);


        return hospitalGrid;
    }


    public void addCheckBoxEventHandlers() {
        for (Node node : getAllNodes(hospitalGrid)) {
            if (node instanceof CheckBox) {
                node.addEventHandler(ActionEvent.ACTION, this.getController());
            }
        }
    }


}
