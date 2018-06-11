
public class RoboPotLicker extends RoboPet implements Walkies {

	private int kennel;

	// RoboPotLicker needs to be walked
	// He does not make waste so has not kennel
	// He does get rusty after walking so will need to be oiled
	// His happiness increases when he is walked or oiled
	// His happiness decreases when he is not maintained (batteryLevels & upgrades)

	public RoboPotLicker(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);
	}

	public RoboPotLicker(String name, String description, int health, int happiness, int oil, int maintenance, int kennel) {
		super(name, description, health, happiness, oil, maintenance);
		this.kennel = kennel;
	}

	public int getKennel() {
		return kennel;
	}

	@Override
	public void walk() {
		this.oil -= 2;		
	}

}
