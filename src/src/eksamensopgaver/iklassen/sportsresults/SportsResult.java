package eksamensopgaver.iklassen.sportsresults;

import java.util.Random;

public class SportsResult {
    private String team1;
    private String team2;
    private String winner;

    public SportsResult(String team1, String team2) {
        setTeam1(team1);
        setTeam2(team2);
        generateRandomResult();
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }
    public void setTeam2(String team2) {
        this.team2 = team2;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getTeam1() {
        return team1;
    }
    public String getTeam2() {
        return team2;
    }
    public String getWinner() {
        return winner;
    }

    private void generateRandomResult() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        switch (randomNumber) {
            case 0 -> setWinner("Draw");
            case 1 -> setWinner(team1);
            case 2 -> setWinner(team2);
        }
        System.out.println("And the winner is... " + winner);
    }
}
