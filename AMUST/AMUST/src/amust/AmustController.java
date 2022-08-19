package amust;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;





public class AmustController implements Initializable {
	
	@FXML
	private Label nameUI1, nameUI11, nameUI111, nameUI1111, nameUI11111, nameUI1111111, nameUI11111111;
	@FXML
	private Button SubmitCredetialsUI;
	@FXML
	private TextField  UserTextUI, countryTextUI, PhoneTextUI, CodeTextUI;
	@FXML
	private TextField nameTextUI;
	//@FXML
	//private PasswordField PasswordTextUI, ConfirmPasswordTextUI;
	@FXML
	private ChoiceBox <String>genderSelectionUI; 
	private String [] TheGender =  {"Male", "Female", "Others","chege"};
	
	ObservableList<String> list = FXCollections.observableArrayList();
	

	
	
	
	
	
	/**
	@FXML
	private void Submit(javafx.event .ActionEvent event) throws IOException {
		
		
		
		
		if(nameTextUI.getText().equals(Che)) {
			Parent root = FXMLLoader.load(getClass().getResource("AmustLogin.fxml"));
			Scene scene = new Scene(root);
			Stage AmustLoginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			//Stage AmustLoginStage = n;
			AmustLoginStage.setScene(scene);
			AmustLoginStage.show();
			AmustLoginStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
				public void handle(WindowEvent event) {
					Platform.exit();
					System.exit(0);
				}
			});
		}
			
		
		}
	
	**/
	
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		
		
		nameTextUI = new TextField();
		
	//	SubmitCredetialsUI = 	new Button();
		
		
		
		
		// list = genderSelection.getItems(); 
		
		genderSelectionUI.getItems().addAll(TheGender);
		
		
		
		
		genderSelectionUI.setVisible(true);
		
		
		
		
		
		
		
		
	}
	
	 public void Submit(ActionEvent event) {
		
		
		 
		 String name = nameTextUI.getText();
		 String User = UserTextUI.getText();
		 String country = countryTextUI.getText();
		 String phone = PhoneTextUI.getText();
		 String gender = genderSelectionUI.getSelectionModel().getSelectedItem();
		 String pass = PasswordTextUI.getText();
		 
		 
		 

		try {
		
			
			
		
		
			Parent root2 = FXMLLoader.load(getClass().getResource("AmustLogin.fxml"));
			Scene scene = new Scene(root2);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage AmustLoginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			//Stage AmustLoginStage = n;
			AmustLoginStage.setScene(scene);
			AmustLoginStage.show();
			
					
			
			
			 }catch(Exception e) {
			e.printStackTrace();
		 	}
		}
}
	

