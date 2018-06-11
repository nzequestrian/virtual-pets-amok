import org.junit.Assert;
import org.junit.Test;

public class RoboKittyKatTest {
	RoboKittyKat testPet = new RoboKittyKat("Moo Moo", "A Black & White Fatty!", 0, 0, 0, 0);

	@Test
	public void testRoboKittyKatExistsButIsNull() {
		RoboKittyKat testPet = null;
		Assert.assertNull(testPet);
	}

	@Test
	public void testOrganicKittyKatExistsButIsNotNull() {
		Assert.assertNotNull(testPet);
	}

	@Test
	public void testRoboKittyKatHasName() {
		Assert.assertEquals("Moo Moo", testPet.getName());

	}

	@Test
	public void testRoboKittyKatHasDescription() {
		Assert.assertEquals("A Black & White Fatty!", testPet.getDescription());
	}

	@Test
	public void testWhenICreateARoboKittyKatICanIncludeNameAndDescription() {
		Assert.assertEquals("A Black & White Fatty!", testPet.getDescription());
	}

	@Test
	public void testRoboKittyKatGetsHeathy() {
		Assert.assertEquals(0, testPet.getHealth());
	}

	@Test
	public void testRoboKittyKatGetsHappy() {
		Assert.assertEquals(0, testPet.getHappiness());
	}

	@Test
	public void testRoboKittyKatNeedsOiled() {
		Assert.assertEquals(0, testPet.getOil());
	}

	@Test
	public void testRoboKittyKatNeedsMaintained() {
		Assert.assertEquals(0, testPet.getMaintenance());
	}

	@Test
	public void testWhenICreateARoboKittyKatICanIncludeNameDescriptionHealthHappinessAndOil() {
		Assert.assertEquals("Moo Moo", testPet.getName());
		Assert.assertEquals("A Black & White Fatty!", testPet.getDescription());
		Assert.assertEquals(0, testPet.getHealth());
		Assert.assertEquals(0, testPet.getHappiness());
		Assert.assertEquals(0, testPet.getOil());

	}

	@Test
	public void testWhenICreateARoboKittyKatICanIncludeNameDescriptionHungerHappinessOilAndMaintenance() {
		Assert.assertEquals("Moo Moo", testPet.getName());
		Assert.assertEquals("A Black & White Fatty!", testPet.getDescription());
		Assert.assertEquals(0, testPet.getHealth());
		Assert.assertEquals(0, testPet.getHappiness());
		Assert.assertEquals(0, testPet.getOil());
		Assert.assertEquals(0, testPet.getMaintenance());

	}

}
