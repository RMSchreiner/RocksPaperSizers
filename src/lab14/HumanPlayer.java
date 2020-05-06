package lab14;

import java.util.Scanner;

public class HumanPlayer extends Player {

	public Scanner scnr = new Scanner(System.in);

	public HumanPlayer(String name, Scanner scnr) {
		super(name);
		this.scnr =  scnr;

	}


	@Override
	public Roshambo generateRoshambo() {

		boolean selection = true;
    	while(selection) {
		
		
		System.out.println("Rock, Paper, or Scissors? (R/P/S): ");

		String upper = scnr.nextLine();
        String input = upper.toLowerCase();
		
		
		if (input.startsWith("r")){
			return Roshambo.ROCK;
		}   
		else if (input.startsWith("p")){
			return Roshambo.PAPER;
			//else if and validators
		}	
		else if  (input.startsWith("s") ){
			return Roshambo.SCISSORS;
		}   else {System.out.println("Pick a valid letter.");
		    selection = (true);
		    }
		}
		return null;
	}
}

