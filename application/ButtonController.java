package application;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ButtonController {
	
	public void BackPatient(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Mawaa2.fxml"));
		Scene scene = new Scene(root,700,400);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

}
