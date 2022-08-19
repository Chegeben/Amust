package amust;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class Main extends Application {
	
	
	
	
	
	
	@Override
	public void start(Stage AmustStage) {
		try {
			
			
			Parent root = FXMLLoader.load(getClass().getResource("Amust.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			AmustStage.setScene(scene);
			AmustStage.show();
			
		    AmustStage.getIcons().add(new Image(getClass().getResourceAsStream("Amust.png")))	;
			AmustStage.setResizable(false);
			AmustStage.setTitle("Amust corp");
			
			AmustStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
				public void handle(WindowEvent arg0) {
					Platform.exit();
					System.exit(0);
				}
		});
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
