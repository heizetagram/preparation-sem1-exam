package eksamensopgaver.exc9;

//

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        MotherBoard motherBoard = new MotherBoard();
        SataDrive s1 = new SataDrive("s1");
        SataDrive s2 = new SataDrive("s2");
        SataDrive s3 = new SataDrive("s3");
        SataDrive s4 = new SataDrive("s4");

        motherBoard.addSDToEmptySpot(s1);
        motherBoard.printAllSataDrives();
        motherBoard.addSDToEmptySpot(s2);

    }
}
