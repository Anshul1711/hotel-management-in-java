/**
 * 
 */
package fr.hotel.model.Model1;

/**
 * @author Denver99
 *
 */
public enum Sexe {

	MASCULIN("Masculin"),
    FEMININ("Féminin"),
    INCONNU("Inconnu");
    
    private String name = "";
    
    Sexe(String n){name = n;}
    public String toString() {return name;}
}
