package fr.lb.warhammer.toolkit;

import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * 
 * @author Administrateur
 * 
 */
public class DesGeneratorTest {

	/**
	 * 
	 */
	@Test
	public void testGenerate() {
		boolean stop = true;

		for (int index = 1; index < 1000; index++) {
			int result = DesGenerator.Generate(2, index);
			if (result < 0 || result > index * 2) {
				fail("Dices generator return invalid value:" + result + " Value must be >= 0 and <= " + (index * 2));
			}
		}

		try {
			stop = true;
			DesGenerator.Generate(0, 0);
		} catch (Exception e) {
			stop = false;
		}

		if (stop) {
			fail("Invalid argument must raised argumentException");
		}
		stop = true;
		
		
		try {
			stop = true;
			DesGenerator.Generate(-1, -1);
		} catch (Exception e) {
			stop = false;
		}
		if (stop) {
			fail("Invalid argument must raised argumentException");
		}
		stop = true;
		
		try {
			stop = true;
			DesGenerator.Generate(1, -1);
		} catch (Exception e) {
			stop = false;
		}
		if (stop) {
			fail("Invalid argument must raised argumentException");
		}
		stop = true;
		
		try {
			stop = true;
			DesGenerator.Generate(-1, 1);
		} catch (Exception e) {
			stop = false;
		}
		if (stop) {
			fail("Invalid argument must raised argumentException");
		}

	}

}
