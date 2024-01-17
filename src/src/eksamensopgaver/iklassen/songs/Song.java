package eksamensopgaver.iklassen.songs;

public class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        setTitle(title);
        setArtist(artist);
        setDuration(duration);
    }

    public int getDuration() {
        return duration;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
