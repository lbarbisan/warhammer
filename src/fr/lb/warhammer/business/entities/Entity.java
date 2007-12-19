/**
 * 
 */
package fr.lb.warhammer.business.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fr.lb.warhammer.business.entities.interfaces.IEntity;

/**
 * @author Administrateur
 *
 */
public class Entity extends AbstractEntity implements IEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3960485408464798825L;
	
	//	identité
	protected int id;

	/**
	 * @see fr.lb.l5r.business.entities.Entity#getId()
	 */
	@Id	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	/**
	 * @param id set the id
	 */
	public void setId(int id) {
		this.id = id;
	}

}
