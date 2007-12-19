package fr.lb.warhammer.toolkit;

/**
 * Cette classe genere un nombre aleatoire pour les type de des passé en paramètre
 * @author Administrateur
 *
 */
public class DesGenerator {

	/**
	 * Renvoie un resultat de des
	 * @param numberDes Nombre de dés 1 minimum
	 * @param typeDes type de dés  10 pour D10, 100 pour D100, etc.
	 * @return
	 * @throws IllegalArgumentException Si le nombre de dés est < 1 ou le type < 1
	 */
	public static int Generate(int numberDes, int typeDes) throws IllegalArgumentException
	{
		int result=0;
		
		//POST-CONDITION
		if(numberDes<1 || typeDes <1)
		{
			throw new IllegalArgumentException("Number of dices and kind of dices can't be less than 1");
		}
		
		//Generate dices results
		for(int index = 0;index < numberDes;index++)
		{
			result += (int)(Math.random() * typeDes);
		}
		
		return result;
	}
}
