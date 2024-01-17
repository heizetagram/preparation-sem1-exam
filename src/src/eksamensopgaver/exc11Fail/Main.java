package eksamensopgaver.exc11Fail;

// Fail

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Article a1 = new Article("Hej", "i dag gik jeg en tur, og det var en god tur, fordi det var en lang rute", "H.C. Andersen");

        System.out.println(a1.getLongestWord());
    }
}
