package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxesSample extends Application {

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

//        CheckBoxes
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");

        box1.setSelected(true);

//        Button
        button = new Button("Order");
        button.setOnAction(event -> {
            handleOption(box1, box2);
        });

//        Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box1, box2, button);

//        Scene
        scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    //    Handle checkbox options
    private void handleOption(CheckBox box1, CheckBox box2) {
        String message = "User order : \n";

        if (box1.isSelected()) {
            message += "bacon \n";
        }
        if (box2.isSelected()) {
            message += "tuna \n";
        }

        System.out.println(message);
    }

}
