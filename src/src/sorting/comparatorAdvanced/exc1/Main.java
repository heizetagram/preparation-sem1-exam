package sorting.comparatorAdvanced.exc1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Video v1 = new Video("Mr. Beast $1000 Challenge", 500);
        Video v2 = new Video("PewDiePie Shopping", 1029);
        Video v3 = new Video("Smosh Food Battle 2024", 300);
        Video v4 = new Video("Orange Talking", 120);

        ArrayList<Video> videos = new ArrayList<>();

        videos.add(v1);
        videos.add(v2);
        videos.add(v3);
        videos.add(v4);

        System.out.println("Before Sorting:");
        printVideos(videos);

        System.out.println("\nBy title");
        videos.sort(new VideoComparator(VideoComparator.SortCriteria.TITLE));
        printVideos(videos);

        System.out.println("\nBy video length:");
        videos.sort(new VideoComparator(VideoComparator.SortCriteria.LENGTH_IN_SECONDS));
        printVideos(videos);

        System.out.println("\n\n\nUsing separate Comparator classes");
        System.out.println("----------------------------------------");
        System.out.println("By title:");
        videos.sort(new VideoTitleComparator());
        printVideos(videos);

        System.out.println("\nBy video length:");
        videos.sort(new VideoLengthInSecondsComparator());
        printVideos(videos);
    }

    private void printVideos(ArrayList<Video> videos) {
        for (Video video : videos) {
            System.out.println(video.getTitle() + ": " + video.getLengthInSeconds());
        }
    }
}
