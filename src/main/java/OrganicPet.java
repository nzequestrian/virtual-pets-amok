
public class OrganicPet extends VirtualPet {

	protected int hunger;
	protected int thirst;
	protected int peePeePooPoo;

	public OrganicPet(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);
	}

	public OrganicPet(String name, String description, int health, int happiness, int hunger, int thirst,
			int peePeePooPoo) {
		super(name, description, health, happiness);
		this.hunger = hunger;
		this.thirst = thirst;
		this.peePeePooPoo = peePeePooPoo;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getPeePeePooPoo() {
		return peePeePooPoo;
	}

	@Override
	public void walk() {
		super.walk();
		this.hunger += 10;
		this.thirst += 20;
		this.peePeePooPoo -= 25;
	}

	@Override
	public void tick() {
		super.tick();
		this.hunger += 5;
		this.thirst += 5;
		this.peePeePooPoo += 10;
	}

}
