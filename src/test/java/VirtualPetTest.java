import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	VirtualPet grazer = new OrganicKittyKat ("Grazer", "A New Zealand feline", 0, 0);
	VirtualPet rusty = new OrganicKittyKat ("Rusty", "A Delawarian", 1, 1);
	

	@Test
	public void testVirtualPetExistsButIsNull() {
		VirtualPet testPet = null;
		Assert.assertNull(testPet);
	}

	@Test
	public void testVirtualPetExistsButIsNotNull() {
		Assert.assertNotNull(grazer);
	}

	@Test
	public void testVirtualPetHasName() {
		Assert.assertEquals("Grazer", grazer.getName());
	}

	@Test
	public void testVirtualPetHasDescription() {
		Assert.assertEquals("A New Zealand feline", grazer.getDescription());
	}

	@Test
	public void testWhenICreateAVirtualPetICanIncludeNameAndDescription() {
		Assert.assertEquals("Grazer", grazer.getName());
		Assert.assertEquals("A New Zealand feline", grazer.getDescription());
	}

	@Test
	public void testWhenICreateAVirtualPetICanIncludeNameDescriptionHealthAndHappiness() {
		Assert.assertEquals("Rusty", rusty.getName());
		Assert.assertEquals("A Delawarian", rusty.getDescription());
		Assert.assertEquals(1, rusty.getHealth());
		Assert.assertEquals(1, rusty.getHappiness());
	}

}