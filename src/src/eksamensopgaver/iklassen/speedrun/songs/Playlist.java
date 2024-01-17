package eksamensopgaver.iklassen.speedrun.songs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

// 08:19 remaining

public class Playlist {
    private ArrayList<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public int getTotalDuration() {
        int totalDuration = 0;
        for (Song song : songs) {
            totalDuration += song.getDuration();
        }
        return totalDuration;
    }

    public void saveSongsToFile() {
        try {
            PrintStream writer = new PrintStream(new File("speedrunSongs.csv"));
            for (Song song : songs) {
                writer.println(song.getTitle() + "," + song.getArtist() + "," + song.getDuration());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
        }
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.getSongs().add(new Song("Hej", "Medina", 120));
        playlist.getSongs().add(new Song("Hvad", "Burhan G", 100));
        playlist.getSongs().add(new Song("Test", "Medina", 140));
        playlist.getSongs().add(new Song("Test2", "Rasmus", 110));

        System.out.println("Total song duration: " + playlist.getTotalDuration());
        playlist.saveSongsToFile();
    }
}
