package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Stack;

public class TreeViewSample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Stage window;
    TreeView<String> tree;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Tree view");

        TreeItem<String> root, bucky, megan;

//        Root
        root = new TreeItem<>();
        root.setExpanded(true);

//        Bucky Branch
        bucky = makeBranch("Bucky", root);
        makeBranch("youtube", bucky);
        makeBranch("Chiken", bucky);
        makeBranch("Derp", bucky);

//        Megan Branch
        megan = makeBranch("Megan", root);
        makeBranch("Glitter", megan);
        makeBranch("Makeup", megan);

//        Create Tree
        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if (newValue != null)
                System.out.println(newValue.getValue());
        });

//        Layout
        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

    //    Create Branches
    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }

}
