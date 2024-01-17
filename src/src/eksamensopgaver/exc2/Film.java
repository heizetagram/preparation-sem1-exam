package eksamensopgaver.exc2;

import java.time.LocalDate;

public class Film {
    private String title;
    private int releaseDate;

    public Film(String title, int releaseDate) {
        setTitle(title);
        setReleaseDate(releaseDate);
    }

    public Film(String title) {
        setTitle(title);
        setReleaseDate(getCurrentYear());
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    private int getCurrentYear() {
        return LocalDate.now().getYear();
    }

    public String getTitle() {
        return title;
    }
    public int getReleaseDate() {
        return releaseDate;
    }
}
