package fr.lb.warhammer.business.entities;


/**
 * Cette classe represente une classe de personnage warhammer :
 * <br> Humain
 * <br> Nain
 * <br> Halfing
 * <br> Elfe
 *  La création d’un personnage débute par une question cruciale :
 *  quelle race voulez-vous interpréter ? WJDR vous en propose quatre :
 *  elfe, halfling, humain et nain.Chaque race s’accompagne de forces et
 *  de faiblesses. Elles sont chacune abordées ci-après.Une fois que vous aurez
 *  lu ces descriptions,choisissez la race qui vous tente le plus.Vous serez alors
 *  prêt pour l’étape suivante : déterminer vos caractéristiques.
 * @author lbarbisan
 */
public enum EnumDefinitionRace {
	/**
	 * Les humains constituent la race la plus courante du Vieux Monde
	 * et restent les fondateurs de l’Empire. S’ils ne sont pas aussi
	 * robustes que les nains, ni aussi sages que les elfes, les humains
	 * demeurent une race pleine d’entrain et d’énergie dont la réussite
	 * est aussi manifeste que rapide. Leur capacité d’adaptation est
	 * remarquable, ce qui représente à la fois une grande force et une
	 * lourde faiblesse. Si beaucoup d’humains héroïques ont combattu
	 * contre les flots ténébreux, on ne peut nier qu’ils constituent également
	 * la part du lion des hordes du Chaos
	 */
	HUMAIN,
	/**
	 * Les nains constituent une race de guerriers et d’artisans courts
	 * sur pattes, mais également trapus et résistants. La plupart
	 * d’entre eux vivent au sein de formidables forteresses enfouies
	 * sous les montagnes, dont les mines s’étendent dans les entrailles
	 * de la terre. On les reconnaît instantanément à leur silhouette
	 * corpulente, leur longue crinière et leur barbe épaisse. Ils se
	 * montrent généralement bourrus et irritables et leur facilité à se
	 * complaire dans la rancune est légendaire. Il n’en reste pas
	 * moins que les nains demeurent un peuple d’une grande
	 * bravoure et d’une loyauté sans faille à l’égard de leurs amis et
	 * de leurs alliés. Ils luttent pour préserver les vestiges de leur
	 * royaume montagneux des griffes des orques, gobelins et autres
	 * créatures répugnantes. Leurs liens avec les humains de
	 * l’Empire sont robustes et nombreux sont ceux qui font désormais
	 * partie de la société impériale.
	 */
	NAIN,
	/**
	 * Les halflings sont petits mais très adroits, pouvant facilement
	 * passer pour des enfants humains au premier coup d’oeil. Cette
	 * impression est d’ailleurs renforcée par le fait qu’il ne leur
	 * pousse jamais le moindre poil de barbe. Bien qu’ils affichent
	 * souvent un ventre bien rond, du fait de leurs repas deux fois
	 * plus fréquents que ceux de toute autre race, ils sont capables
	 * d’une grande discrétion. Si l’on associe cela à leur légendaire
	 * adresse à la fronde, on comprend mieux comment les halflings
	 * peuvent s’avérer de tenaces adversaires. Ils restent cependant
	 * un peuple globalement pacifique, se contentant d’assurer le
	 * travail de la ferme, de manger et de fumer l’herbe à pipe. Ils sont
	 * fiers de leurs familles, à tel point que tous peuvent réciter leur
	 * arbre généalogique en remontant au moins dix générations
	 */
	HALFING,
	/**
	 * Les elfes sont des êtres agiles et gracieux, facilement identifiables
	 * par leurs oreilles pointues et leurs traits aiguisés. Leur histoire
	 * est aussi glorieuse que tragique et leur renommée d’archers,
	 * d’érudits et de magiciens a traversé les frontières. Les elfes sont
	 * dotés d’une compréhension innée des voies et des courants de la
	 * nature, en particulier pour ce qui concerne la forêt et la mer.
	 * Ils n’ont que mépris à l’égard de ceux qui souillent la pureté
	 * sauvage, qu’il s’agisse d’humains orgueilleux, de nains avides ou
	 * d’orques maléfiques. Et bien qu’ils puissent paraître distants,
	 * il ne faut pas oublier qu’ils se sont sacrifiés pour le bien du
	 * monde, au-delà de ce que les autres races peuvent concevoir.
	 */
	ELFE
}
