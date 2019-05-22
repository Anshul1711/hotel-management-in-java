package fr.hotel.model.Model1;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * 
 */
public class Salle {
	
    private StringProperty id = new SimpleStringProperty();
    
    private IntegerProperty nbPlace = new SimpleIntegerProperty();

    private SimpleObjectProperty<TypeSalle> type = new SimpleObjectProperty<>();

    private StringProperty description = new SimpleStringProperty();
    
    /**
     * Default constructor
     */
    public Salle() {
    	this(null, 0, null, null);
    }
    
    public Salle(String i, int np, TypeSalle  t, String d) {
    	id.set(i);
    	nbPlace.set(np);
    	type.set(t);
    	description.set(d);
    }
	

	public String getId() {
		return this.id.get();
	}
	
	public final void setId(String id) {
		this.id.set(id);
	}
	
	
	public StringProperty idProperty() {
        return id;
	}

	public int getNbPlace() {
		return this.nbPlace.get();
	}
	
	public void setNbPlace(int nbPlace) {
		this.nbPlace.set(nbPlace);
	}
	
	public IntegerProperty npProperty() {
        return nbPlace;
    }
	
	public TypeSalle getType() {
		return this.type.get();
	}
	

	public void setType(TypeSalle type) {
		this.type.set(type);
	}

	public ObjectProperty<TypeSalle> typeProperty() {
		return this.type;
	}
	
	 public StringProperty descriptionProperty() {
	        return description;
	 }

	public String getDescription() {
		return this.description.get();
	}
	

	public void setDescription(String d) {
		this.description.set(d);
	}
	

}