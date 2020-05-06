package lab14;

public class RockPlayer extends Player  {

	public RockPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	} //Rock player always returns ROCK like Volunteer always returns 0 
	  // random player will be similar to this one but will have different code
	
	

}
