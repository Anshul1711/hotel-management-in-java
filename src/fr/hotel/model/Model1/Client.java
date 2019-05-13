package fr.hotel.model.Model1;


import java.util.*;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * 
 */
public class Client implements CrudInterface{
    /**
	 * @param idClient
	 * @param nomClient
	 * @param prenomClient
	 * @param sexe
	 * @param numCni
	 * @param nationnalite
	 */
	public Client(IntegerProperty idClient, StringProperty nomClient, StringProperty prenomClient,
			SimpleObjectProperty<Sexe> sexe, StringProperty numCni, StringProperty nationnalite) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.sexe = sexe;
		this.numCni = numCni;
		this.nationnalite = nationnalite;
	}

	/**
     * 
     */
    private IntegerProperty idClient = new SimpleIntegerProperty();

    /**
     * 
     */
    private StringProperty nomClient = new SimpleStringProperty();

    /**
     * 
     */
    private StringProperty prenomClient = new SimpleStringProperty();

    /**
     * 
     */
    private SimpleObjectProperty<Sexe> sexe = new SimpleObjectProperty<>();

    /**
     * 
     */
    private StringProperty numCni = new SimpleStringProperty();

    /**
     * 
     */
    private StringProperty nationnalite = new SimpleStringProperty();




    /**
     * @return
     */
    public void ajouter() {
        // TODO implement here
        return;
    }

    /**
     * @return
     */
    public void modifier() {
        // TODO implement here
        return;
    }

    /**
     * @return
     */
    public void supprimer() {
        // TODO implement here
        return;
    }

    /**
     * @return
     */
    public void afficher() {
        // TODO implement here
        return;
    }

	public final IntegerProperty idClientProperty() {
		return this.idClient;
	}
	

	public final int getIdClient() {
		return this.idClientProperty().get();
	}
	

	public final void setIdClient(final int idClient) {
		this.idClientProperty().set(idClient);
	}
	

	public final StringProperty nomClientProperty() {
		return this.nomClient;
	}
	

	public final String getNomClient() {
		return this.nomClientProperty().get();
	}
	

	public final void setNomClient(final String nomClient) {
		this.nomClientProperty().set(nomClient);
	}
	

	public final StringProperty prenomClientProperty() {
		return this.prenomClient;
	}
	

	public final String getPrenomClient() {
		return this.prenomClientProperty().get();
	}
	

	public final void setPrenomClient(final String prenomClient) {
		this.prenomClientProperty().set(prenomClient);
	}
	

	public final SimpleObjectProperty<Sexe> sexeProperty() {
		return this.sexe;
	}
	

	public final Sexe getSexe() {
		return this.sexeProperty().get();
	}
	

	public final void setSexe(final Sexe sexe) {
		this.sexeProperty().set(sexe);
	}
	

	public final StringProperty numCniProperty() {
		return this.numCni;
	}
	

	public final String getNumCni() {
		return this.numCniProperty().get();
	}
	

	public final void setNumCni(final String numCni) {
		this.numCniProperty().set(numCni);
	}
	

	public final StringProperty nationnaliteProperty() {
		return this.nationnalite;
	}
	

	public final String getNationnalite() {
		return this.nationnaliteProperty().get();
	}
	

	public final void setNationnalite(final String nationnalite) {
		this.nationnaliteProperty().set(nationnalite);
	}
	

}