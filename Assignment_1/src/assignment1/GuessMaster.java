package assignment1;

import java.util.Scanner;
import java.util.Random;

public class GuessMaster {
	private int numOfEntities;
	private Entity[] entities;

	public GuessMaster() {
		numOfEntities = 0;
		entities = new Entity[20];
	}

	public void addEntity(Entity person) {
		entities[numOfEntities++] = new Entity(person);
	}

	public void playGame(Entity person) {
		// Complete Game
		Scanner scanner = new Scanner(System.in);
		String response;
		Date date;
		// Starts the game
		System.out.println("Guess " + person.getName() + "'s information");
		System.out.println("Put " + person.getName() + "'s birthdate as (mm/dd/yyyy) format");
		System.out.println("Type quit to end");
		while (true) {

			// Lets the user keep guessing until a correct response is given
			response = scanner.nextLine();
			response = response.replace("\n", "").replace("\r", "").trim();
			// Looks at whether the response is quit
			if (response.equalsIgnoreCase("quit")) {
				System.out.println("Ending Game");
				System.exit(0);
			}
			// Checks for valid input
			if (Date.validDateAndFormat(response)) {
				date = new Date(response);
				// Checks whether the date is before, after, or equal
				if (person.getBorn().precedes(date)) {
					System.out.println("That above date is too late try a earlier date");
				} else if (date.precedes(person.getBorn())) {
					System.out.println("That above date is too early try a later date");
				} else {
					System.out.println("You got it, You guessed "+person.getName()+"'s birthday. good job!!");
					break;
				}
			} else {
				System.out.println("Incorrect Date Response");
			}

		}
	}

	public void playGame(int personID) {
		// This plays the game with an entity choosen from the array
		playGame(entities[personID]);
	}

	public void playGame() {
		// This plays the game with random entities
		while (true) {
			playGame(genRandomEntityId());
		}
	}

	public int genRandomEntityId() {
		// This generates a randomID for the user to play with
		Random randomNum = new Random();
		return randomNum.nextInt(numOfEntities);
	}

	public static void main(String[] args) {
		// Making Three new entities
		Entity trudeau = new Entity("Justin Trudeau", new Date("December", 25, 1971));
		Entity dion = new Entity("Celine Dion", new Date("March", 30, 1968));
		Entity usa = new Entity("United States", new Date("July", 4, 1776));
		// Making a new game
		GuessMaster gm = new GuessMaster();
		gm.addEntity(trudeau);
		gm.addEntity(dion);
		gm.addEntity(usa);
		// Starting the game
		gm.playGame();
	}
}
