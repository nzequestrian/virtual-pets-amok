import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetShelterTest {

	OrganicKittyKat tui = new OrganicKittyKat("Tui", "Is a cute little calico", 1, 1, 1, 1, 1, 1, 1);
	OrganicKittyKat ditch = new OrganicKittyKat("Ditch", "Is as cunning as a shithouse rat", 2, 2, 2, 2, 2, 2, 2);
	OrganicPotLicker konig = new OrganicPotLicker("Konig", "", 3, 3, 3, 3, 3, 3);
	OrganicPotLicker ripley = new OrganicPotLicker("Ripley", "", 4, 4, 4, 4, 4, 4);
	RoboKittyKat jazzy = new RoboKittyKat("Jazzy", "", 1, 1, 1, 1);
	RoboKittyKat bluesy = new RoboKittyKat("Bluesy", "A black and tan Main coon who is a mushy cat who loves snuggles", 2, 2, 2, 2);
	RoboPotLicker bjorn = new RoboPotLicker("Bjorn", "", 3, 3, 3, 3, 3);
	RoboPotLicker pi = new RoboPotLicker("Pi", "", 4, 4, 4, 4, 4);
	
	

	@Test
	public void testVirtualPetShelterExistsButIsNull() {
		VirtualPetShelter testPetShelter = null;
		Assert.assertNull(testPetShelter);
	}

	@Test
	public void testVirtualPetShelterExistsButIsNotNull() {
		VirtualPetShelter testPetShelter = new VirtualPetShelter();
		Assert.assertNotNull(testPetShelter);
	}
	@Test
	public void testVirtualPetShelterHasACollectionOfVirtualPets() {  
		VirtualPetShelter testPetShelter = new VirtualPetShelter();  

		Map<String, VirtualPet> virtualPets = new HashMap<String, VirtualPet>(); 
		
		String pet1 = "Tui"; 
		virtualPets.put(pet1, tui);

		String pet2 = "Ditch";
		virtualPets.put(pet2, ditch);

		String pet3 = "Konig";
		virtualPets.put(pet3, konig);

		String pet4 = "Ripley";
		virtualPets.put(pet4, ripley);

		String pet5 = "Jazzy";
		virtualPets.put(pet5, jazzy);
		
		String pet6 = "Bluesy";
		virtualPets.put(pet6, bluesy);
		
		String pet7 = "Bjorn";
		virtualPets.put(pet7, bjorn);
		
		String pet8 = "Pi";
		virtualPets.put(pet8, pi);
		
		//TODO more TDD
		
	}
	
	
}
	
	
	
