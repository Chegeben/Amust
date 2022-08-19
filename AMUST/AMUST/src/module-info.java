module AMUST {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	
	opens amust to javafx.graphics, javafx.fxml;
}
