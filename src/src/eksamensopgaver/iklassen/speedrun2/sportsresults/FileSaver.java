package eksamensopgaver.iklassen.speedrun2.sportsresults;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

// 09:28 remaining

public class FileSaver {
    private ArrayList<SportResult> sportResults;

    public FileSaver() {
        sportResults = new ArrayList<>();
    }

    public void save() {
        try {
            PrintStream writer = new PrintStream("speedrun2SportResults.csv");
            for (SportResult sportResult : sportResults) {
                writer.println(sportResult.getTeam1() + ", " + sportResult.getTeam2() + " Result: " + sportResult.getResult());
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
        FileSaver fileSaver = new FileSaver();

        fileSaver.getSportResults().add(new SportResult("Fnatic", "Astralis"));
        fileSaver.getSportResults().add(new SportResult("Fnatic", "Astralis"));
        fileSaver.getSportResults().add(new SportResult("Fnatic", "Astralis"));
        fileSaver.getSportResults().add(new SportResult("Fnatic", "Astralis"));

        fileSaver.save();
    }
}
