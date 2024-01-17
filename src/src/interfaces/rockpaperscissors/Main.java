package interfaces.rockpaperscissors;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Game game = new Game();
        game.play();
    }
}
