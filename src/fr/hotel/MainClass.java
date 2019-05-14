package fr.hotel;

import java.io.IOException;

import fr.hotel.model.Model1.Client;
import fr.hotel.model.Model1.Sexe;
import fr.hotel.view.ClientMapping;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	private BorderPane mainContainer;
	private Stage mainStage;
	private ObservableList<Client> listClient = FXCollections.observableArrayList();

public	MainClass() {
	listClient.add(new Client(1, "djo", "Kenmeni", Sexe.MASCULIN, "1295434", "Camerounaise"));
	listClient.add(new Client(2, "djo", "Claude", Sexe.FEMININ, "1239434", "Camerounaise"));
	listClient.add(new Client(3, "djo", "André", Sexe.MASCULIN, "1235434", "Camerounaise"));
}
	
	@Override
	public void start(Stage primaryStage) {
		mainStage = primaryStage;
		mainStage.setTitle("Gestion Hôtel");
		initializeMainContainer();
		loadClientManagerUi();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/* this function will load the main page of the application*/
	private void initializeMainContainer() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainClass.class.getResource("view/Accueil.fxml"));
		try {
			mainContainer = (BorderPane) loader.load();
			Scene scene = new Scene(mainContainer);
			mainStage.setScene(scene);
			mainStage.show();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	/* this function will load the client contain inside the main container*/
	private void loadClientManagerUi(){
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainClass.class.getResource("view/ClientView.fxml"));
		try {
			AnchorPane clientContainer = (AnchorPane) loader.load();
			mainContainer.setCenter(clientContainer);
			ClientMapping controleur = loader.getController();
			controleur.setMainApp(this);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public ObservableList<Client> getListClient() {
		return this.listClient;
	}
}
