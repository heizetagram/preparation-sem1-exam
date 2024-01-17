package eksamensopgaver.iklassen.speedrun.sportsresults;

import java.util.Random;

public class SportResult {
    private String team1;
    private String team2;
    private String result;

    public SportResult(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
        setWinner();
    }

    private void setWinner() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        switch (randomNumber) {
            case 0 -> result = "Draw";
            case 1 -> result = team1;
            case 2 -> result = team2;
        }
    }

    public String getTeam1() {
        return team1;
    }
    public String getTeam2() {
        return team2;
    }
    public String getWinner() {
        return result;
    }
}
