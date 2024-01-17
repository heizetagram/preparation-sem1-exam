package eksamensopgaver.iklassen.sportsresults;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Save {
    public void saveResultInFile(ArrayList<SportsResult> sportsResults) {
        try {
            PrintStream writer = new PrintStream("iKlassenSportsResults.csv");
            for (SportsResult sportsResult : sportsResults) {
                writer.println(sportsResult.getTeam1() + "," + sportsResult.getTeam2() + "," + sportsResult.getWinner());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
        }
    }
}
