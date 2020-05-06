package lab14;


import java.util.Scanner;

public class RockPaperApp {
	
	public static void main(String[] args) {
		
	Scanner scnr= new Scanner(System.in);
	
	Player player1 = createHumanPlayer();
	
	int [] odd = new int [3];
	//needed to keep this array out of the boolean loop so that it would not reset to 0
	// also kept out the naming human player to only do that once
	boolean shouldContinue = true;//boolean original true
	while(shouldContinue) {	
		
	
	Player player2 = selectOppononent();	
	
	Roshambo hand1 = player1.generateRoshambo();
	Roshambo hand2 = player2. generateRoshambo();
	
	//compare hands to find winner
	
	System.out.println(player1.getName() + " played "+ hand1);
	System.out.println(player2.getName() + " played "+ hand2);
	
	System.out.println("");
	System.out.println(whoWon(hand1, hand2));
	System.out.println("");
	System.out.println("| Draws |Player1|Player2|");
	System.out.println("|       | Wins  | Wins  |");
	
	
	//This mess iterates through the wins counting array and adds the count to a new array for total wins
	//finally printing out the array count
	String winner = whoWon(hand1, hand2);
	 for (int i = 0; i < wins(winner).length; i++) {
	        if (wins(winner)[i] == 1) { 
	        	odd[i] +=1;}
	 }
     for (int i = 0; i < odd.length; i++) {
    	 System.out.print("|      " + odd[i]);
     }
  
     
	System.out.println("");
	System.out.println("-----------------");
	System.out.println("Would you like to play again? y/n");
	String response = scnr.next();
	
	
	//bottom of the loop asking if they would like to continue
	shouldContinue = response.equals("y");
	}
	
	System.out.println("Thanks for playing.");
	scnr.close();
	}
    
	
	//This method enables us to create a human player from the parent class HumanPlayer
	private static HumanPlayer createHumanPlayer() {
		//pick name
		System.out.println("What's your name?");
		String name = scnr.nextLine();
		//create player
		return new HumanPlayer(name, scnr);
	}
	
	
	
	static Scanner scnr= new Scanner(System.in);
	
	//this is a selector that select an opponent and will redirect someone if they select an invalid choice
    private static Player selectOppononent() {
    	//Boolean while loop included to continue to prompt user until they entered a valid name
    	boolean selectPlayer = true;
    	while(selectPlayer) {	
    	System.out.println("Would you like to face Albert, Bertha, or Ghost?");
    	String lower = scnr.nextLine();
    	String input = lower.toUpperCase();
    	//todo validation
    	if(input.startsWith("A")) {
    	return new RockPlayer("Albert");
    	} 
    	else if( input.startsWith("B")){
    	return new PaperPlayer("Bertha");
    	}
    	else if (input.startsWith("G")) {
    	return new RandomPlayer("Ghost");
    	}else {System.out.println("Pick a valid player.");
    		    selectPlayer = (true);
    		    }
    	}
		return null;	  
    }
	
	//This puddle of mud takes the strings of who won returning a ticked array
	 public static int [] wins(String winner) {
		int [] even = new int [3];
		 if (winner == "Draw." ) {even[0] +=1;
		} else if (winner == "Player one wins.") {
			even[1] +=1;
		}else {even[2] +=1; }
		 return even;
	}
	 
	 
	
	//This compares the hands and returns a string indicating who won a match
	private static String whoWon(Roshambo hand1, Roshambo hand2) {
		Roshambo Rock = Roshambo.ROCK; 
		Roshambo Scissors = Roshambo.SCISSORS; 
		Roshambo Paper = Roshambo.PAPER; 
		String draw = "Draw.";
		String play1 = "Player one wins.";
		String play2 = "Player two wins.";
		String tryAgain = "Try Again.";
		if(hand1 == hand2) {
			return draw;
		}else if (hand1 == Rock && hand2 == Scissors) {
			return play1;
		}else if (hand1 == Paper && hand2 == Rock) {
		    return play1;
		}else if (hand1 == Rock && hand2 == Paper){
			return play2;
		}else if (hand1 == Scissors && hand2 == Rock){
		    return play2;
		}else if (hand1 == Scissors && hand2 == Paper){
		    return play1;
		}else {return tryAgain;}
	
	}	
}
