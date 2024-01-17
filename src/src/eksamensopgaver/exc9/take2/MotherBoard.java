package eksamensopgaver.exc9.take2;

public class MotherBoard {
    private SataDrive[] sataDrives;

    public MotherBoard() {
        sataDrives = new SataDrive[4];
    }


    public void printAllSDDrives() {
        for (SataDrive sataDrive : sataDrives) {
            if (sataDrive == null) {
                System.out.println("Empty spot");
            } else {
                System.out.println(sataDrive.getName());
            }
        }
    }

    public void addSDToEmptySpot(SataDrive sataDrive) {
        boolean running = true;
        for (int i = 0; i < 4; i++) {
            if (sataDrives[i] == null && running) {
                sataDrives[i] = sataDrive;
                running = false;
            }
        }
        if (running) {
            System.out.println("All spots have been taken");
        }
    }
}
