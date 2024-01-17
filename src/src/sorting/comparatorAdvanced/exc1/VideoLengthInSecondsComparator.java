package sorting.comparatorAdvanced.exc1;

import java.util.Comparator;

public class VideoLengthInSecondsComparator implements Comparator<Video> {
    @Override
    public int compare(Video v1, Video v2) {
        return v1.getLengthInSeconds() - v2.getLengthInSeconds();
    }
}
