package fr.hotel;

import java.io.IOException;

import fr.hotel.model.Model1.Client;
import fr.hotel.model.Model1.Salle;
import fr.hotel.model.Model1.Sexe;
import fr.hotel.view.ClientMapping;
import fr.hotel.view.FormClientMapping;
import fr.hotel.view.MainMenuMapping;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	private BorderPane mainContainer;
	private Stage mainStage;
	private Stage clientStage;
	private ObservableList<Client> listClient = FXCollections.observableArrayList();
	private ObservableList<Salle> listeSalle = FXCollections.observableArrayList();

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
		//this.displayClientManagerUi();
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
			MainMenuMapping controller = loader.getController();
			controller.setMainApp(this);
			mainStage.show();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	/* this function will load the client contain inside the main container*/
	public void loadClientManagerUi(){
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
	
	//methode that will use to load ui management chambre
	@FXML
	public void loadChambreManagerUi() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainClass.class.getResource("view/ChambreView.fxml"));
		try {
			AnchorPane page = (AnchorPane) loader.load();
			mainContainer.setCenter(page);
			MainMenuMapping controleur = loader.getController();
			controleur.setMainApp(this);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//methode that will use to load ui management employe
	@FXML
	public void loadEmployeManagerUi() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainClass.class.getResource("view/EmployeView.fxml"));
		try {
			AnchorPane page = (AnchorPane) loader.load();
			mainContainer.setCenter(page);
			MainMenuMapping controleur = loader.getController();
			controleur.setMainApp(this);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	/* function that will be use to edit or add a client*/
	public void displayClientDialog(Client c, String title) {
		FXMLLoader loader = new FXMLLoader(MainClass.class.getResource("view/ClientEditDialog.fxml"));
		try {
			//load the fxml ui that will use to add or edit client
			AnchorPane page = (AnchorPane) loader.load();
			
			//creating a new stage
			clientStage = new Stage();
			clientStage.setTitle(title);
			clientStage.initModality(Modality.WINDOW_MODAL);
			//Avec cette instruction, notre fenêtre modifiée sera modale
	        //par rapport à notre stage principal
			clientStage.initOwner(mainStage);
			//define our scene for the new stage
			Scene scene = new Scene(page);
			clientStage.setScene(scene);
			FormClientMapping controller = loader.getController(); 
			controller.setMainApp(this);
			controller.setClient(c);
			
			// Show the dialog and wait until the user closes it
			clientStage.showAndWait();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public ObservableList<Client> getListClient() {
		return this.listClient;
	}
	
	public Stage getStage() {
		return mainStage;
	}
	
	public Stage getClientStage() {
		return clientStage;
	}
	
	public BorderPane getMainContainer() {
		return mainContainer;
	}
}
