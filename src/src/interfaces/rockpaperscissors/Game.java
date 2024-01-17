package interfaces.rockpaperscissors;

import ui.ConsoleColors;

public class Game {
    private Human p1;
    private Computer p2;
    private int p1Score;
    private int p2Score;

    // Initialize variables
    private void initVars() {
        p1 = new Human();
        p2 = new Computer();
        p1Score = 0;
        p2Score = 0;
    }

    // Run the game
    public void play() {
        initVars();
        boolean isRunning = true;
        System.out.println("Rock, paper, scissors!");
        System.out.println("Best of 3");

        while (isRunning) {
            displayTurn();
            choiceMenu();
            String userChoice = p1.takeTurn();

            String cpChoice = p2.takeTurn();
            printCpChoice(cpChoice);

            checkWinner(userChoice, cpChoice);

            displayScore();

            // Check result
            isRunning = checkScore();
        }
        displayResult();
    }

    // Display the game result
    private void displayResult() {
        if (p1Score == 2) {
            System.out.print(ConsoleColors.GREEN_BRIGHT + "Player 1 wins!" + ConsoleColors.RESET);
        } else {
            System.out.print(ConsoleColors.RED_BOLD + "Player 2 wins!" + ConsoleColors.RESET);
        }
    }

    // Display the current score
    private void displayScore() {
        System.out.println("Score is " + p1Score + "-" + p2Score + "\n");
    }

    // Print Computer's choice
    private void printCpChoice(String cpChoice) {
        System.out.print("Computer chose ");
        switch (cpChoice) {
            case "Rock" -> printRock();
            case "Paper" -> printPaper();
            case "Scissors" -> printScissors();
        }
        System.out.print("!\n");
    }

    // Display player's turn
    private void displayTurn() {
        System.out.println("Your turn! What's your choice?");
    }

    // Display player's choice menu
    private void choiceMenu() {
        System.out.print("(1) "); printRock();
        System.out.print("\n(2) "); printPaper();
        System.out.print("\n(3) "); printScissors();
        System.out.println();
    }

    // Check overall score
    private boolean checkScore() {
        return p1Score != 2 && p2Score != 2;
    }

    // Give player or computer point
    private void givePoint(int userPoint) {
        if (userPoint > 0) {
            p1Score++;
        } else if (userPoint < 0) {
            p2Score++;
        }
    }

    // Check who won current round
    private void checkWinner(String userChoice, String cpChoice) {
        int userpoint = switch (userChoice) {
            case "Rock" -> rockChoice(cpChoice);
            case "Paper" -> paperChoice(cpChoice);
            case "Scissors" -> scissorsChoice(cpChoice);
            default -> throw new IllegalStateException("Unexpected value: " + cpChoice);
        };

        givePoint(userpoint);
    }

    // Check score if player chooses rock
    private int rockChoice(String cpChoice) {
        return switch (cpChoice) {
            case "Rock" -> 0;
            case "Paper" -> -1;
            case "Scissors" -> +1;
            default -> throw new IllegalStateException("Unexpected value: " + cpChoice);
        };
    }

    // Check score if player chooses paper
    private int paperChoice(String cpChoice) {
        return switch (cpChoice) {
            case "Rock" -> 1;
            case "Paper" -> 0;
            case "Scissors" -> -1;
            default -> throw new IllegalStateException("Unexpected value: " + cpChoice);
        };
    }

    // Check score if player chooses scissors
    private int scissorsChoice(String cpChoice) {
        return switch (cpChoice) {
            case "Rock" -> -1;
            case "Paper" -> 1;
            case "Scissors" -> 0;
            default -> throw new IllegalStateException("Unexpected value: " + cpChoice);
        };
    }

    // Print rock
    private void printRock() {
        System.out.print(ConsoleColors.BLUE + "Rock" + ConsoleColors.RESET);
    }

    // Print paper
    private void printPaper() {
        System.out.print(ConsoleColors.CYAN_BRIGHT + "Paper" + ConsoleColors.RESET);
    }

    // Print scissors
    private void printScissors() {
        System.out.print(ConsoleColors.YELLOW + "Scissors" + ConsoleColors.RESET);
    }
}