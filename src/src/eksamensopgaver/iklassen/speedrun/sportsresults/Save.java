package eksamensopgaver.iklassen.speedrun.sportsresults;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

// 07:13 remaining

public class Save {
    private ArrayList<SportResult> sportResults;

    public Save() {
        sportResults = new ArrayList<>();
    }

    public void saveToFile() {
        try {
            PrintStream writer = new PrintStream("speedrunSportsResults.csv");
            for (SportResult sportResult : sportResults) {
                writer.println(sportResult.getTeam1() + "," + sportResult.getTeam2() + ", Winner: " + sportResult.getWinner());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
        }
    }

    public ArrayList<SportResult> getSportResults() {
        return sportResults;
    }

    public static void main(String[] args) {
        Save save = new Save();

        save.getSportResults().add(new SportResult("T1", "T2"));
        save.getSportResults().add(new SportResult("T1", "T2"));
        save.getSportResults().add(new SportResult("T1", "T2"));
        save.getSportResults().add(new SportResult("T1", "T2"));
        save.getSportResults().add(new SportResult("T1", "T2"));

        save.saveToFile();
    }
}
