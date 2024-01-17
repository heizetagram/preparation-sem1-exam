package eksamensopgaver.chatGPT.programminglanguages;

public class ProgrammingLanguage {
    private String name;
    private String paradigm;
    private int yearCreated;

    public ProgrammingLanguage(String name, String paradigm, int yearCreated) {
        this.name = name;
        this.paradigm = paradigm;
        this.yearCreated = yearCreated;
    }

    public String getName() {
        return name;
    }
    public String getParadigm() {
        return paradigm;
    }
    public int getYearCreated() {
        return yearCreated;
    }
}
