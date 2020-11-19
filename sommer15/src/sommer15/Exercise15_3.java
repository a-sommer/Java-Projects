 
// This program allows the user to move a ball within a pane by pressing the corresponding button (e.g. left, right).

package sommer15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Exercise15_3 extends Application {
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		// Hold four buttons in an HBox
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		HBox hBox = new HBox(btLeft, btRight, btUp, btDown);
		hBox.setSpacing(3);
		hBox.setAlignment(Pos.CENTER);
		
		BorderPane pane = new BorderPane();
		pane.setBottom(hBox);
		
		// Create the circle
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(15);
		circle.setStroke(Color.BLACK);
		circle.setFill(null);
		
		pane.getChildren().add(circle);
		
		btLeft.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handler event
			public void handle(ActionEvent e) {
				
				if (circle.getCenterX() == 16) {
					// Do nothing
					// Keeps circle within boundary
				}
				else {
					// Move circle left
					circle.setCenterX(circle.getCenterX() - 2);
				}
			}
		});		
		
		btRight.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handler event
			public void handle(ActionEvent e) {
				
				if (circle.getCenterX() == 234) {
					// Do nothing
					// Keeps circle within boundary
				}
				else {
					
					// Move circle right
					circle.setCenterX(circle.getCenterX() + 2);
				}
			}
		});
		
		
		btUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handler event
			public void handle(ActionEvent e) {
				
				if (circle.getCenterY() == 16) {
					// Do nothing
					// Keeps circle within boundary
				}
				else {
					// Move circle up
					circle.setCenterY(circle.getCenterY() - 2);
				}
			}
		});
		
		btDown.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handler event
			public void handle(ActionEvent e) {
				
				if (circle.getCenterY() == 184) {
					// Do nothing
					// Keeps circle within boundary
				}
				else {
					// Move circle down
					circle.setCenterY(circle.getCenterY() + 2);
				}
			}
		});
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 200);
		primaryStage.setTitle("Exercise15_3");
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
