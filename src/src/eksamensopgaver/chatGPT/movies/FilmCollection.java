package eksamensopgaver.chatGPT.movies;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class FilmCollection {
    private ArrayList<Movie> movies;

    public FilmCollection() {
        movies = new ArrayList<>();
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public double getAverageDuration() {
        double total = 0;
        for (Movie movie : movies) {
            total += movie.getDuration();
        }
        return total / movies.size();
    }

    public void saveListInFile() {
        try {
            PrintStream writer = new PrintStream(new File("Movies"));
            for (Movie movie : movies) {
                writer.println(movie.getTitle() + "," + movie.getDirector() + "," + movie.getDuration());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
        }
    }
}
