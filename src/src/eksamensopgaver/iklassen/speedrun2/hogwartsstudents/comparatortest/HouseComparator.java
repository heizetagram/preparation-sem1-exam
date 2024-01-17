package eksamensopgaver.iklassen.speedrun2.hogwartsstudents.comparatortest;

import java.util.Comparator;

public class HouseComparator implements Comparator<HogwartsStudent2> {
    public int compare(HogwartsStudent2 hs1, HogwartsStudent2 hs2) {
        return hs1.getHouse().compareTo(hs2.getHouse());
    }
}
