package eksamensopgaver.iklassen.speedrun3.candidate;

import java.util.ArrayList;

// 08:29 remaining

public class Election {
    private ArrayList<Candidate> candidates;

    public Election() {
        candidates = new ArrayList<>();
    }

    public ArrayList<Candidate> getCandidates() {
        return candidates;
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

    public int getTotalVotes() {
        int totalVotes = 0;
        for (Candidate candidate : candidates) {
            totalVotes += candidate.getNumberOfVotes();
        }
        return totalVotes;
    }

    public static void main(String[] args) {
        Election election = new Election();

        election.getCandidates().add(new Candidate("Mette", Party.SOCIAL_DEMOKRATIET, 1000));
        election.getCandidates().add(new Candidate("Jørgen", Party.SOCIAL_DEMOKRATIET, 1500));
        election.getCandidates().add(new Candidate("Pape", Party.KONSERVATIVE, 1200));
        election.getCandidates().add(new Candidate("Bob", Party.VENSTRE, 1300));

        System.out.println("Total votes: " + election.getTotalVotes());

        System.out.println("\nCandidates from Social Demokratiet:");
        ArrayList<Candidate> candidatesFromSocialDemokratiet = election.getCandidatesFromParty(Party.SOCIAL_DEMOKRATIET);
        for (Candidate candidate : candidatesFromSocialDemokratiet) {
            System.out.println(candidate.getName() + ", " + candidate.getParty() + ", " + candidate.getNumberOfVotes());
        }
    }
}
