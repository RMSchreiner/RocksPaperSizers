package lab14;



public abstract class Player {
	
	private String name;
	
	public Player(String name) {
		super();
		this.name = name; }
	
	public String getName() {
		return name;
	}
	
	public abstract Roshambo generateRoshambo();

}
