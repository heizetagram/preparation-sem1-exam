package eksamensopgaver.exc9.take2;

// 00:24 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        MotherBoard motherBoard = new MotherBoard();


        SataDrive sd1 = new SataDrive("sd1");
        SataDrive sd2 = new SataDrive("sd2");
        SataDrive sd3 = new SataDrive("sd3");
        SataDrive sd4 = new SataDrive("sd4");
        SataDrive sd5 = new SataDrive("sd5");

        motherBoard.addSDToEmptySpot(sd1);
        motherBoard.addSDToEmptySpot(sd2);
        motherBoard.addSDToEmptySpot(sd3);
        motherBoard.addSDToEmptySpot(sd4);
        motherBoard.printAllSDDrives();
        motherBoard.addSDToEmptySpot(sd5);
    }
}
