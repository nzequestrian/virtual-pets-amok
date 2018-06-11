import java.util.Scanner;

public class VirtualPetsAmokApp {
	static Scanner scanner = new Scanner(System.in);

	// RoboKitty - Can play with tin cans and his happiness with go up however his
	// oiling & maintenance will go down
	// RoboPL - Loves to walk on a leash his happiness with also increase but will
	// get Rusty and oil & maintenance will go down
	// Both happiness decreases when they is not maintained (batteryLevels &
	// upgrades)

	// OrganicKitty - Likes to play, happiness, hunger and thirst will go up but
	// litter box and boredom will decrease
	// OrganicPotLicker - When you walk a pot licker his happiness goes up and cage
	// mess goes down
	// his hunger and thirst will also increase when he is walked or played with
	// boredom will decrease as well

	public VirtualPetsAmokApp() {
	}

	static OrganicKittyKat tui = new OrganicKittyKat("Tui", "Is a cute little calico", 100, 100, 100, 100, 100, 100,
			100);
	static OrganicKittyKat ditch = new OrganicKittyKat("Ditch", "Is as cunning as a shithouse rat", 200, 200, 200, 200,
			200, 200, 200);

	static OrganicPotLicker konig = new OrganicPotLicker("Konig", "", 300, 300, 300, 300, 300, 300);
	static OrganicPotLicker ripley = new OrganicPotLicker("Ripley", "", 400, 400, 400, 400, 400, 400);

	static RoboKittyKat jazzy = new RoboKittyKat("Jazzy", "", 150, 150, 150, 150);
	static RoboKittyKat bluesy = new RoboKittyKat("Bluesy",
			"A black and tan Main coon who is a mushy cat who loves snuggles", 220, 220, 220, 220);

	static RoboPotLicker bjorn = new RoboPotLicker("Bjorn", "", 330, 330, 330, 330, 330);
	static RoboPotLicker pi = new RoboPotLicker("Pi", "", 440, 440, 440, 440, 440);

	public static void main(String[] args) {

		VirtualPetShelter testPetShelter = new VirtualPetShelter();
		testPetShelter.addPet("Tui", tui);
		testPetShelter.addPet("Ditch", ditch);
		testPetShelter.addPet("Bluesy", bluesy);
		testPetShelter.addPet("Jazzy", jazzy);
		testPetShelter.addPet("Konig", konig);
		testPetShelter.addPet("Ripley", ripley);
		testPetShelter.addPet("Bjorn", bjorn);
		testPetShelter.addPet("Pi", pi);

		System.out.println("Welcome to the Pet Shelter! The animals have gone Amok!");

		VirtualPetsAmokApp.petStatus(testPetShelter);
		String mainMenuSelection = mainMenu();
		while (!mainMenuSelection.equalsIgnoreCase("6")) { // This is my game loop
			VirtualPetsAmokApp.actOnUserSelection(mainMenuSelection, testPetShelter);
			mainMenuSelection = mainMenu();
		}
		System.out.println("Thanks for visiting our shelter!");
		scanner.close();
		System.exit(0);
	}

	private static void actOnUserSelection(String optionEntered, VirtualPetShelter testPetShelter) {
		if (optionEntered.equals("1")) {
			testPetShelter.feedAllPets();
			petStatus(testPetShelter);
		} else if (optionEntered.equals("2")) {
			testPetShelter.waterAllPets();
			petStatus(testPetShelter);
		} else if (optionEntered.equals("3")) {
			testPetShelter.oilRobots();
			petStatus(testPetShelter);
		} else if (optionEntered.equals("4")) {
			testPetShelter.maintainRobots();
			petStatus(testPetShelter);
		} else if (optionEntered.equals("5")) {
			System.out.println("Which pet would you like to play with?");
			testPetShelter.playWithPet(scanner.nextLine());
			petStatus(testPetShelter);
		} else if (optionEntered.equals("6")) {
			testPetShelter.walkAllDogs();
			petStatus(testPetShelter);
		} else if (optionEntered.equals("7")) {
			testPetShelter.cleanDogKennels();
			petStatus(testPetShelter);
		} else if (optionEntered.equals("8")) {
			testPetShelter.cleanLitterBox();
			petStatus(testPetShelter);
		} else if (optionEntered.equals("9")) {
			System.out.println("Which pet would you like to adopt today?");
			testPetShelter.adoptPet(scanner.nextLine());
			petStatus(testPetShelter);
		} else if (optionEntered.equals("10")) {
			System.out.println("What's the pets name?");
			String petName = scanner.nextLine();
			System.out.println("Can you describe the pet please?");
			String description = scanner.nextLine();
			System.out.println("Is it a robot or organic pet?");
			String animalType = scanner.nextLine();
			if (animalType.equalsIgnoreCase("Robot")) {
				RoboPet roboPet = new RoboPet(petName, description, 10, 10);
				testPetShelter.addPet(petName, roboPet);
				System.out.println("Thanks for giving us your RoboPet!");
			} else if (animalType.equalsIgnoreCase("Organic")) {
				OrganicPet organicPet = new OrganicPet(petName, description, 10, 10);
				testPetShelter.addPet(petName, organicPet);
				System.out.println("Thanks for giving us your OrganicPet!");
			} else {
				System.out.println("\nPlease try again!\n");
			}
			petStatus(testPetShelter);
		} else {
			System.out.println("\nPlease try again!\n");
		}
	}

	public static String mainMenu() {
		System.out.println("\nWhat would you like to do today?");
		System.out.println("1. Feed the organic pets!");
		System.out.println("2. Water organic pets!");
		System.out.println("3. Oil the robotic pets!");
		System.out.println("4. Maintain robotic pets!");
		System.out.println("5. Play with a pet");
		System.out.println("6. Walk a dog");
		System.out.println("7. Clean dog kennels");
		System.out.println("8. Clean litter box");
		System.out.println("9. Adopt a pet");
		System.out.println("10. Give up a pet");
		System.out.println("11. Quit!");
		return scanner.nextLine();
	}

	private static void petStatus(VirtualPetShelter shelter) {
		System.out.println("\nHere's the latest info on our pets wellness . . . . .");
		System.out.println("-----------------------------------------------");
		System.out.println("Name \t|Hunger |Thirst |Happiness\t|Description ");
		System.out.println("-----------------------------------------------");
		for (OrganicPet pet : shelter.getOrganicPets()) {
			System.out.println(pet.getName() + "\t|" + pet.getHunger() + "\t|" + pet.getThirst() + "\t|" + pet.getHappiness() + "\t\t|"
					+ pet.getDescription());
		}

		System.out.println("-----------------------------------------------");
		System.out.println("Name \t|Maintenance |Oil |Happiness\t|Description ");
		System.out.println("-----------------------------------------------");
		for (RoboPet pet : shelter.getRoboPets()) {
			System.out.println(pet.getName() + "\t|" + pet.getMaintenance() + "\t\t|" + pet.getOil() + "\t|" + pet.getHappiness() + "\t\t|"
					+ pet.getDescription());
		}

	}
}
