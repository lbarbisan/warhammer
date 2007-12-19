package fr.lb.warhammer.business.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import fr.lb.warhammer.business.entities.interfaces.IEntity;

/**
 * Cette classe renvoie la valeur d'une caractéristique.
 * <br> La valeur d'une caractéristique est obtenue en sommant tout ses modificateurs.
 * @author lbarbisan
 */
@Entity
public class EntityCaracteristique extends fr.lb.warhammer.business.entities.Entity implements IEntity {

		
	/**
	 * 
	 */
	private static final long serialVersionUID = 9094693019989024317L;
	
	//TODO: Injection de dépandance
	private List<EntityModificateurCaracteristique> modificateursCaracteristique;
	
	
	/**
	 * @see fr.lb.l5r.business.entities.Entity#getId()
	 */
	@Id	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}


	/**
	 * @return the valeur
	 */
	@Transient public int getValeur() {
		int value=0;
		for(EntityModificateurCaracteristique modificateur : modificateursCaracteristique)
		{
			value += modificateur.getValeur();
		}
		return value;
	}

	
	public List<EntityModificateurCaracteristique> getModificateurCaracteristique() {
		return modificateursCaracteristique;
	}
	
	public void setModificateurCaracteristique(
			List<EntityModificateurCaracteristique> modificateurCaracteristique) {
		Object oldValue = modificateursCaracteristique;
		modificateursCaracteristique = modificateurCaracteristique;
		firePropertyChange("modificateurCaracteristique", oldValue,
				modificateursCaracteristique);
	}
}
