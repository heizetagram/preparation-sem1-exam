package eksamensopgaver.iklassen.sportsresults;

import java.util.ArrayList;

// 4:42 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        SportsResult s1 = new SportsResult("t1", "t2");
        SportsResult s2 = new SportsResult("t1", "t2");
        SportsResult s3 = new SportsResult("t1", "t2");

        ArrayList<SportsResult> sportsResults = new ArrayList<>();
        sportsResults.add(s1);
        sportsResults.add(s2);
        sportsResults.add(s3);

        Save save = new Save();
        save.saveResultInFile(sportsResults);
    }
}
