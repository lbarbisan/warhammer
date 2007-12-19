package fr.lb.warhammer.business.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import fr.lb.warhammer.business.entities.interfaces.IEntity;

/**
 * Chaque joueur de WJDR contr�le un personnage, que l�on qualifie
 * de personnage joueur, ou PJ, et qui n�est autre que son alter ego
 * dans l�univers de Warhammer. Il peut s�agir d�un Noble arrogant,
 * d�un nain Tueur de trolls totalement fr�n�tique ou d�un Ratier crasseux
 * � souhait. Tous les personnages joueurs ont une chose en commun :
 * ils sont aventuriers. Cela signifie qu�ils sont livr�s � eux-m�mes,
 * �voluant en marge des normes de la soci�t�, en qu�te de la gloire et de
 * la fortune que pourront leur offrir leurs comp�tences et leurs talents.
 * Les aventuriers ne sont pas des gens normaux. Ils se montrent ambitieux,
 * parfois h�ro�ques et plus ou moins fous. Et il faut l��tre pour aller
 * combattre des gobelins dans les entrailles de la terre, se mesurer aux
 * adorateurs du Chaos et faire face aux morts-vivants.
 * Ce chapitre traite de la conception des personnages de WJDR.
 * La cr�ation d�un tel PJ reste une proc�dure simple qui ne devrait pas
 * prendre plus d�une demi-heure. Pour commencer, vous aurez besoin
 * d�une fiche de personnage vierge (vous en trouverez une � la page
 * 251). C�est sur cette fiche que vous allez inscrire les divers attributs de
 * votre personnage. Elle vous servira intensivement en cours de partie et
 * sera sujette � de nombreuses modifications tout au long du jeu.
 * Il est donc conseill� d�y �crire clairement et au crayon. Il vous faudra
 * aussi deux d�s � dix faces (d10). Ce sont les d�s que vous lancerez
 * pendant toute partie de WJDR et la logique voudrait qu�ils soient de
 * couleurs diff�rentes (cf. Lecture des jets de d�s, page 9).Vous pouvez
 * normalement vous procurer des d�s � dix faces dans tout magasin
 * proposant le pr�sent ouvrage.
 */
@Entity
public class EntityPersonnageJoueur extends fr.lb.warhammer.business.entities.Entity implements IEntity {
	

	/**
	 * 
	 */
	@Transient private static final long serialVersionUID = -3335169952938504104L;
	
	/**
	 * Race du personnage
	 */
	private EnumDefinitionRace race;
	/**
	 * Liste des modificateurs de CC.
	 */
	private EntityCaracteristique CC;
	/**
	 * Liste des modificateurs de CT.
	 */
	private EntityCaracteristique CT;

	
	/**
	 * @see fr.lb.l5r.business.entities.Entity#getId()
	 */
	@Id	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public EnumDefinitionRace getRace() {
		return race;
	}
	/**
	 * Definie la race pour le personnage
	 */
	@Enumerated(EnumType.STRING)
	public void setRace(EnumDefinitionRace race) {
		Object oldValue = this.race;
		this.race = race;
		firePropertyChange("race", oldValue, this.race);
	}

	/**
	 * EnumDefinitionCaracteristique.CC
	 * @return
	 */
	public EntityCaracteristique getCC() {
		return CC;
	}
	/**
	 * EnumDefinitionCaracteristique.CC
	 * @param cc
	 */
	public void setCC(EntityCaracteristique cc) {
		Object oldValue = CC;
		CC = cc;
		firePropertyChange("cc", oldValue, CC);
	}

	public EntityCaracteristique getCT() {
		return CT;
	}

	public void setCT(EntityCaracteristique ct) {
		Object oldValue = CT;
		CT = ct;
		firePropertyChange("ct", oldValue, CT);
	}
}
