package module9.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Misti Christianson - mchristianson CIS175 - Spring 2024 Mar 20, 2024
 */
@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;

	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}

	public String setComputerPlayerToRandom() {
		// randomly select number between 1-3
		// if 1 set computerPlayer to rock

		// if 2 set to paper

		// if 3 set to scissors

		// or assign inputs from index.html to numbers 1-3

		int r = (int) (Math.random() * 5);
		computerPlayer = new String[] { "rock", "paper", "scissors", "lizard", "spock" }[r];
		return computerPlayer;
	}

	public String determineWinner() {

		// if player1 == computer; tied
		// else if player1 = rock
		// cP=paper; winner=computer
		// cp=scissors; winner=player1
		// else if player1 = paper
		// cp=rock; winner=player1
		// cp=scissors; winner=computer
		// else if player1 = scissors
		// cp=rock; winner=computer
		// cp=paper; winner=player1

		if (player1 == computerPlayer) {
			winner = "TIED!";
		} else if (player1 == "rock") {
			if (computerPlayer == "paper") {
				winner = "PAPER covers ROCK. YOU LOSE!";
			} else if (computerPlayer == "scissors") {
				winner = "ROCK crushes SCISSORS. YOU WIN!";
			} else if (computerPlayer == "lizard") {
				winner = "ROCK crushes LIZARD. YOU WIN!";
			} else if (computerPlayer == "spock") {
				winner = "SPOCK vaporizes ROCK . YOU LOSE!";
			}
		} else if (player1 == "paper") {
			if (computerPlayer == "rock") {
				winner = "PAPER covers ROCK. YOU WIN!";
			} else if (computerPlayer == "scissors") {
				winner = "SCISSORS cuts PAPER. YOU LOSE!";
			} else if (computerPlayer == "lizard") {
				winner = "LIZARD eats PAPER. YOU LOSE!";
			} else if (computerPlayer == "spock") {
				winner = "PAPER disproves SPOCK. YOU WIN!";
			}
		} else if (player1 == "scissors") {
			if (computerPlayer == "rock") {
				winner = "ROCK crushes SCISSORS. YOU LOSE!";
			} else if (computerPlayer == "paper") {
				winner = "SCISSORS cuts PAPER. YOU WIN!";
			} else if (computerPlayer == "lizard") {
				winner = "SCISSORS decapitates LIZARD. YOU WIN!";
			} else if (computerPlayer == "spock") {
				winner = "SPOCK smashes SCISSORS. YOU LOSE!";
			}
		} else if (player1 == "lizard") {
			if (computerPlayer == "rock") {
				winner = "ROCK crushes LIZARD. YOU LOSE!";
			} else if (computerPlayer == "paper") {
				winner = "LIZARD eats PAPER. YOU WIN!";
			} else if (computerPlayer == "scissors") {
				winner = "SCISSORS decapitate LIZARD. YOU LOSE!";
			} else if (computerPlayer == "spock") {
				winner = "LIZARD poisons SPOCK. YOU WIN!";
			}
		} else if (player1 == "spock") {
			if (computerPlayer == "rock") {
				winner = "SPOCK vaporizes ROCK. YOU WIN!";
			} else if (computerPlayer == "paper") {
				winner = "PAPER disproves SPOCK. YOU LOSE!";
			} else if (computerPlayer == "scissors") {
				winner = "SPOCK smashes SCISSORS. YOU WIN!";
			} else if (computerPlayer == "lizard") {
				winner = "LIZARD poisons SPOCK. YOU LOSE!";
			}
		}
		return winner;
	}
}
