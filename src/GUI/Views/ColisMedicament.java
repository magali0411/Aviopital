package GUI.Views;

import DAO.MedicamentDaoImpl;
import GUI.Controller;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ColisMedicament extends ViewsModel{

    private VBox mainVBox;
    private ListView<String> preselectedDrugs;
    private ListView<String> addingDrugs;

    public ColisMedicament(Controller controller) {
        super(controller);
        this.mainVBox = initVBox();
    }

    public VBox getMainVBox() {
        return mainVBox;
    }

    public void setMainVBox(VBox mainVBox) {
        this.mainVBox = mainVBox;
    }

    public ListView<String> getPreselectedDrugs() {
        return preselectedDrugs;
    }

    public void setPreselectedDrugs(ListView<String> preselectedDrugs) {
        this.preselectedDrugs = preselectedDrugs;
    }

    public ListView<String> getAddingDrugs() {
        return addingDrugs;
    }

    public void setAddingDrugs(ListView<String> addingDrugs) {
        this.addingDrugs = addingDrugs;
    }

    public ListView<String> addPreselectedDrugs(){
        ListView<String> listView = new ListView<>();
        
        listView.getItems().addAll(MedicamentDaoImpl.getInstance().getAllName());
        //listView.getItems().addAll("Medicamen1", "Medicament2");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        this.preselectedDrugs = listView;
        return listView;
    }

    public ListView<String> addAddingDrugs(){
        ListView<String> listView = new ListView<>();
        //listView.getItems().addAll(MedicamentDaoImpl.getInstance().getAllName());
        listView.getItems().addAll("Medicamen1bis", "Medicament2bis");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        this.addingDrugs = listView;
        return listView;
    }

    public VBox initVBox(){

        VBox vBox = new VBox();

        SplitPane splitPane = new SplitPane();

        TitledPane titledPanePreSelected = new TitledPane("Médicaments Pré-sélectionnés", addPreselectedDrugs());
        titledPanePreSelected.setCollapsible(false);

        TitledPane titledPaneAddingDrugs = new TitledPane("Ajout de médicament", addPreselectedDrugs());
        titledPaneAddingDrugs.setCollapsible(false);

        splitPane.getItems().addAll(titledPanePreSelected, titledPaneAddingDrugs);

        HBox hBox = new HBox();
        Button add = new Button("<");
        Button remove = new Button(">");

        hBox.getChildren().addAll(add,remove);

        vBox.getChildren().addAll(splitPane, hBox);

        this.mainVBox = vBox;

        return vBox;
    }
}
