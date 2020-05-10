package GUI.Views;

import GUI.Controller;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TitledPane;

public class ColisMedicament extends ViewsModel{

    private SplitPane mainSplitPane;
    private ListView<String> preselectedDrugs;
    private ListView<String> addingDrugs;

    public ColisMedicament(Controller controller) {
        super(controller);
        this.mainSplitPane = initSplitPane();
    }

    public SplitPane getMainSplitPane() {
        return mainSplitPane;
    }

    public void setMainSplitPane(SplitPane mainSplitPane) {
        this.mainSplitPane = mainSplitPane;
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
        listView.getItems().addAll("Medicamen1", "Medicament2");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        this.preselectedDrugs = listView;
        return listView;
    }

    public ListView<String> addAddingDrugs(){
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Medicamen1bis", "Medicament2bis");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        this.addingDrugs = listView;
        return listView;
    }

    public SplitPane initSplitPane(){

        SplitPane splitPane = new SplitPane();

        TitledPane titledPanePreSelected = new TitledPane("Médicaments Pré-sélectionnés", addPreselectedDrugs());
        titledPanePreSelected.setCollapsible(false);

        TitledPane titledPaneAddingDrugs = new TitledPane("Ajout de médicament", addPreselectedDrugs());
        titledPaneAddingDrugs.setCollapsible(false);

        splitPane.getItems().addAll(titledPanePreSelected, titledPaneAddingDrugs);

        this.mainSplitPane = splitPane;

        return splitPane;
    }
}
