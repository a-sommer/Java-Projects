 

// This program allows the user to retrieve records from the product table
// in the example database. The user can specify the desired fields,
// desired order, and a where condition.

package sommer34;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;


public class CustomExercise extends Application {

	// Declare an array of Strings for desired fields
	String[] desiredFields = {"Vin", "Make", "Model", "Year", "Color", "Price" };
	
	Connection connection;
	
	TextArea resultArea;
	
	ListView<String> lv;
	
	ListView<String> listView;
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		
		// Load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
				
		// Connect to a data base
		connection = DriverManager.getConnection("jdbc:mysql://localhost/example", "root", "sesame");
		System.out.println("Database connected");
		
		// Instantiate the listview objects
		lv = new ListView<>
			(FXCollections.observableArrayList(desiredFields));
		
		listView = new ListView<>
			(FXCollections.observableArrayList(desiredFields));
		
		lv.setPrefSize(100, 200);
		lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		listView.setPrefSize(100, 200);
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		
		listView.disableProperty().set(true);
		
		ComboBox<String> cbo = new ComboBox<>();
		cbo.getItems().addAll("Ascending", "Descending");
		cbo.setValue("Ascending");
		
		cbo.disableProperty().set(true);
		
		Button showResults = new Button("Show Results");
		
		resultArea = new TextArea();
		
		FlowPane productPane = new FlowPane(10, 10);
		BorderPane pane = new BorderPane();
		pane.setTop(productPane);
		productPane.getChildren().add(lv);
		productPane.getChildren().add(listView);
		productPane.getChildren().add(cbo);
		productPane.getChildren().add(showResults);
		pane.setCenter(resultArea);
		
		// On button click...
		showResults.setOnAction(e -> {
			try {
				// Call showResults
				showResults();
			} catch (ClassNotFoundException | SQLException e1) {
				
				e1.printStackTrace();
			}
		});
			
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 450, 450);
		primaryStage.setTitle("Custom Exercise");
		primaryStage.setScene(scene);
		primaryStage.show(); 
				
	}
	
	public void showResults() throws SQLException, ClassNotFoundException {
		ObservableList<String> columnList = lv.getSelectionModel().getSelectedItems();
		
		String colVars = String.join(",", columnList);
		
		// Create a statement
		Statement statement = connection.createStatement();
				
		// Execute a statement
		ResultSet resultSet = statement.executeQuery
				("select " + colVars + " from product");
		
		// Get column count from resultSet
		ResultSetMetaData rsmd = resultSet.getMetaData();
		int resultCols = rsmd.getColumnCount();
		
		String resultString = new String();
		
		// Iterate through the result and print the products
		while (resultSet.next()) {
			resultString += buildResultString(resultCols, resultSet);
			
		}
		
		resultArea.setText(resultString);		
		
	}
	
	private String buildResultString(int cols, ResultSet resultSet) throws SQLException {
		
		List<String> strArr = new ArrayList<String>();
		
		// Build result string
		for(int i = 1; i < cols+1; i++) {
			
			strArr.add(resultSet.getString(i));
		}
		return String.join("\t", strArr) + "\n";
	}
	
	public static void main(String[] args) {
				
		launch(args);

	}

}
