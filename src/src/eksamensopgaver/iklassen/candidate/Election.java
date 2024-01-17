package eksamensopgaver.iklassen.candidate;

import java.util.ArrayList;

public class Election {
    private ArrayList<Candidate> candidates;

    public Election() {
        candidates = new ArrayList<>();
    }

    public ArrayList<Candidate> getCandidates() {
        return candidates;
    }

    public int getTotalVotes() {
        int totalVotes = 0;
        for (Candidate candidate : candidates) {
            totalVotes += candidate.getNumberOfVotes();
        }
        return totalVotes;
    }

    public ArrayList<Candidate> getCandidatesFromParty(String party) {
        ArrayList<Candidate> candidatesFromParty = new ArrayList<>();
        for (Candidate candidate : candidates) {
            if (candidate.getParty().equals(party)) {
                candidatesFromParty.add(candidate);
            }
        }
        return candidatesFromParty;
    }
}
