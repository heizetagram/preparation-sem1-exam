package eksamensopgaver.iklassen.speedrun2.candidate;

import java.util.ArrayList;

// 09:24 remaining

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

    public ArrayList<Candidate> getCandidatesFromParty(Party party) {
        ArrayList<Candidate> candidatesFromParty = new ArrayList<>();

        for (Candidate candidate : candidates) {
            if (candidate.getParty().equals(party)) {
                candidatesFromParty.add(candidate);
            }
        }
        return candidatesFromParty;
    }

    public static void main(String[] args) {
        Election election = new Election();

        election.getCandidates().add(new Candidate("Mette", Party.SOCIAL_DEMOKRATIET, 10020));
        election.getCandidates().add(new Candidate("Lars", Party.VENSTRE, 19230));
        election.getCandidates().add(new Candidate("Inger", Party.VENSTRE, 12230));
        election.getCandidates().add(new Candidate("Søren", Party.KONSERVATIVE, 1029));

        System.out.println("Total votes: " + election.getTotalVotes());
        ArrayList<Candidate> candidatesFromVenstre = election.getCandidatesFromParty(Party.VENSTRE);

        for (Candidate candidate : candidatesFromVenstre) {
            System.out.println(candidate.getName() + ", " + candidate.getNumberOfVotes() + ", " + candidate.getParty());
        }
    }
}
