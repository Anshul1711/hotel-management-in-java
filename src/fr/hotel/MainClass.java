package fr.hotel;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	private AnchorPane mainContainer;
	private Stage mainStage;

	@Override
	public void start(Stage primaryStage) {
		mainStage = primaryStage;
		mainStage.setTitle("Gestion Hôtel");
		initializeMainContainer();
		//intializeContain();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/* this function will load the main page of the application*/
	public void initializeMainContainer() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainClass.class.getResource("view/Accueil.fxml"));
		try {
			mainContainer = (AnchorPane) loader.load();
			Scene scene = new Scene(mainContainer);
			mainStage.setScene(scene);
			mainStage.show();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	/* this function will load the contain inside the main container*/
	public void intializeContain() {
		FXMLLoader loader = new FXMLLoader();
	}
}
