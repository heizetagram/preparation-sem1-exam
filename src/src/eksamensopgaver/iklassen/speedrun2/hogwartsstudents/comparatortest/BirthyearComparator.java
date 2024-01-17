package eksamensopgaver.iklassen.speedrun2.hogwartsstudents.comparatortest;

import java.util.Comparator;

public class BirthyearComparator implements Comparator<HogwartsStudent2> {
    @Override
    public int compare(HogwartsStudent2 hs1, HogwartsStudent2 hs2) {
        return hs1.getBirthyear() - hs2.getBirthyear();
    }
}
