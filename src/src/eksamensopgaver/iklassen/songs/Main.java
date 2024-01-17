package eksamensopgaver.iklassen.songs;

// 4:00 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Song s1 = new Song("t1", "habu", 120);
        Song s2 = new Song("hej", "habbo", 80);

        Playlist playlist = new Playlist();

        playlist.getSongs().add(s1);
        playlist.getSongs().add(s2);

        System.out.println(playlist.getTotalDuration());

        playlist.savePlaylist();
    }
}
