import org.junit.Assert;
import org.junit.Test;

public class RoboPotLickerTest {

	RoboPotLicker testPet = new RoboPotLicker("Schultz", "He's Dead Too!", 0, 0, 0, 0, 0);

	@Test
	public void testRoboKittyKatExistsButIsNull() {
		RoboPotLicker testPet = null;
		Assert.assertNull(testPet);
	}

	@Test
	public void testRoboPotLickerExistsButIsNotNull() {
		Assert.assertNotNull(testPet);
	}

	@Test
	public void testRoboPotLickerHasName() {
		Assert.assertEquals("Schultz", testPet.getName());

	}

	@Test
	public void testRoboPotLickerHasDescription() {
		Assert.assertEquals("He's Dead Too!", testPet.getDescription());
	}

	@Test
	public void testWhenICreateRoboPotLickerICanIncludeNameAndDescription() {
		Assert.assertEquals("Schultz", testPet.getName());
		Assert.assertEquals("He's Dead Too!", testPet.getDescription());
	}

	@Test
	public void testRoboPotLickerGetsHeathy() {
		Assert.assertEquals(0, testPet.getHealth());
	}

	@Test
	public void testRoboPotLickerGetsHappy() {
		Assert.assertEquals(0, testPet.getHappiness());
	}

	@Test
	public void testRoboPotLickerNeedsOiled() {
		Assert.assertEquals(0, testPet.getOil());
	}
	
	@Test
	public void testRoboPotLickerNeedsMaintained() {
		Assert.assertEquals(0, testPet.getMaintenance());
	}

	@Test
	public void testWhenICreateARoboPotLickerICanIncludeNameDescriptionHealthHappinessAndOil() {
		Assert.assertEquals("Schultz", testPet.getName());
		Assert.assertEquals("He's Dead Too!", testPet.getDescription());
		Assert.assertEquals(0, testPet.getHealth());
		Assert.assertEquals(0, testPet.getHappiness());
		Assert.assertEquals(0, testPet.getOil());

	}

	@Test
	public void testWhenICreateARoboPotLickerICanIncludeNameDescriptionHungerHappinessOilAndMaintenance() {
		Assert.assertEquals("Schultz", testPet.getName());
		Assert.assertEquals("He's Dead Too!", testPet.getDescription());
		Assert.assertEquals(0, testPet.getHealth());
		Assert.assertEquals(0, testPet.getHappiness());
		Assert.assertEquals(0, testPet.getOil());
		Assert.assertEquals(0, testPet.getMaintenance());
	}
		@Test
		public void testThatDogHasAKennel() {
			Assert.assertEquals(0, testPet.getKennel());
		}
	}

