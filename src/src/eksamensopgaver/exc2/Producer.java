package eksamensopgaver.exc2;

public class Producer {
    private String name;
    private Film film;

    public Producer(String name) {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Film getFilm() {
        return film;
    }
}
