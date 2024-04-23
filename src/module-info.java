module LAB_4 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.web;
	
	opens application to javafx.graphics, javafx.fxml;
}
