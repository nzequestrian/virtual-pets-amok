
public class OrganicPotLicker extends OrganicPet implements Walkies {

	private int kennel;

	public OrganicPotLicker(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);
	}

	public OrganicPotLicker(String name, String description, int health, int happiness, int hunger, int thirst,
			int peePeePooPoo, int kennel) {
		super(name, description, health, happiness, hunger, thirst, peePeePooPoo);
		this.kennel = kennel;
	}

	public int getKennel() {
		return kennel;
	}
	
	@Override
	public void tick() {
		super.tick();
		this.kennel +=10;		
	}
}