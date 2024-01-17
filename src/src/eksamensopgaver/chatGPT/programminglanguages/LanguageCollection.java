package eksamensopgaver.chatGPT.programminglanguages;

import java.util.ArrayList;

public class LanguageCollection {
    private ArrayList<ProgrammingLanguage> programmingLanguages;

    public LanguageCollection() {
        programmingLanguages = new ArrayList<>();
    }

    public ArrayList<ProgrammingLanguage> findLanguagesByParadigm(String paradigm) {
        ArrayList<ProgrammingLanguage> languagesByParadigm = new ArrayList<>();

        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getParadigm().equals(paradigm)) {
                languagesByParadigm.add(programmingLanguage);
            }
        }
        return languagesByParadigm;
    }

    public ProgrammingLanguage getOldestLanguage() {
        int max = Integer.MAX_VALUE;
        ProgrammingLanguage oldestLanguage = null;

        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getYearCreated() < max) {
                max = programmingLanguage.getYearCreated();
                oldestLanguage = programmingLanguage;
            }
        }
        return oldestLanguage;
    }

    public ArrayList<ProgrammingLanguage> getProgrammingLanguages() {
        return programmingLanguages;
    }

    // Extra
    public ProgrammingLanguage getNewestLanguage() {
        int min = Integer.MIN_VALUE;
        ProgrammingLanguage newestLanguage = null;

        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getYearCreated() > min) {
                min = programmingLanguage.getYearCreated();
                newestLanguage = programmingLanguage;
            }
        }
        return newestLanguage;
    }
}
