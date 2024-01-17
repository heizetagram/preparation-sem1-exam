package eksamensopgaver.exc11Fail;

import java.util.ArrayList;

// Fail

public class Article {
    private String heading;
    private String body;
    private String author;

    public Article(String heading, String body, String author) {
        setHeading(heading);
        setBody(body);
        setAuthor(author);
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }
    public void setBody(String body) {
        if (body.length() > 50) {
            this.body = body;
        } else {
            System.out.println("Body must be more than 50 characters");
        }
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLongestWord() {
        int max = Integer.MIN_VALUE;
        String longestWord = "";
        ArrayList<String> words = new ArrayList<>();
        String word = "";

        for (int i = 0; i < body.length(); i++) {
            if (body.charAt(i) != ' ' || !Character.isLetter(i)) {
                word = word + body.charAt(i);
            }
            else {
                words.add(word);
                word = "";
            }
        }

        for (String w : words) {
            if (w.length() > max) {
                max = w.length();
                longestWord = w;
            }
        }
        return longestWord;
    }

    public void getWords() {
        int max = Integer.MIN_VALUE;
        String longestWord = "";
        ArrayList<String> words = new ArrayList<>();
        String word = "";

        for (int i = 0; i < body.length(); i++) {
            if (body.charAt(i) != ' ' || !Character.isLetter(i)) {
                word = word + body.charAt(i);
            }
            else {
                words.add(word);
                word = "";
            }
        }

        for (String w : words) {
            System.out.println(w);
        }
    }

}
