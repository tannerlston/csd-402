// Tanner Elston, CSD 402, Assignment 11.2, 3/9/26

package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * JavaFX BorderPane layout container.
 * BorderPane divides the screen into five regions:
 * Top, Bottom, Left, Right, and Center.
 * Src: https://openjfx.io/javadoc/21/javafx.graphics/javafx/scene/layout/BorderPane.html
 */
public class BorderPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Instantiate a BorderPane layout container
        BorderPane borderPane = new BorderPane();

        // Set padding around the BorderPane
        borderPane.setPadding(new Insets(16));

        // Instantiate buttons for each region
        Button topBtn    = new Button("Top Region");
        Button bottomBtn = new Button("Bottom Region");
        Button leftBtn   = new Button("Left Region");
        Button rightBtn  = new Button("Right Region");
        Button centerBtn = new Button("Center Region");

        // Center each button within its region
        BorderPane.setAlignment(topBtn,    Pos.CENTER);
        BorderPane.setAlignment(bottomBtn, Pos.CENTER);
        BorderPane.setAlignment(leftBtn,   Pos.CENTER);
        BorderPane.setAlignment(rightBtn,  Pos.CENTER);
        BorderPane.setAlignment(centerBtn, Pos.CENTER);

        // Place each button in its corresponding region
        borderPane.setTop(topBtn);
        borderPane.setBottom(bottomBtn);
        borderPane.setLeft(leftBtn);
        borderPane.setRight(rightBtn);
        borderPane.setCenter(centerBtn);

        // Print button when button is pressed
        topBtn.setOnAction(e    -> System.out.println("Clicked: Top"));
        bottomBtn.setOnAction(e -> System.out.println("Clicked: Bottom"));
        leftBtn.setOnAction(e   -> System.out.println("Clicked: Left"));
        rightBtn.setOnAction(e  -> System.out.println("Clicked: Right"));
        centerBtn.setOnAction(e -> System.out.println("Clicked: Center"));

        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setTitle("BorderPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}