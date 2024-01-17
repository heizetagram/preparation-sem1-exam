package sorting.comparatorAdvanced.exc1;

import java.util.Comparator;

public class VideoComparator implements Comparator<Video> {
    public static SortCriteria sortCriteria;

    public enum SortCriteria {
        TITLE,
        LENGTH_IN_SECONDS
    }

    // Constructor
    public VideoComparator(SortCriteria sortCriteria) {
        VideoComparator.sortCriteria = sortCriteria;
    }

    @Override
    public int compare(Video v1, Video v2) {
        switch (VideoComparator.sortCriteria) {
            case TITLE -> {
                return v1.getTitle().compareTo(v2.getTitle());
            }
            case LENGTH_IN_SECONDS -> {
                return Integer.compare(v1.getLengthInSeconds(), v2.getLengthInSeconds());
            }
            default -> {
                return 0;
            }
        }
    }
}
