
public class RoboPet extends VirtualPet {

	protected int oil;
	protected int maintenance;

	public RoboPet(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);
	}

	public RoboPet(String name, String description, int health, int happiness, int oil, int maintenance) {
		super(name, description, health, happiness);
		this.oil = oil;
		this.maintenance = maintenance;
	}

	public int getOil() {
		return oil;
	}

	public int getMaintenance() {
		return maintenance;
	}

	@Override
	public void walk() {
		this.oil -= 20;
		this.maintenance -= 15;
		this.happiness += 10;
		this.health -=5;
	}
	
	@Override
	public void tick() {
		super.tick();
		this.oil -=10;
		this.maintenance -= 15;
		this.happiness -= 10;
		this.health -=5;		
	}
}
