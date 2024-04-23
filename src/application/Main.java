package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
		Parent root = loader.load();
		Controller controller = loader.getController();
		Scene scene = new Scene(root);
		stage.setTitle("Web Browser");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {

		launch(args);
	}
}
