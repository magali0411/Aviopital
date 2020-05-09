package GUI.Views;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import GUI.Controller;

public class Structure extends ViewsModel {

    private GridPane structureGrid;

    public Structure(Controller controller) {
        super(controller);
        setStructureGrid(addStructureGrid());

    }

    public GridPane addStructureGrid() {

        GridPane colisPane = new GridPane();
        colisPane.setGridLinesVisible(false);
        colisPane.setVgap(10);
        colisPane.setHgap(10);

        /*affectataire
         * module
         *secteur varchar(20)
         *  nature_colis  varchar(20)
         * num_colis int(5)
         * designation_colis varchar(30)
         * precision_articles varchar(50)
         * dim varchar(20) LxWxH
         * volume float(5)
         * poids int(5)
         * observations varchar(20)
         */

        // Affectataire
        Label affectataire = new Label("Affectataire: " + "DAC");
        colisPane.add(affectataire, 0, 0, 2, 1);

        Label module = new Label("Module: " + "Comp. E2");
        colisPane.add(module, 0, 1, 2, 1);

        Label secteur = new Label("Secteur: " + "(L) Stock logistique");
        colisPane.add(secteur, 0, 2, 2, 1);

        Label nature = new Label("Nature: " + "Bac");
        colisPane.add(nature, 0, 3, 2, 1);

        Label num_colis = new Label("num: " + "17");
        colisPane.add(num_colis, 0, 4, 2, 1);

        Label designationAndPrecision = new Label("Soutien logistique : echaffaudage + 3 kits elec tm36/E2 + epsac");
        colisPane.add(designationAndPrecision, 0, 5, 2, 1);

        Label dimensionLabel = new Label("Dimension: " + "120x80x100");
        colisPane.add(dimensionLabel, 0, 6, 2, 1);

        Label volumeTitle = new Label("Volume: ");
        Label volume = new Label("0.96");
        colisPane.add(volumeTitle, 0, 7);
        colisPane.add(volume, 0, 8);

        Label poidsTitle = new Label("Poids: ");
        Label poids = new Label("112");
        colisPane.add(poidsTitle, 1, 7);
        colisPane.add(poids, 1, 8);

        Label observationTitle = new Label("Observations: " + "à compléter");
        colisPane.add(observationTitle, 0, 9, 2, 1);

        return colisPane;
    }

    // ------------------------ ATTRIBUTE ----------------------------

    public GridPane getStructureGrid() {
        return structureGrid;
    }

    public void setStructureGrid(GridPane structureGrid) {
        this.structureGrid = structureGrid;
    }
}
