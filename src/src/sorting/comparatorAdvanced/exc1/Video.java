package sorting.comparatorAdvanced.exc1;

public class Video {
    private String title;
    private int lengthInSeconds;

    public Video(String title, int lengthInSeconds) {
        setTitle(title);
        setLengthInSeconds(lengthInSeconds);
    }

    // Getter
    public String getTitle() {
        return title;
    }
    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }
    public void setLengthInSeconds(int lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }
}
