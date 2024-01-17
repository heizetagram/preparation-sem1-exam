package eksamensopgaver.exc11Fail.take3Fail;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Article {
    private String heading;
    private String body;
    private String author;
    private ArrayList<String> words;

    public Article(String heading, String body, String author) throws Exception {
        this.heading = heading;
        this.author = author;
        setBody(body);
        words = new ArrayList<>();
    }

    public void setBody(String body) throws Exception {
        if (body.length() > 30) {
            this.body = body;
        } else {
            throw new Exception("Body must be longer than 30 characters");
        }
    }

    public String getLongestWord() {
        StringBuilder stringBuilder = new StringBuilder();
        String word = "";

        int min = Integer.MIN_VALUE;
        String longestWord = "";

        for (int i = 0; i < body.length(); i++) {
            if (body.charAt(i) != ' ') {
                word = stringBuilder.append(body.charAt(i)).toString();
            } else if (body.charAt(i) == ' ') {
                word = word.replaceAll("[,.?!:]", "");
                words.add(word);
                stringBuilder.setLength(0);
                word = "";
            }
        }

        for (String word1 : words) {
            if (word1.length() > min) {
                min = word1.length();
                longestWord = word1;
            }
        }
        return longestWord;
    }

    public List<String> getWords() {
        return words.stream().distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) throws Exception {
        Article a1 = new Article("Title", "er, er, abekat, hej, hej, moder, moder", "H.C.");
        a1.getLongestWord();

        for (String word : a1.getWords()) {
            System.out.println(word);
        }
    }



}
