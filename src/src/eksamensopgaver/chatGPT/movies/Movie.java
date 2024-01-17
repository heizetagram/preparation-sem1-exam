package eksamensopgaver.chatGPT.movies;

public class Movie {
    private String title;
    private String director;
    private int duration;

    public Movie(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public int getDuration () {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }
}
