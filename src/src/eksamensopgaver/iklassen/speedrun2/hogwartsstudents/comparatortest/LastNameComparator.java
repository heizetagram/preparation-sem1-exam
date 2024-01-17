package eksamensopgaver.iklassen.speedrun2.hogwartsstudents.comparatortest;

import java.util.Comparator;

public class LastNameComparator implements Comparator<HogwartsStudent2> {
    @Override
    public int compare(HogwartsStudent2 hs1, HogwartsStudent2 hs2) {
        return hs1.getLastName().compareTo(hs2.getLastName());
    }
}
