 
// This program creates a working order form for Orinoco.


package sommer16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Chapter16 extends Application {
	
	private TextField tfItem = new TextField();
	private TextField tfPrice = new TextField();
	private TextField tfQuantity = new TextField();
	private CheckBox chkTaxable = new CheckBox("Taxable?");
	private RadioButton rbNextDay = new RadioButton("$20");
	private RadioButton rbThisWeek = new RadioButton("$12");
	private RadioButton rbSomeDay = new RadioButton("$5");
	private double totalDue = 0;
	private Label lbTotalDue = new Label(String.format("$%.2f", totalDue));
	private Button btProcess = new Button("Process");
	private Button btReset = new Button("Reset");
	
	
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		// Create UI
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.setPadding(new Insets(15, 5, 15, 5));
		gridPane.add(new Label("Item"), 0, 0);
		gridPane.add(tfItem, 1, 0);
		gridPane.add(new Label("Price"), 0, 1);
		gridPane.add(tfPrice, 1, 1);
		gridPane.add(new Label("Quantity"), 0, 2);
		gridPane.add(tfQuantity, 1, 2);
		gridPane.add(chkTaxable, 1, 3);
		gridPane.add(new Label("Shipping"), 0, 4);
		gridPane.add(new Label("Next Day"), 0, 5);
		gridPane.add(rbNextDay, 1, 5);
		gridPane.add(new Label("This Week"), 0, 6);
		gridPane.add(rbThisWeek, 1, 6);
		gridPane.add(new Label("Some Day"), 0, 7);
		gridPane.add(rbSomeDay, 1, 7);
		gridPane.add(new Label("Total Due"), 0, 8);
		gridPane.add(lbTotalDue, 1, 8);
		gridPane.add(btProcess, 0, 9);
		gridPane.add(btReset, 1, 9);
		
		// Set properties for UI
		gridPane.setAlignment(Pos.TOP_CENTER);
		tfItem.setAlignment(Pos.BOTTOM_LEFT);
		tfPrice.setAlignment(Pos.BOTTOM_LEFT);
		tfQuantity.setAlignment(Pos.BOTTOM_LEFT);
		
		// Process 'Process' event
		btProcess.setOnAction(e -> calculateTotalDue());
		
		// Process 'Reset' event
		btReset.setOnAction(e -> resetForm());
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 250, 275);
		primaryStage.setTitle("orinoco.com");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void calculateTotalDue() {
		
		// Get values from text fields
		double price = Double.parseDouble(tfPrice.getText());
		double quantity = Double.parseDouble(tfQuantity.getText());
		
		// Calculate the subtotal
		double subtotal = price * quantity;
		
		// Create a variable for sales tax
		double salesTax = 0;
		
		// Add sales tax if applicable
		if (chkTaxable.isSelected()) {
			
			salesTax = subtotal * .07;
			subtotal += salesTax;
		}
		
		// Add shipping costs
		if (rbNextDay.isSelected()) {
			subtotal += 20;
		}
		else if (rbThisWeek.isSelected()) {
			subtotal += 12;
		}
		else {
			subtotal += 5;
		}
		
		// Update Total Due
		totalDue = subtotal;
		lbTotalDue.setText(String.format("$%.2f", totalDue));

	}
	
	private void resetForm() {
		// Clear all fields
		tfItem.setText("");
		tfPrice.setText("");
		tfQuantity.setText("");
		chkTaxable.setSelected(false);
		rbNextDay.setSelected(false);
		rbThisWeek.setSelected(false);
		rbSomeDay.setSelected(false);
		// Reset total due
		totalDue = 0;	
		lbTotalDue.setText(String.format("$%.2f", totalDue));
		
	}
	
	   /**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	  public static void main(String[] args) {
	    launch(args);
	  }

}
