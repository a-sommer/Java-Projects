 
// This program calculates the future value of an investment at a given
// interest rate for a specified number of years.



package sommer15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise15_5 extends Application {
	
	private TextField tfInvestmentAmount = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfFutureValue = new TextField();
	private Button btCalculate = new Button("Calculate");
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create UI
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("Investment Amount"), 0, 0);
		gridPane.add(tfInvestmentAmount, 1, 0);
		gridPane.add(new Label("Number of Years"), 0, 1);
		gridPane.add(tfNumberOfYears, 1, 1);
		gridPane.add(new Label("Annual Interest Rate"), 0, 2);
		gridPane.add(tfAnnualInterestRate, 1, 2);
		gridPane.add(new Label("Future Value"), 0, 3);
		gridPane.add(tfFutureValue,  1, 3);
		gridPane.add(btCalculate, 1, 4);
		
		// Set properties for UI
		gridPane.setAlignment(Pos.CENTER);
		tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);
		
		// Process events
		btCalculate.setOnAction(e -> calculateFutureValue());
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 400, 250);
		primaryStage.setTitle("Exercise15_5");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	

	private void calculateFutureValue() {
		// Get values from text fields
		double investmentAmount = 
				Double.parseDouble(tfInvestmentAmount.getText());
		int year = Integer.parseInt(tfNumberOfYears.getText());
		double interest = 
				Double.parseDouble(tfAnnualInterestRate.getText());
		double futureValue;
		double monthlyInterest = (interest / 100) / 12;
		
		// Calculate future value
		//futureValue = investmentAmount * (1 + monthlyInterest) ^ (years * 12)
		futureValue = investmentAmount * Math.pow(1 + monthlyInterest, year * 12);

		// Display future value
		tfFutureValue.setText(String.format("$%.2f", futureValue));
	}
	  /**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	  public static void main(String[] args) {
	    launch(args);
	  }

}
