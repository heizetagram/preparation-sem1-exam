package eksamensopgaver.iklassen.speedrun2.sportsresults;

import java.util.Random;

public class SportResult {
    private String team1;
    private String team2;
    private String result;

    public SportResult(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
        generateRandomResult();
    }

    public String getTeam1() {
        return team1;
    }
    public String getTeam2() {
        return team2;
    }
    public String getResult() {
        return result;
    }

    private void generateRandomResult() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0 -> result = "Draw";
            case 1 -> result = team1;
            case 2 -> result = team2;
        }
    }
}
