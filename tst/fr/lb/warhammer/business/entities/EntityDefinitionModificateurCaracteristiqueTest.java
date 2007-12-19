package fr.lb.warhammer.business.entities;

import java.io.File;
import java.util.Hashtable;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.jboss.ejb3.embedded.EJB3StandaloneBootstrap;
import org.jboss.ejb3.embedded.EJB3StandaloneDeployer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.lb.warhammer.business.beans.interfaces.IEntityLocal;
import fr.lb.warhammer.business.entities.interfaces.IEntity;

public class EntityDefinitionModificateurCaracteristiqueTest {

	private static InitialContext ctx;
	private static IEntityLocal local;
	private static IEntity entity;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		try {			
			EJB3StandaloneBootstrap.boot(null);
			EJB3StandaloneDeployer deployer = EJB3StandaloneBootstrap.createDeployer();
		    File file = new File("F:\\projects\\Projects\\L5R\\Warhammer");
		    deployer.getDeployDirs().add(file.toURL());

		    deployer.create();
		    deployer.start();

			ctx = getInitialContext();
			local = (IEntityLocal) ctx.lookup("EntityBean/local");
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link fr.lb.l5r.business.beans.EntityBean#create(java.lang.Class, java.lang.Object[])}.
	 * @throws NamingException 
	 */
	@Test
	public void testCreate() throws NamingException {
		setDefinition("20+2d10", EnumDefinitionCaracteristique.CC, EnumDefinitionRace.ELFE);
		setDefinition("30+2d10", EnumDefinitionCaracteristique.CT, EnumDefinitionRace.ELFE);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.F, EnumDefinitionRace.ELFE);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.E, EnumDefinitionRace.ELFE);
		setDefinition("30+2d10", EnumDefinitionCaracteristique.Ag, EnumDefinitionRace.ELFE);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.Int, EnumDefinitionRace.ELFE);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.FM, EnumDefinitionRace.ELFE);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.Soc, EnumDefinitionRace.ELFE);
		
		setDefinition("10+2d10", EnumDefinitionCaracteristique.CC, EnumDefinitionRace.HALFING);
		setDefinition("30+2d10", EnumDefinitionCaracteristique.CT, EnumDefinitionRace.HALFING);
		setDefinition("10+2d10", EnumDefinitionCaracteristique.F, EnumDefinitionRace.HALFING);
		setDefinition("10+2d10", EnumDefinitionCaracteristique.E, EnumDefinitionRace.HALFING);
		setDefinition("30+2d10", EnumDefinitionCaracteristique.Ag, EnumDefinitionRace.HALFING);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.Int, EnumDefinitionRace.HALFING);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.FM, EnumDefinitionRace.HALFING);
		setDefinition("30+2d10", EnumDefinitionCaracteristique.Soc, EnumDefinitionRace.HALFING);
		
		setDefinition("20+2d10", EnumDefinitionCaracteristique.CC, EnumDefinitionRace.HUMAIN);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.CT, EnumDefinitionRace.HUMAIN);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.F, EnumDefinitionRace.HUMAIN);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.E, EnumDefinitionRace.HUMAIN);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.Ag, EnumDefinitionRace.HUMAIN);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.Int, EnumDefinitionRace.HUMAIN);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.FM, EnumDefinitionRace.HUMAIN);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.Soc, EnumDefinitionRace.HUMAIN);
		
		setDefinition("30+2d10", EnumDefinitionCaracteristique.CC, EnumDefinitionRace.NAIN);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.CT, EnumDefinitionRace.NAIN);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.F, EnumDefinitionRace.NAIN);
		setDefinition("30+2d10", EnumDefinitionCaracteristique.E, EnumDefinitionRace.NAIN);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.Ag, EnumDefinitionRace.NAIN);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.Int, EnumDefinitionRace.NAIN);
		setDefinition("20+2d10", EnumDefinitionCaracteristique.FM, EnumDefinitionRace.NAIN);
		setDefinition("10+2d10", EnumDefinitionCaracteristique.Soc, EnumDefinitionRace.NAIN);
	}
	
	/**
	 * 
	 * @param type
	 * @param caracteristique
	 * @param race
	 */
	private void setDefinition(String type, EnumDefinitionCaracteristique caracteristique, EnumDefinitionRace race)
	{
		EntityDefinitionModificateurCaracteristique definition = (EntityDefinitionModificateurCaracteristique) 
																local.create(EntityDefinitionModificateurCaracteristique.class);
		definition.setAll(type, caracteristique, race);
		local.save(definition);
	}
	
	public static InitialContext getInitialContext() throws Exception {
		Hashtable props = getInitialContextProperties();
		return new InitialContext(props);
	}

	private static Hashtable getInitialContextProperties() {
		Hashtable props = new Hashtable();
		props.put("java.naming.factory.initial","org.jnp.interfaces.LocalOnlyContextFactory");
		props.put("java.naming.factory.url.pkgs","org.jboss.naming:org.jnp.interfaces");
		return props;
	}

}
