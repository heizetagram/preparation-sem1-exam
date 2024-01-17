package eksamensopgaver.exc14;

// 08:35 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Image i1 = new Image("Antony", 100, 150);
        Image i2 = new Image("LasseTisser.jpg", 150, 100);

        System.out.println("Is known file type: " + i1.isKnownFileType());
        System.out.println("Is landscape: " + i1.isLandscape());
        System.out.println("Is portrait: " + i1.isPortrait());

        System.out.println();

        System.out.println("Is known file type: " + i2.isKnownFileType());
        System.out.println("Is landscape: " + i2.isLandscape());
        System.out.println("Is portrait: " + i2.isPortrait());
    }
}
