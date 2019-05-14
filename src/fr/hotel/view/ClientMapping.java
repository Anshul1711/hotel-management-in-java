/**
 * 
 */
package fr.hotel.view;

import fr.hotel.MainClass;
import fr.hotel.model.Model1.Client;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * @author Denver99
 *
 */
public class ClientMapping {

	/**
	 * 
	 */
	
	@FXML
    private TableView<Client> clientTable;
    @FXML
    private TableColumn<Client, String> nomColumn;
    @FXML
    private TableColumn<Client, String> prenomColumn;
    @FXML
    private Label nomValue;
    @FXML
    private Label prenomValue;
    @FXML
    private Label numCniValue;
    @FXML
    private Label sexeValue;
    @FXML
    private Label nationaliteValue;
    @FXML
    private Button delete;
    @FXML
    private Button edit;
    @FXML
    private Button add;
    
    //Objet servant de référence à notre classe principale
    //afin de pouvoir récupérer la liste de nos objets.
    private MainClass main;

    //Un constructeur par défaut
    public ClientMapping() { }

    //Méthode qui initialise notre interface graphique
    //avec nos données métier
    @FXML
    private void initialize() {
        // Initialize the Client table with the two columns.
        nomColumn.setCellValueFactory(cellData -> cellData.getValue().getNom());
        prenomColumn.setCellValueFactory(cellData -> cellData.getValue().getPrenom());
    }

    //Méthode qui sera utilisée dans l'initialisation de l'IHM
    //dans notre classe principale
    public void setMainApp(MainClass mainApp) {
        this.main = mainApp;
        // On lie notre liste observable au composant TableView
        this.clientTable.setItems(main.getListClient());
    }
}
