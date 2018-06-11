import org.junit.Assert;
import org.junit.Test;

public class OrganicPotLickerTest {

	OrganicPotLicker testPet = new OrganicPotLicker("Whiskey", "My Dead Dog!", 0, 0, 0, 0, 0, 0);

	@Test
	public void testOrganicPotLickerExistsButIsNull() {
		OrganicPotLicker testPet = null;
		Assert.assertNull(testPet);
	}
	
	@Test
	public void testOrganicPotLickerExistsButIsNotNull() {
		Assert.assertNotNull(testPet);
	}

	@Test
	public void testVirtualPetHasName() {
		Assert.assertEquals("Whiskey", testPet.getName());

	}

	@Test
	public void testVirtualPetHasDescription() {
		Assert.assertEquals("My Dead Dog!", testPet.getDescription());
	}

	@Test
	public void testWhenICreateAVirtualPetICanIncludeNameAndDescription() {
		Assert.assertEquals("Whiskey", testPet.getName());
		Assert.assertEquals("My Dead Dog!", testPet.getDescription());
	}
	
	@Test
	public void testOrganicPotLickerIsHealthy() {
		Assert.assertEquals(0, testPet.getHealth());
	}

	@Test
	public void testOrganicPotLickerCanBeHappy() {
		Assert.assertEquals(0, testPet.getHappiness());

	}

	@Test
	public void testOrganicPotLickerGetsHungry() {
		Assert.assertEquals(0, testPet.getHunger());
	}

	@Test
	public void testOrganicPotLickerGetsThirsty() {
		Assert.assertEquals(0, testPet.getThirst());
	}

	@Test
	public void testOrganicPotLickerCanPeeAndPoop() {
		Assert.assertEquals(0, testPet.getPeePeePooPoo());
	}

	@Test
	public void testWhenICreateAOrganicPotLickerICanIncludeNameDescriptionHealthHappinessAndThirst() {
		Assert.assertEquals("Whiskey", testPet.getName());
		Assert.assertEquals("My Dead Dog!", testPet.getDescription());
		Assert.assertEquals(0, testPet.getHealth());
		Assert.assertEquals(0, testPet.getHappiness());
		Assert.assertEquals(0, testPet.getThirst());

	}

	@Test
	public void testWhenICreateAOrganicPotLickerICanIncludeNameDescriptionHungerHappinessThirstAndHunger() {
		Assert.assertEquals("Whiskey", testPet.getName());
		Assert.assertEquals("My Dead Dog!", testPet.getDescription());
		Assert.assertEquals(0, testPet.getHealth());
		Assert.assertEquals(0, testPet.getHappiness());
		Assert.assertEquals(0, testPet.getThirst());
		Assert.assertEquals(0, testPet.getHunger());
	}

	@Test
	public void testWhenICreateAOrganicPotLickerICanIncludeNameDescriptionHungerHappinessThirstHungerAndPeePeePooPoo() {
		Assert.assertEquals("Whiskey", testPet.getName());
		Assert.assertEquals("My Dead Dog!", testPet.getDescription());
		Assert.assertEquals(0, testPet.getHealth());
		Assert.assertEquals(0, testPet.getHappiness());
		Assert.assertEquals(0, testPet.getThirst());
		Assert.assertEquals(0, testPet.getHunger());
		Assert.assertEquals(0, testPet.getPeePeePooPoo());
	}

	@Test
	public void testThatWeCanCleanTheKennels() {
		Assert.assertEquals(0, testPet.getKennel());
	}
	
	
}
