
public class OrganicKittyKat extends OrganicPet {

	// Clean the shelters only litter box
	// Health increases when you feed, water, play, or clean the litter box
	// Happiness increases when you play with your pet

	private int litterBox;

	public OrganicKittyKat(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);

	}

	public OrganicKittyKat(String name, String description, int health, int happiness, int boredom, int hunger,
			int thirst, int peePeePooPoo, int litterBox) {
		super(name, description, health, happiness, hunger, thirst, peePeePooPoo);
		this.litterBox = litterBox;
	}

	public int getlitterBox() {
		return litterBox;
	}

	@Override
	public void tick() {
		super.tick();
		this.litterBox += 5;
	}

}
