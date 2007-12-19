package fr.lb.warhammer.business.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import fr.lb.warhammer.business.entities.interfaces.IEntity;

/**
 * Cette classe represente un modificateur.
 * <br> Un modificateur contient.
 * <br> Un base : 10 12, etc...
 * <br> Un nombre de des : 1, 2, etc...
 * <br> Un type de Des: Actuellement D10 ou D100
 * Base: 10, Nombre de des : 2, type D10: 10 + 2D10   
 * @author lbarbisan
 */
@Entity
public class EntityDefinitionModificateurCaracteristique extends fr.lb.warhammer.business.entities.Entity implements IEntity {

	
	@Transient private static final long serialVersionUID = 3660945876033804055L;

	private byte base;
	private byte desNumber;
	private byte desType;
	
	private EnumDefinitionRace race;
	private EnumDefinitionCaracteristique caracteristique;
	

	/**
	 * @return the race
	 */
	public EnumDefinitionRace getRace() {
		return race;
	}


	/**
	 * @param race the race to set
	 */
	@Enumerated(EnumType.STRING)
	public void setRace(EnumDefinitionRace race) {
		Object oldValue = this.race;
		this.race = race;
		firePropertyChange("race", oldValue, this.race);
	}


	/**
	 * @return the caracteristique
	 */
	public EnumDefinitionCaracteristique getCaracteristique() {
		return caracteristique;
	}


	/**
	 * @param caracteristique the caracteristique to set
	 */
	@Enumerated(EnumType.STRING)
	public void setCaracteristique(EnumDefinitionCaracteristique caracteristique) {
		Object oldValue = this.caracteristique;
		this.caracteristique = caracteristique;
		firePropertyChange("caracteristique", oldValue, this.caracteristique);
	}


	/**
	 * @see fr.lb.l5r.business.entities.Entity#getId()
	 */
	@Id	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}


	/**
	 * @return the base
	 */
	public byte getBase() {
		return base;
	}


	/**
	 * @param base the base to set
	 */
	public void setBase(byte base) {
		Object oldValue = this.base;
		this.base = base;
		firePropertyChange("base", oldValue, this.base);
	}


	/**
	 * @return the desNumber
	 */
	public byte getDesNumber() {
		return desNumber;
	}


	/**
	 * @param desNumber the desNumber to set
	 */
	public void setDesNumber(byte desNumber) {
		Object oldValue = this.desNumber;
		this.desNumber = desNumber;
		firePropertyChange("desNumber", oldValue, this.desNumber);
	}


	/**
	 * @return the desType
	 */
	public byte getDesType() {
		return desType;
	}


	/**
	 * @param desType the desType to set
	 */
	public void setDesType(byte desType) {
		Object oldValue = this.desType;
		this.desType = desType;
		firePropertyChange("desType", oldValue, this.desType);
	}
}
