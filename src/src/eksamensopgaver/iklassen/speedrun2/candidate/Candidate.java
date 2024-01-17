package eksamensopgaver.iklassen.speedrun2.candidate;

public class Candidate {
    private String name;
    private Party party;
    private int numberOfVotes;

    public Candidate(String name, Party party, int numberOfVotes) {
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public String getName() {
        return name;
    }
    public Party getParty() {
        return party;
    }
    public int getNumberOfVotes() {
        return numberOfVotes;
    }
}
