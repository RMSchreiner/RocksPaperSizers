package lab14;

public class PaperPlayer extends Player {

		public PaperPlayer(String name) {
			super(name);
		}

		
		@Override
		public Roshambo generateRoshambo() {
			return Roshambo.PAPER;
		} //Rock player always returns ROCK like Volunteer always returns 0 
		  // random player will be similar to this one but will have different code
		
	}

