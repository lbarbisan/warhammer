package fr.lb.warhammer.business.entities;


/**
 * Cette classe represente une classe de personnage warhammer :
 * <br> Humain
 * <br> Nain
 * <br> Halfing
 * <br> Elfe
 *  La cr�ation d�un personnage d�bute par une question cruciale :
 *  quelle race voulez-vous interpr�ter ? WJDR vous en propose quatre :
 *  elfe, halfling, humain et nain.Chaque race s�accompagne de forces et
 *  de faiblesses. Elles sont chacune abord�es ci-apr�s.Une fois que vous aurez
 *  lu ces descriptions,choisissez la race qui vous tente le plus.Vous serez alors
 *  pr�t pour l��tape suivante : d�terminer vos caract�ristiques.
 * @author lbarbisan
 */
public enum EnumDefinitionRace {
	/**
	 * Les humains constituent la race la plus courante du Vieux Monde
	 * et restent les fondateurs de l�Empire. S�ils ne sont pas aussi
	 * robustes que les nains, ni aussi sages que les elfes, les humains
	 * demeurent une race pleine d�entrain et d��nergie dont la r�ussite
	 * est aussi manifeste que rapide. Leur capacit� d�adaptation est
	 * remarquable, ce qui repr�sente � la fois une grande force et une
	 * lourde faiblesse. Si beaucoup d�humains h�ro�ques ont combattu
	 * contre les flots t�n�breux, on ne peut nier qu�ils constituent �galement
	 * la part du lion des hordes du Chaos
	 */
	HUMAIN,
	/**
	 * Les nains constituent une race de guerriers et d�artisans courts
	 * sur pattes, mais �galement trapus et r�sistants. La plupart
	 * d�entre eux vivent au sein de formidables forteresses enfouies
	 * sous les montagnes, dont les mines s��tendent dans les entrailles
	 * de la terre. On les reconna�t instantan�ment � leur silhouette
	 * corpulente, leur longue crini�re et leur barbe �paisse. Ils se
	 * montrent g�n�ralement bourrus et irritables et leur facilit� � se
	 * complaire dans la rancune est l�gendaire. Il n�en reste pas
	 * moins que les nains demeurent un peuple d�une grande
	 * bravoure et d�une loyaut� sans faille � l��gard de leurs amis et
	 * de leurs alli�s. Ils luttent pour pr�server les vestiges de leur
	 * royaume montagneux des griffes des orques, gobelins et autres
	 * cr�atures r�pugnantes. Leurs liens avec les humains de
	 * l�Empire sont robustes et nombreux sont ceux qui font d�sormais
	 * partie de la soci�t� imp�riale.
	 */
	NAIN,
	/**
	 * Les halflings sont petits mais tr�s adroits, pouvant facilement
	 * passer pour des enfants humains au premier coup d�oeil. Cette
	 * impression est d�ailleurs renforc�e par le fait qu�il ne leur
	 * pousse jamais le moindre poil de barbe. Bien qu�ils affichent
	 * souvent un ventre bien rond, du fait de leurs repas deux fois
	 * plus fr�quents que ceux de toute autre race, ils sont capables
	 * d�une grande discr�tion. Si l�on associe cela � leur l�gendaire
	 * adresse � la fronde, on comprend mieux comment les halflings
	 * peuvent s�av�rer de tenaces adversaires. Ils restent cependant
	 * un peuple globalement pacifique, se contentant d�assurer le
	 * travail de la ferme, de manger et de fumer l�herbe � pipe. Ils sont
	 * fiers de leurs familles, � tel point que tous peuvent r�citer leur
	 * arbre g�n�alogique en remontant au moins dix g�n�rations
	 */
	HALFING,
	/**
	 * Les elfes sont des �tres agiles et gracieux, facilement identifiables
	 * par leurs oreilles pointues et leurs traits aiguis�s. Leur histoire
	 * est aussi glorieuse que tragique et leur renomm�e d�archers,
	 * d��rudits et de magiciens a travers� les fronti�res. Les elfes sont
	 * dot�s d�une compr�hension inn�e des voies et des courants de la
	 * nature, en particulier pour ce qui concerne la for�t et la mer.
	 * Ils n�ont que m�pris � l��gard de ceux qui souillent la puret�
	 * sauvage, qu�il s�agisse d�humains orgueilleux, de nains avides ou
	 * d�orques mal�fiques. Et bien qu�ils puissent para�tre distants,
	 * il ne faut pas oublier qu�ils se sont sacrifi�s pour le bien du
	 * monde, au-del� de ce que les autres races peuvent concevoir.
	 */
	ELFE
}
