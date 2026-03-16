// Tanner Elston, CSD 402, Assignment 11.2, 3/9/26

package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Main.java
 * Launcher menu that opens VBox or BorderPane examples in separate windows.
 * Src: https://openjfx.io/javadoc/21/javafx.graphics/javafx/application/Application.html
 *
 * This project was created using the Maven build tool with the JavaFX Maven Plugin.
 * Compatible with Java 21 JDK and JavaFX 21.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Create a VBox to hold the launcher buttons
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(16));
        vBox.setSpacing(10);

        // Buttons to launch each example
        Button vboxBtn       = new Button("Launch VBox Example");
        Button borderPaneBtn = new Button("Launch BorderPane Example");

        // Launch VBox example in a new window
        vboxBtn.setOnAction(e -> {
            VBoxExample vboxExample = new VBoxExample();
            Stage vboxStage = new Stage();
            try { vboxExample.start(vboxStage); } catch (Exception ex) { ex.printStackTrace(); }
        });

        // Launch BorderPane example in a new window
        borderPaneBtn.setOnAction(e -> {
            BorderPaneExample borderPaneExample = new BorderPaneExample();
            Stage borderPaneStage = new Stage();
            try { borderPaneExample.start(borderPaneStage); } catch (Exception ex) { ex.printStackTrace(); }
        });

        vBox.getChildren().addAll(vboxBtn, borderPaneBtn);

        Scene scene = new Scene(vBox, 300, 150);
        primaryStage.setTitle("JavaFX Layout Examples");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}