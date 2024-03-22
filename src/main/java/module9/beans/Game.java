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
		setComputerPlayerToRandom();
		winner = determineWinner(player1, computerPlayer);
	}

	public String setComputerPlayerToRandom() {
		// randomly select number between 1-3
		// if 1 set computerPlayer to ROCK

		// if 2 set to PAPER

		// if 3 set to SCISSORS

		// or assign inputs from index.html to numbers 1-3

		int r = (int) (Math.random() * 5);
		computerPlayer = new String[] { "ROCK", "PAPER", "SCISSORS", "LIZARD", "SPOCK" }[r];
		return computerPlayer;
	}

	public String determineWinner(String player1, String computerPlayer) {

		// if player1 == computer; tied
		// else if player1 = ROCK
		// cP=PAPER; winner=computer
		// cp=SCISSORS; winner=player1
		// else if player1 = PAPER
		// cp=ROCK; winner=player1
		// cp=SCISSORS; winner=computer
		// else if player1 = SCISSORS
		// cp=ROCK; winner=computer
		// cp=PAPER; winner=player1

		if (player1 == computerPlayer) {
			winner = "TIED!";
		} else if (player1.equals("ROCK")) {
			if (computerPlayer.equals("PAPER")) {
				winner = "PAPER covers ROCK. YOU LOSE!";
			} else if (computerPlayer.equals("SCISSORS")) {
				winner = "ROCK crushes SCISSORS. YOU WIN!";
			} else if (computerPlayer.equals("LIZARD")) {
				winner = "ROCK crushes LIZARD. YOU WIN!";
			} else if (computerPlayer.equals("SPOCK")) {
				winner = "SPOCK vaporizes ROCK . YOU LOSE!";
			}
		} else if (player1.equals("PAPER")) {
			if (computerPlayer.equals("ROCK")) {
				winner = "PAPER covers ROCK. YOU WIN!";
			} else if (computerPlayer.equals("SCISSORS")) {
				winner = "SCISSORS cuts PAPER. YOU LOSE!";
			} else if (computerPlayer.equals("LIZARD")) {
				winner = "LIZARD eats PAPER. YOU LOSE!";
			} else if (computerPlayer.equals("SPOCK")) {
				winner = "PAPER disproves SPOCK. YOU WIN!";
			}
		} else if (player1.equals("SCISSORS")) {
			if (computerPlayer.equals("ROCK")) {
				winner = "ROCK crushes SCISSORS. YOU LOSE!";
			} else if (computerPlayer.equals("PAPER")) {
				winner = "SCISSORS cuts PAPER. YOU WIN!";
			} else if (computerPlayer.equals("LIZARD")) {
				winner = "SCISSORS decapitates LIZARD. YOU WIN!";
			} else if (computerPlayer.equals("SPOCK")) {
				winner = "SPOCK smashes SCISSORS. YOU LOSE!";
			}
		} else if (player1.equals("LIZARD")) {
			if (computerPlayer.equals("ROCK")) {
				winner = "ROCK crushes LIZARD. YOU LOSE!";
			} else if (computerPlayer.equals("PAPER")) {
				winner = "LIZARD eats PAPER. YOU WIN!";
			} else if (computerPlayer.equals("SCISSORS")) {
				winner = "SCISSORS decapitate LIZARD. YOU LOSE!";
			} else if (computerPlayer.equals("SPOCK")) {
				winner = "LIZARD poisons SPOCK. YOU WIN!";
			}
		} else if (player1.equals("SPOCK")) {
			if (computerPlayer.equals("ROCK")) {
				winner = "SPOCK vaporizes ROCK. YOU WIN!";
			} else if (computerPlayer.equals("PAPER")) {
				winner = "PAPER disproves SPOCK. YOU LOSE!";
			} else if (computerPlayer.equals("SCISSORS")) {
				winner = "SPOCK smashes SCISSORS. YOU WIN!";
			} else if (computerPlayer.equals("LIZARD")) {
				winner = "LIZARD poisons SPOCK. YOU LOSE!";
			}
		}
		return winner;
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getComputerPlayer() {
		return computerPlayer;
	}

	public void setComputerPlayer(String computerPlayer) {
		this.computerPlayer = setComputerPlayerToRandom();
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
}
