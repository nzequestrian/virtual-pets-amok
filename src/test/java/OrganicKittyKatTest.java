

import org.junit.Assert;
import org.junit.Test;





public class OrganicKittyKatTest {

	OrganicKittyKat testPet = new OrganicKittyKat("Nigel", "A big Ole Ginger Cat!", 1, 1, 1, 1, 1, 1, 1);

	@Test
	public void testOrganicKittyKatExistsButIsNull() {
		OrganicKittyKat testPet = null;
		Assert.assertNull(testPet);
	}

	@Test
	public void testOrganicKittyKatExistsButIsNotNull() {
		Assert.assertNotNull(testPet);
	}

	@Test
	public void testVirtualPetHasName() {
		Assert.assertEquals("Tui", testPet.getName());

	}

	@Test
	public void testVirtualPetHasDescription() {
		Assert.assertEquals("Is a cute little calico", testPet.getDescription());
	}

	@Test
	public void testWhenICreateAVirtualPetICanIncludeNameAndDescription() {
		Assert.assertEquals("Tui", testPet.getName());;
		Assert.assertEquals("Is a cute little calico", testPet.getDescription());
	}

	@Test
	public void testOrganicKittyKatGetsHeathy() {
		Assert.assertEquals(1, testPet.getHealth());
			
	}

	@Test
	public void testOrganicKittyKatGetsHappy() {
		Assert.assertEquals(1, testPet.getHappiness());
	}

	@Test
	public void testOrganicKittyKatGetsHungry() {
		Assert.assertEquals(1, testPet.getHunger());
	}

	@Test
	public void testOrganicKittyKatGetsThirsty() {
		Assert.assertEquals(1, testPet.getThirst());
	}

	@Test
	public void testOrganicKittyKatCanPeeAndPoop() {
		Assert.assertEquals(1, testPet.getPeePeePooPoo());
	}

	@Test
	public void testWhenICreateAOrganicKittyKatICanIncludeNameDescriptionHealthHappinessAndThirst() {
		Assert.assertEquals("Tui", testPet.getName());;
		Assert.assertEquals("Is a cute little calico", testPet.getDescription());
		Assert.assertEquals(1, testPet.getHealth());
		Assert.assertEquals(1, testPet.getHappiness());
		Assert.assertEquals(1, testPet.getThirst());

	}

	@Test
	public void testWhenICreateAOrganicKittyKatICanIncludeNameDescriptionHungerHappinessThirstAndHunger() {
		Assert.assertEquals("Tui", testPet.getName());;
		Assert.assertEquals("Is a cute little calico", testPet.getDescription());
		Assert.assertEquals(1, testPet.getHealth());
		Assert.assertEquals(1, testPet.getHappiness());
		Assert.assertEquals(1, testPet.getThirst());
		Assert.assertEquals(1, testPet.getHunger());
	}

	@Test
	public void testWhenICreateAOrganicKittyKatICanIncludeNameDescriptionHungerHappinessThirstHungerAndPeePeePooPoo() {
		testPet.tick();
		Assert.assertEquals("Tui", testPet.getName());;
		Assert.assertEquals("Is a cute little calico", testPet.getDescription());
		Assert.assertEquals(1, testPet.getHealth());
		Assert.assertEquals(1, testPet.getHappiness());
		Assert.assertEquals(1, testPet.getThirst());
		Assert.assertEquals(1, testPet.getHunger());
		Assert.assertEquals(1, testPet.getPeePeePooPoo());

	}
	@Test
	public void testThatLitterBoxIsFullOfPeeAndPoop() {
		Assert.assertEquals(1, testPet.getlitterBox());
	}

}
