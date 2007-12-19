package fr.lb.warhammer.business.entities.interfaces;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Represent the root of all persistable object with Auto generation Id.
 * 
 * @author lbarbisan
 */
public interface IEntity extends Serializable{

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public abstract Integer getId();
}