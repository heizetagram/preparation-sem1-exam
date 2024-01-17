package eksamensopgaver.exc9;

public class MotherBoard {
    private SataDrive[] sataDrives = new SataDrive[4];

    /*public void addSataDrives(SataDrive s1, SataDrive s2, SataDrive s3, SataDrive s4) {
        sataDrives[0] = s1;
        sataDrives[1] = s2;
        sataDrives[2] = s3;
        sataDrives[3] = s4;
    }
     */

    public void printAllSataDrives() {
        System.out.println(sataDrives[0]);
        //System.out.println(sataDrives[0].getName() + ", " + sataDrives[1].getName() + ", " + sataDrives[2].getName() + ", " + sataDrives[3].getName());
    }

    public void addSDToEmptySpot(SataDrive sD) {
        int n = 0;
        for (int i = 0; i < 4; i++) {
            if (sataDrives[i] == null && n < 4) {
                sataDrives[i] = sD;
                n++;

            } else if (n == 4) {
                System.out.println("Motherboard is full");
            }
        }
    }
}
