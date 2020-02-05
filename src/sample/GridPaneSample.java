package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GridPaneSample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("hello");

        GridPane grid = new GridPane();
//        Padding of the grid
        grid.setPadding(new Insets(10, 10, 10, 10));
//        Padding of the grid cells
        grid.setVgap(8);
        grid.setHgap(10);

//        Name label
        Label nameLabel = new Label("Username : ");
        GridPane.setConstraints(nameLabel, 0, 0);

//        Name Input
        TextField nameInput = new TextField("Username");
        GridPane.setConstraints(nameInput, 1, 0);

//        Password Label
        Label passLabel = new Label("Password ");
        GridPane.setConstraints(passLabel, 0, 1);

//        Password Input
        TextField passInput = new TextField();
//        setPromptText = HTML placeholder
        passInput.setPromptText("Password");
        GridPane.setConstraints(passInput, 1, 1);

//      Login Button
        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 1, 2);

//        Add
        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);

        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);

        window.show();
    }

}
