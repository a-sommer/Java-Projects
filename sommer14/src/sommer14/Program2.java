 
// This program displays an emoji.


package sommer14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Program2 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane to hold the emoji
		Pane pane = new Pane();
		
		// Create a face
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(75);
		circle.setStroke(Color.YELLOW);
		circle.setFill(Color.YELLOW);
		pane.getChildren().add(circle);
		
		// Create the glasses
		Circle glassesLeft = new Circle();
		glassesLeft.setCenterX(65);
		glassesLeft.setCenterY(75);
		glassesLeft.setRadius(25);
		glassesLeft.setStroke(Color.BLACK);
		glassesLeft.setStrokeWidth(3);
		glassesLeft.setFill(Color.YELLOW);
		pane.getChildren().add(glassesLeft);
		
		Circle glassesRight = new Circle();
		glassesRight.setCenterX(135);
		glassesRight.setCenterY(75);
		glassesRight.setRadius(25);
		glassesRight.setStroke(Color.BLACK);
		glassesRight.setStrokeWidth(3);
		glassesRight.setFill(Color.YELLOW);
		pane.getChildren().add(glassesRight);
		
		Line line = new Line(90, 75, 110, 75);
		line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);
		pane.getChildren().add(line);
		
		// Create eyeballs
		Ellipse leftEye = new Ellipse(75, 75, 5, 8);
		leftEye.setStroke(Color.BROWN);
		leftEye.setFill(Color.BROWN);
		pane.getChildren().add(leftEye);
		
		Ellipse rightEye = new Ellipse(125, 75, 5, 8);
		rightEye.setStroke(Color.BROWN);
		rightEye.setFill(Color.BROWN);
		pane.getChildren().add(rightEye);
		
		// Create a smile
		Arc smile = new Arc(100, 120, 30, 30, 230, 80);
		smile.setType(ArcType.OPEN);
		smile.setStroke(Color.BROWN);
		smile.setStrokeWidth(5);
		smile.setFill(Color.YELLOW);
		pane.getChildren().add(smile);
		
		// Create a scene and place it in the stage
		Scene scene= new Scene(pane, 200, 200);
		primaryStage.setTitle("Emoji");
		primaryStage.setScene(scene);
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
