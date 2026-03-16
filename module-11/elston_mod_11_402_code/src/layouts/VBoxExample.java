// Tanner Elston, CSD 402, Assignment 11.2, 3/9/26

package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX VBox layout container.
 * VBox arranges containers in a single vertical column.
 * Src: https://openjfx.io/javadoc/21/javafx.graphics/javafx/scene/layout/VBox.html
 */
public class VBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Instantiate a VBox layout container
        VBox vBox = new VBox();

        // Set padding around the VBox using geometry.insets
        vBox.setPadding(new Insets(16));

        // Set vertical spacing between each node
        vBox.setSpacing(10);

        // Center the buttons horizontally and vertically within the VBox
        vBox.setAlignment(Pos.CENTER);

        // Instantiate six buttons
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        Button btn6 = new Button("Button 6");

        // Print button name when button is pressed
        for (Button btn : new Button[]{btn1, btn2, btn3, btn4, btn5, btn6}) {
            btn.setOnAction(e -> System.out.println("Clicked: " + ((Button) e.getSource()).getText()));
        }

        // Add all buttons to the VBox
        vBox.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6);

        Scene scene = new Scene(vBox, 200, 300);
        primaryStage.setTitle("VBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}