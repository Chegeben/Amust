package amust;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AmustLogin implements Initializable {

	@FXML
	private Button login;
	@FXML
	private TextField UserTextLogin;
	@FXML
	private PasswordField passTextLogin;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		
	}
	

public void login(ActionEvent event) {
	
	

	try {
	
		
		
	
	
		Parent root = FXMLLoader.load(getClass().getResource("HomeView.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage HomeView = (Stage) ((Node) event.getSource()).getScene().getWindow();
		//Stage AmustLoginStage = n;
		HomeView.setScene(scene);
		HomeView.show();
		
				
		
		
		 }catch(Exception e) {
		e.printStackTrace();
	 	}
	}
}