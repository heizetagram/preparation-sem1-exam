package eksamensopgaver.chatGPT.programminglanguages;

import java.util.ArrayList;

public class Main {
    private LanguageCollection languageCollection;

    public static void main(String[] args) {
        new Main().run();
    }

    private void initVars() {
        languageCollection = new LanguageCollection();
    }

    private void run() {
        initVars();
        addProgrammingLanguages();

        System.out.println("Oldest language:");
        System.out.println(languageCollection.getOldestLanguage().getName() + ", " + languageCollection.getOldestLanguage().getParadigm() + ", " + languageCollection.getOldestLanguage().getYearCreated());

        // Extra
        System.out.println();
        System.out.println("Newest language:");
        System.out.println(languageCollection.getNewestLanguage().getName() + ", " + languageCollection.getNewestLanguage().getParadigm() + ", " + languageCollection.getNewestLanguage().getYearCreated());

        System.out.println();
        System.out.println("Languages by paradigm 'Hello2'");
        ArrayList<ProgrammingLanguage> languagesByParadigm = languageCollection.findLanguagesByParadigm("Hello2");
        for (ProgrammingLanguage programmingLanguage : languagesByParadigm) {
            System.out.println(programmingLanguage.getName() + ", " + programmingLanguage.getParadigm() + ", " + programmingLanguage.getYearCreated());
        }

    }

    private void addProgrammingLanguages() {
        languageCollection.getProgrammingLanguages().add(new ProgrammingLanguage("Java", "Hello2", 2000));
        languageCollection.getProgrammingLanguages().add(new ProgrammingLanguage("Java", "Hello2", 2020));
        languageCollection.getProgrammingLanguages().add(new ProgrammingLanguage("C++", "Hello", 1999));
        languageCollection.getProgrammingLanguages().add(new ProgrammingLanguage("C#", "Hello", 1980));
        languageCollection.getProgrammingLanguages().add(new ProgrammingLanguage("JavaScript", "Hello", 2005));
    }
}
