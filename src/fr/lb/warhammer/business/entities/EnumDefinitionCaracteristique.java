package fr.lb.warhammer.business.entities;


/**
 * Le PJ est d�fini par ses caract�ristiques, qui repr�sentent ses capacit�s brutes dans
 * un certain nombre de domaines physiques et mentaux.Elles sont divis�es
 * en deux groupes : le profil principal et le profil secondaire. Les caract�ristiques
 * du profil principal affichent une valeur comprise entre 0 et 100,
 * une valeur �lev�e indiquant un talent certain. Les caract�ristiques du
 * profil secondaire sont elles g�n�ralement not�es de 0 � 10, les valeurs les
 * plus hautes �tant �galement les meilleures.Chaque caract�ristique correspond
 * � une abr�viation, not�e ci-dessous entre parenth�ses.
 * 
 * @author lbarbisan
 */
public enum EnumDefinitionCaracteristique {
	/**
	 * Capacit� de Combat (CC) : cette caract�ristique repr�sente l�aptitude de 
	 * votre personnage en combat rapproch�, aussi bien arm� qu�� mains nues.
	 */
	CC,
	/**
	 * Capacit� de Tir (CT) : cette caract�ristique repr�sente l�aptitude de 
	 * votre personnage � se servir d�armes � projectiles, comme les arcs, les
	 * arbal�tes et les pistolets.
	 */
	CT,
	/**
	 * Force (F) : cette caract�ristique repr�sente la puissance musculaire
	 * brute de votre personnage.
	 */
	F,
	/**
	 * Endurance (E) : cette caract�ristique repr�sente la capacit� de votre
	 * personnage � supporter les blessures, la maladie et le poison.
	 */
	E,
	/**
	 * Agilit� (Ag) : cette caract�ristique repr�sente la v�locit� physique de
	 * votre personnage, son adresse manuelle et sa vitesse de r�action.
	 */
	Ag,
	/**
	 * Intelligence (Int) : cette caract�ristique repr�sente l�intellect de votre
	 * personnage, sa perspicacit� et sa capacit� de raisonnement.
	 */
	Int,
	/**
	 * Force Mentale (FM) : cette caract�ristique repr�sente la r�sistance
	 * mentale de votre personnage et sa pers�v�rance.
	 */
	FM,
	/**
	 * Sociabilit� (Soc) : cette caract�ristique repr�sente le charisme de
	 * votre personnage et sa capacit� � interagir socialement.
	 */
	Soc
}
