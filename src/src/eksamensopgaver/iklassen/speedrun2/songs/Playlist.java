package eksamensopgaver.iklassen.speedrun2.songs;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

// 09:56 remaining

public class Playlist {
    private ArrayList<Song> playlist;

    public Playlist() {
        playlist = new ArrayList<>();
    }

    public int getTotalDuration() {
        int total = 0;

        for (Song song : playlist) {
            total += song.getDuration();
        }
        return total;
    }

    public void saveToFile() {
        try {
            PrintStream writer = new PrintStream("speedrun2Songs.csv");
            for (Song song : playlist) {
                writer.println(song.getTitle() + "," + song.getArtist() + "," + song.getDuration());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
        }
    }

    public ArrayList<Song> getPlaylist() {
        return playlist;
    }

    public static void main(String[] args) {
        Playlist playlist1 = new Playlist();

        playlist1.getPlaylist().add(new Song("Test", "Medina", 120));
        playlist1.getPlaylist().add(new Song("Test2", "Burhan G", 140));
        playlist1.getPlaylist().add(new Song("Fugl", "Rasmus Seebach", 130));

        System.out.println("Total playlist duration: " + playlist1.getTotalDuration());
        playlist1.saveToFile();
    }
}
