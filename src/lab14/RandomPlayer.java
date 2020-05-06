package lab14;

import java.util.Random; 

public class RandomPlayer extends Player {
	Random rand = new Random();
	public RandomPlayer(String name) {
		super(name);
	}
    // to the player Ghost I added this random integer generator and boolean associated them with the Roshambo
	public Roshambo generateRoshambo() {		
		int rand1 = rand.nextInt(3)+1;
		if(rand1 == 1){
		return Roshambo.PAPER;
	}   else if (rand1 == 2) {
		return Roshambo.ROCK;
	}   else{
		return Roshambo.SCISSORS;
		}
	}
	}

