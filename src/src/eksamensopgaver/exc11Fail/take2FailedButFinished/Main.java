package eksamensopgaver.exc11Fail.take2FailedButFinished;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    private void run() throws Exception {
        Article article = new Article("Title", "I am a bondegaard, ee ai ee ai ooh. I am a bondegaard.", "Old McDonald");
        article.addWordsToList();
        System.out.println(article.getLongestWord());
        article.printWords();


        System.out.println();
        System.out.println("Longest word:");
        System.out.println(article.getLongestWord());

        List<String> distinctWords = article.getDistinctWords();
        System.out.println();
        System.out.println("Distinct words:");
        for (String distinctWord : distinctWords) {
            System.out.println(distinctWord);
        }
    }
}
