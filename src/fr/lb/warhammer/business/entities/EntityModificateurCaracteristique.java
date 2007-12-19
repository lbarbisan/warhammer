package fr.lb.warhammer.business.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fr.lb.warhammer.business.entities.interfaces.IEntity;

/**
 * Cette classe represente un modificateur <strong>appliqué</strong>.
 * il contient donc une valeur, il est possible de retrouvé la définition du moificateur en utilisant definitionModificateurCaracteristique
 * @author lbarbisan
 */
@Entity
public class EntityModificateurCaracteristique extends fr.lb.warhammer.business.entities.Entity implements IEntity {

		
	/**
	 * 
	 */
	private static final long serialVersionUID = 9094693019989024317L;
	
	private EntityDefinitionModificateurCaracteristique definitionModificateurCaracteristique;
	
	private int valeur;
	

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
	public int getValeur() {
		return valeur;
	}


	/**
	 * @param valeur the valeur to set
	 */
	public void setValeur(int valeur) {
		Object oldValue = this.valeur;
		this.valeur = valeur;
		firePropertyChange("valeur", oldValue, this.valeur);
	}


	/**
	 * @return the definitionModificateurCaracteristique
	 */
	public EntityDefinitionModificateurCaracteristique getDefinitionModificateurCaracteristique() {
		return definitionModificateurCaracteristique;
	}


	/**
	 * @param definitionModificateurCaracteristique the definitionModificateurCaracteristique to set
	 */
	public void setDefinitionModificateurCaracteristique(EntityDefinitionModificateurCaracteristique definitionModificateurCaracteristique) {
		Object oldValue = this.definitionModificateurCaracteristique;
		this.definitionModificateurCaracteristique = definitionModificateurCaracteristique;
		firePropertyChange("definitionModificateurCaracteristique", oldValue, this.definitionModificateurCaracteristique);
	}
}
