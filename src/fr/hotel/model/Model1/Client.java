package fr.hotel.model.Model1;

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
     * 
     */
    private IntegerProperty id = new SimpleIntegerProperty();

    /**
     * 
     */
    private StringProperty nom = new SimpleStringProperty();

    /**
     * 
     */
    private StringProperty prenom = new SimpleStringProperty();

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
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param numCni
	 * @param nationnalite
	 */
	public Client(int id_client, String n, String p,
		 Sexe s, String num_cni, String natio) {
		id.set(id_client);
		nom.set(n);
		prenom.set(p);
		sexe.set(s);
		numCni.set(num_cni);
		nationnalite.set(natio);
	}


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

	public IntegerProperty getId() {
		return this.id;
	}
	

	public void setId(IntegerProperty id) {
		this.id = id;
	}
	
	public StringProperty getNom() {
		return this.nom;
	}
	

	public void setNom(StringProperty nom) {
		this.nom = nom;
	}
	

	public final StringProperty getPrenom() {
		return this.prenom;
	}
	

	public void setPrenom(StringProperty prenom) {
		this.prenom = prenom;
	}
	

	public final SimpleObjectProperty<Sexe> sexeProperty() {
		return this.sexe;
	}
	

	public final Sexe getSexe() {
		return this.sexeProperty().get();
	}
	

	public void setSexe(SimpleObjectProperty<Sexe> sexe) {
		this.sexe = sexe;
	}
	

	public StringProperty getNumCni() {
		return this.numCni;
	}
	

	public void setNumCni(StringProperty numCni) {
		this.numCni = numCni;
	}
	

	public StringProperty getNationnalite() {
		return this.nationnalite;
	}
	

	public void setNationnalite(StringProperty nationnalite) {
		this.nationnalite = nationnalite;
	}
	

}