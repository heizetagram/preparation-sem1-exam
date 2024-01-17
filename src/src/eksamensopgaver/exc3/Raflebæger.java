package eksamensopgaver.exc3;

import java.util.ArrayList;
import java.util.Random;

public class Raflebæger {
    private int terning;
    private ArrayList<Integer> øjne;

    public Raflebæger() {
        terning = 6;
        øjne = new ArrayList<>();
    }

    public int ryst() {
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < terning; i++) {
            int øje = random.nextInt(6) + 1;
            øjne.add(øje);
            sum += øje;
        }
        return sum;
    }

    public void se() {
        for (Integer øje : øjne) {
            System.out.println(øje);
        }
    }

}
