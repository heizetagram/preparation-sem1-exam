package interfaces.rockpaperscissors;

import java.util.Scanner;

public class Human implements Player{

    // Prompt user for int-input
    private int promptUserInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // Convert user int-input to a String choice
    private String convertIntToChoice(int number) {
        switch (number) {
            case 1 -> {
                return "Rock";
            }
            case 2 -> {
                return "Paper";
            }
            case 3 -> {
                return "Scissors";
            }
            default -> {
                return null;
            }
        }
    }

    @Override
    public String takeTurn() {
        return convertIntToChoice(promptUserInt());
    }
}