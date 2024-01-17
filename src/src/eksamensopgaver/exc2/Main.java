package eksamensopgaver.exc2;

// 7 min remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Film f1 = new Film("Nemo", 2006);
        Film f2 = new Film("Dory");

        Producer p1 = new Producer("Tarantino");
        Producer p2 = new Producer("Mikkelsen");

        p1.setFilm(f1);
        p2.setFilm(f2);

        System.out.println(p1.getFilm().getTitle() + ", " + p1.getFilm().getReleaseDate());
        System.out.println(p2.getFilm().getTitle() + ", " + p2.getFilm().getReleaseDate());

    }
}
