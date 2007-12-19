package fr.lb.warhammer.business.entities;


/**
 * Le PJ est défini par ses caractéristiques, qui représentent ses capacités brutes dans
 * un certain nombre de domaines physiques et mentaux.Elles sont divisées
 * en deux groupes : le profil principal et le profil secondaire. Les caractéristiques
 * du profil principal affichent une valeur comprise entre 0 et 100,
 * une valeur élevée indiquant un talent certain. Les caractéristiques du
 * profil secondaire sont elles généralement notées de 0 à 10, les valeurs les
 * plus hautes étant également les meilleures.Chaque caractéristique correspond
 * à une abréviation, notée ci-dessous entre parenthèses.
 * 
 * @author lbarbisan
 */
public enum EnumDefinitionCaracteristique {
	/**
	 * Capacité de Combat (CC) : cette caractéristique représente l’aptitude de 
	 * votre personnage en combat rapproché, aussi bien armé qu’à mains nues.
	 */
	CC,
	/**
	 * Capacité de Tir (CT) : cette caractéristique représente l’aptitude de 
	 * votre personnage à se servir d’armes à projectiles, comme les arcs, les
	 * arbalètes et les pistolets.
	 */
	CT,
	/**
	 * Force (F) : cette caractéristique représente la puissance musculaire
	 * brute de votre personnage.
	 */
	F,
	/**
	 * Endurance (E) : cette caractéristique représente la capacité de votre
	 * personnage à supporter les blessures, la maladie et le poison.
	 */
	E,
	/**
	 * Agilité (Ag) : cette caractéristique représente la vélocité physique de
	 * votre personnage, son adresse manuelle et sa vitesse de réaction.
	 */
	Ag,
	/**
	 * Intelligence (Int) : cette caractéristique représente l’intellect de votre
	 * personnage, sa perspicacité et sa capacité de raisonnement.
	 */
	Int,
	/**
	 * Force Mentale (FM) : cette caractéristique représente la résistance
	 * mentale de votre personnage et sa persévérance.
	 */
	FM,
	/**
	 * Sociabilité (Soc) : cette caractéristique représente le charisme de
	 * votre personnage et sa capacité à interagir socialement.
	 */
	Soc
}
