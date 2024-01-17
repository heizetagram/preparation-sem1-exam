package eksamensopgaver.iklassen.songs;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public int getTotalDuration() {
        int total = 0;
        for (Song song : songs) {
            total += song.getDuration();
        }
        return total;
    }

    public void savePlaylist() {
        try {
            PrintStream printStream = new PrintStream("iKlassenSongs.csv");
            for (Song song : songs) {
                printStream.print(song.getTitle() + ";" + song.getArtist() + ";" + song.getDuration());
                printStream.println();
            }
            printStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
        }
    }
}
