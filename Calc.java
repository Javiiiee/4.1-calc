/* Algorithm Calculator
 * Purpose: to calculate three different algorithms with any number with different buttons
 * Author: Javier Bonilla
 * License: Class only
 */
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.application.Application;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.ComboBox;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;
import javafx.geometry.Insets;
import javafx.scene.control.TextInputControl;

public class Calc extends Application{
	@Override
	public void start(Stage primaryStage){
	GridPane grid = new GridPane();
	grid.setPadding(new Insets(10, 10, 10, 10));
	Label label1 = new Label("Enter any number:");
	TextField textField = new TextField();
	//button one set up
	Button one = new Button("Factorial");
	one.setOnAction(e -> {//insert factorial loop
	
	
		int number = Integer.parseInt(textField.getText());
		long fact = 1;
		int i = 1;
		while(i<=number){
			fact = (fact*i);
			i++;
			}
		 System.out.println("Factorial of " + number + " is " + fact);
		});
	//button two set up
	Button two = new Button("Sum of odd number");
	two.setOnAction(e -> { //insert sum of odd numbers
		int limit = Integer.parseInt(textField.getText());
		int sum = 0;
		int i = 0;
		
		
		for(i=1; i<=limit; i++){
			sum += 2*i-1;
				
			}
			System.out.println("The sum of the first " + limit + "odd numbers is " + sum);
		});
	//button three set up 
	Button three = new Button("Fibonnaci");
	three.setOnAction(e -> {//Fibonacci code
		int limit = Integer.parseInt(textField.getText());
		int[] series = new int[limit];
		int i = 1;
		series [0] = 0;
		series [1] = 1;
		for (i=2; i<limit; i++) {
			series[i] = series[i-1]+series[i-2];
		}
			for(i=0; i <limit; i++){
			System.out.print(series[i] + " ");
			}
		});
				
	FlowPane pane = new FlowPane();
	pane.getChildren().addAll(label1, textField, one, two, three);
	Scene scene = new Scene(pane, 300, 100);
	primaryStage.setTitle("Calculator");
	primaryStage.setScene(scene);
	primaryStage.show();
	

	}
}

