 
// This program displays a blue square, red circle,
// and green cross in a grid.

package sommer14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Program1 extends Application {
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane to hold the shapes
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(10, 10, 10, 10));
		
		// Create a circle and set its properties
		Circle circle = new Circle();
		circle.setRadius(50);
		circle.setStroke(Color.RED);
		circle.setFill(Color.RED);
		//Add circle to the pane
		pane.add(circle, 1, 1);
		
		// Create a rectangle and set its properties
		Rectangle rectangle = new Rectangle(10, 10, 90, 90);
		rectangle.setStroke(Color.BLUE);
		rectangle.setFill(Color.BLUE);
		// Add rectangle to the pane
		pane.add(rectangle, 0, 0);
		
		
		// Add a nested pane for the cross
		Pane crossPane = new Pane();
		crossPane.setPrefSize(100, 100);
		pane.add(crossPane, 2, 2);
		
		// Create a horizontal line
		Line line1 = new Line(20, 20, 80, 20);
		line1.setStrokeWidth(5);
		line1.setStroke(Color.GREEN);
		
		// Create a vertical line
		Line line2 = new Line(50, 0, 50, 90);
		line2.setStrokeWidth(5);
		line2.setStroke(Color.GREEN);
		
		// Add both lines to the nested pane
		crossPane.getChildren().addAll(line1, line2);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 300);
		// Set the stage title
		primaryStage.setTitle("Shapes in Grid");
		// Place the scene in the stage
		primaryStage.setScene(scene);
		//Display the stage
		primaryStage.show(); 
		
	}
	
	/**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	public static void main(String[] args) {
		launch(args);
	}
}
