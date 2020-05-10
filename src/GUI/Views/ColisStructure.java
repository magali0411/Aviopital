package GUI.Views;

import GUI.Controller;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

public class ColisStructure extends ViewsModel {

    private VBox colisStructure;

    private TitledPane colisPreSelected;
    private TitledPane addColis;


    public ColisStructure(Controller controller) {
        super(controller);
        this.colisStructure = addColisStructure();

    }

    public VBox getColisStructure() {
        return colisStructure;
    }

    public TitledPane getColisPreSelected() {
        return colisPreSelected;
    }

    public void setColisPreSelected(TitledPane colisPreSelected) {
        this.colisPreSelected = colisPreSelected;
    }

    public TitledPane getAddColis() {
        return addColis;
    }

    public void setAddColis(TitledPane addColis) {
        this.addColis = addColis;
    }

    public TitledPane addPreSelectedColis(){
        Label label = new Label("ColisStructure 1");
        TitledPane titledPane = new TitledPane("Colis pré-sélectionnés", label);
        setColisPreSelected(titledPane);

        return titledPane;
    }

    public TitledPane addAddColis(){
        Label label = new Label("ColisStructure 1bis");
        TitledPane titledPane = new TitledPane("Ajouter un colis", label);
        setAddColis(titledPane);

        return titledPane;
    }

    public VBox addColisStructure(){

        VBox vBox = new VBox();
        vBox.getChildren().addAll(addPreSelectedColis(),addAddColis());

        return vBox;
    }
}
