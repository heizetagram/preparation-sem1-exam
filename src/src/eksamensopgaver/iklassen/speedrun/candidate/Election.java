package eksamensopgaver.iklassen.speedrun.candidate;

import java.util.ArrayList;

// 08:26 remaining

public class Election {
    private ArrayList<Candidate> candidates;

    public Election() {
        candidates = new ArrayList<>();
    }

    public int getTotalVotes() {
        int totalVotes = 0;

        for (Candidate candidate : candidates) {
            totalVotes += candidate.getNumberOfVotes();
        }
        return totalVotes;
    }

    public ArrayList<Candidate> getCandidatesFromParty(Party party) {
        ArrayList<Candidate> candidatesFromParty = new ArrayList<>();

        for (Candidate candidate : candidates) {
            if (candidate.getParty().equals(party)) {
                candidatesFromParty.add(candidate);
            }
        }
        return candidatesFromParty;
    }

    public ArrayList<Candidate> getCandidates() {
        return candidates;
    }

    public static void main(String[] args) {
        Election election = new Election();

        election.getCandidates().add(new Candidate("Mette", Party.SOCIAL_DEMOKRATIET, 1000));
        election.getCandidates().add(new Candidate("Lars", Party.VENSTRE, 1500));
        election.getCandidates().add(new Candidate("Liban", Party.VENSTRE, 1500));
        election.getCandidates().add(new Candidate("Pape", Party.KONSERVATIVE, 1300));

        System.out.println("Total votes: " + election.getTotalVotes());

        ArrayList<Candidate> candidatesFromVenstre = election.getCandidatesFromParty(Party.VENSTRE);
        for (Candidate candidate : candidatesFromVenstre) {
            System.out.println(candidate.getName() + ", " + candidate.getParty() + ", " + candidate.getNumberOfVotes());
        }
    }
}
