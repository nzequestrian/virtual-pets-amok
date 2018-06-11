import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	public Map<String, VirtualPet> virtualPets = new HashMap<String, VirtualPet>();
	public Map<String, OrganicPet> organicPets = new HashMap<String, OrganicPet>();
	public Map<String, RoboPet> roboPets = new HashMap<String, RoboPet>();

	public VirtualPetShelter() {

	}

	public Collection<VirtualPet> getVirtualPets() {
		return virtualPets.values();
	}

	public Collection<OrganicPet> getOrganicPets() {
		return organicPets.values();
	}

	public Collection<RoboPet> getRoboPets() {
		return roboPets.values();
	}

	public void addPet(String name, OrganicPet organicPet) {
		organicPets.put(name, organicPet);
		virtualPets.put(name, organicPet);
	}

	public void addPet(String name, RoboPet roboPet) {
		roboPets.put(name, roboPet);
		virtualPets.put(name, roboPet);
	}

	public void adoptPet(String name) {
		ArrayList<String> petName = new ArrayList<String>();
		for (VirtualPet pet : getVirtualPets()) {
			petName.add(pet.getName());
			pet.tick();
		}
		if (petName.contains(name)) {
			virtualPets.remove(name);
			organicPets.remove(name);
			roboPets.remove(name);
			System.out.println("\nYay, you adopted " + name);
		} else {
			System.out.println("\nName does not exist!");
		}
	}

	public void feedAllPets() {
		for (OrganicPet pet : organicPets.values()) {
			pet.hunger -= 30;
			pet.happiness += 10;
			pet.health += 15;
			pet.tick();
		}
		System.out.println("\nThanks for feeding all the pets!");
	}

	public void waterAllPets() {
		for (OrganicPet pet : organicPets.values()) {
			pet.thirst -= 20;
			pet.happiness += 10;
			pet.health += 15;
			pet.tick();
		}
		System.out.println("\nThanks for watering the pets!");
	}

	public void oilRobots() {
		for (RoboPet pet : roboPets.values()) {
			pet.oil += 20;
			pet.happiness += 10;
			pet.health += 15;
			pet.tick();
		}
		System.out.println("\nThanks for oiling the RoboPets!");
	}

	public void maintainRobots() {
		for (RoboPet pet : roboPets.values()) {
			pet.maintenance += 25;
			pet.happiness += 10;
			pet.health += 15;
			pet.tick();
		}
		System.out.println("\nThanks for maintaining the RoboPets!");
	}

	public void walkAllDogs() {
		for (OrganicPet pet : organicPets.values()) {
			if (pet instanceof OrganicPotLicker) {
				pet.walk();
				pet.tick();
			}
		}
		for (RoboPet pet : roboPets.values()) {
			if (pet instanceof RoboPotLicker) {
				pet.walk();
				pet.tick();
			}
		}
		System.out.println("\nThanks for walking the Dogs!");
	}

	public void cleanDogKennels() {
		for (OrganicPet pet : organicPets.values()) {
			if (pet instanceof OrganicPotLicker) {
				pet.peePeePooPoo = 0;
				pet.happiness += 10;
				pet.health += 15;
				pet.tick();
			}
		}
		for (RoboPet pet : roboPets.values()) {
			if (pet instanceof RoboPotLicker) {
				pet.happiness += 10;
				pet.health += 15;
				pet.tick();
			}
		}
		System.out.println("\nThanks for cleaning the kennels!");
	}

	public void cleanLitterBox() {
		for (OrganicPet pet : organicPets.values()) {
			if (pet instanceof OrganicKittyKat) {
				pet.peePeePooPoo = 0;
				pet.happiness += 10;
				pet.health += 15;
				pet.tick();
			}
		}
		System.out.println("\nThanks for cleaning the LitterBox!");
	}

	public void playWithPet(String name) {
		ArrayList<String> petName = new ArrayList<String>();
		for (VirtualPet pet : getVirtualPets()) {
			petName.add(pet.getName());
			pet.tick();
		}
		if (petName.contains(name)) {
			virtualPets.get(name).happiness += 25;
			System.out.println("\nYay, you played with " + name);
		} else {
			System.out.println("\nName does not exist! Select a name from the list!");
		}
	}
}
