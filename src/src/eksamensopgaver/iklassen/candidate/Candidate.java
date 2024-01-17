package eksamensopgaver.iklassen.candidate;

public class Candidate {
    private String name;
    private String party;
    private int numberOfVotes;

    public Candidate(String name, String party, int numberOfVotes) {
        setName(name);
        setParty(party);
        setNumberOfVotes(numberOfVotes);
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public String getParty() {
        return party;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setParty(String party) {
        this.party = party;
    }
    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }
}
