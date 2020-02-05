package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class HandlingInput extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Stage window;
    private Scene scene;
    private Button button;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("hello");

//        Form
        TextField nameInput = new TextField();
        button = new Button("Submit");

        button.setOnAction(event -> {
            isInt(nameInput, nameInput.getText());
        });

//        Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameInput, button);

//        Scene
        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }

    private boolean isInt(TextField source, String message) {
        try {
            int age = Integer.parseInt(message);
            System.out.println("User is " + age);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Error " + message +" is not an integer.");
        }
        return false;
    }

}
