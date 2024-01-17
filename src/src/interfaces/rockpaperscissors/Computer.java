package interfaces.rockpaperscissors;

import java.util.Random;

public class Computer implements Player {

    // Random number
    private int randomNumber() {
        Random random = new Random();
        return random.nextInt(3);
    }

    // Random choice
    private String randomChoice(int randomNumber) {
        switch (randomNumber) {
            case 0 -> {
                return "Rock";
            }
            case 1 -> {
                return "Paper";
            }
            case 2 -> {
                return "Scissors";
            }
            default -> {
                return null;
            }
        }
    }

    @Override
    public String takeTurn() {
        return randomChoice(randomNumber());
    }
}
