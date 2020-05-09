package GUI.Views;

import javafx.scene.Node;
import javafx.scene.Parent;
import GUI.Controller;

import java.util.ArrayList;

public abstract class ViewsModel {

    private Controller controller;

    public ViewsModel(Controller controller){
        this.controller = controller;
    }

    public static ArrayList<Node> getAllNodes(Parent root) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        addAllDescendents(root, nodes);
        return nodes;
    }

    private static void addAllDescendents(Parent parent, ArrayList<Node> nodes) {
        for (Node node : parent.getChildrenUnmodifiable()) {
            nodes.add(node);
            if (node instanceof Parent)
                addAllDescendents((Parent)node, nodes);
        }
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
