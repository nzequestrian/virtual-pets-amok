
public abstract class VirtualPet implements Walkies {

	private String name;
	private String description;
	protected int health;
	protected int happiness;

	public VirtualPet(String name) {
		this.name = name;
	}

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;

	}

	public VirtualPet(String name, String description, int health, int happiness) {
		this.name = name;
		this.description = description;
		this.health = health;
		this.happiness = happiness;

	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	public void tick() {
		this.health -= 5;
		this.happiness -= 5;
	}

	public void walk() {
		this.happiness += 10;
		this.health += 10;
	}

}
