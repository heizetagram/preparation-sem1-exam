package eksamensopgaver.chatGPT.movies;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        FilmCollection filmCollection = new FilmCollection();
        filmCollection.getMovies().add(new Movie("hej", "børge", 100));
        filmCollection.getMovies().add(new Movie("hej", "børge", 1000));
        filmCollection.getMovies().add(new Movie("hej", "børge", 256));
        filmCollection.getMovies().add(new Movie("hej", "børge", 23));


        System.out.println(filmCollection.getAverageDuration());

        filmCollection.saveListInFile();

    }
}
