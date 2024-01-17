package eksamensopgaver.exc11Fail.take2FailedButFinished;

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
        setBody(body);
        this.author = author;
        words = new ArrayList<>();
    }

    public void setBody(String body) throws Exception {
        if (body.length() > 30) {
            this.body = body;
        } else {
            throw new Exception("Body must be more than 30 characters");
        }
    }

    public void addWordsToList() {
        StringBuilder stringBuilder = new StringBuilder();
        String word = "";

        for (int i = 0; i < body.length(); i++) {
            if (body.charAt(i) != ' ') {
                stringBuilder.append(body.charAt(i));
            } else if (body.charAt(i) == ' ') {
                word = stringBuilder.toString();
                word = word.replaceAll("[\\,\\.\\!\\?]", "");
                words.add(word);
                stringBuilder.setLength(0);
            }
        }
    }

    public String getLongestWord() {
        int min = Integer.MIN_VALUE;
        String longestWord = "";

        for (String word : words) {
            if (word.length() > min) {
                min = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }

    public List<String> getDistinctWords() {
        return words.stream().distinct().collect(Collectors.toList());
    }

    public void printWords() {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
