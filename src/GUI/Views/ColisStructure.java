package GUI.Views;

import DAO.ColisDaoImpl;
import GUI.Controller;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ColisStructure extends ViewsModel {

    private VBox colisStructure;

    private ListView<String> colisPreSelected;
    private ListView<String> addColis;


    public ColisStructure(Controller controller) {
        super(controller);
        this.colisStructure = addColisStructure();

    }

    public VBox getColisStructure() {
        return colisStructure;
    }

    public ListView<String> getColisPreSelected() {
        return colisPreSelected;
    }

    public void setColisPreSelected(ListView<String> colisPreSelected) {
        this.colisPreSelected = colisPreSelected;
    }

    public ListView<String> getAddColis() {
        return addColis;
    }

    public void setAddColis(ListView<String> addColis) {
        this.addColis = addColis;
    }

    public ListView<String> addPreSelectedColis(){

        ListView<String> listView = new ListView<>();
        //listView.getItems().addAll("ColisStructure 1");
        listView.getItems().addAll(ColisDaoImpl.getInstance().getAllBase());
        setColisPreSelected(listView);

        return listView;
    }

    public ListView<String> addAddingColis(){

        ListView<String> listView = new ListView<>();
        //listView.getItems().addAll("ColisStructure 1bis");
        listView.getItems().addAll(ColisDaoImpl.getInstance().getAllCaisseName());
        setColisPreSelected(listView);

        return listView;
    }


    public VBox addColisStructure(){

        VBox vBox = new VBox();

        SplitPane splitPane = new SplitPane();

        TitledPane titledPanePreSelected = new TitledPane("Colis Pré-sélectionnés", addPreSelectedColis());
        titledPanePreSelected.setCollapsible(false);

        TitledPane titledPaneAddingStructure = new TitledPane("Ajouter un colis", addPreSelectedColis());
        titledPaneAddingStructure.setCollapsible(false);

        splitPane.getItems().addAll(titledPanePreSelected, titledPaneAddingStructure);

        HBox hBox = new HBox();
        Button add = new Button("<");
        Button remove = new Button(">");

        hBox.getChildren().addAll(add,remove);

        vBox.getChildren().addAll(splitPane, hBox);

        this.colisStructure = vBox;

        return vBox;
    }
}
