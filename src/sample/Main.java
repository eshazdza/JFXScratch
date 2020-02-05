package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage mainWindow;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainWindow = primaryStage;
        mainWindow.setTitle("hello");
        mainWindow.setOnCloseRequest(event -> {
            event.consume();
            closeProgram();
        });

//        Top menu
        HBox topMenu = new HBox();

        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");

        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

//        Left Menu
        VBox leftMenu = new VBox();

        Button buttonD = new Button("D");
        Button buttonE = new Button("E");
        Button buttonF = new Button("F");

        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);

//        Add both menus to a border pane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);


        Scene scene = new Scene(borderPane, 300, 300);

        mainWindow.setScene(scene);
        mainWindow.show();

    }

    private void closeProgram() {

        boolean answer = ConfirmBox.display("title", "Confirm Exit?");
        if (answer) {
            mainWindow.close();
        }
    }

}
