package eksamensopgaver.exc1;

import java.util.ArrayList;

public class Tekst {
    private ArrayList<String> tekstLinjer;

    public Tekst() {
        tekstLinjer = new ArrayList<>();
    }

    public void tilføj(String tekst) {
        tekstLinjer.add(tekst);
    }

    public long findAntalUnikke() {
        return tekstLinjer.stream().distinct().count();
    }
}
