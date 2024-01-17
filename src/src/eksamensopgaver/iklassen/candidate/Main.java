package eksamensopgaver.iklassen.candidate;

// 05:05 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Candidate c1 = new Candidate("Lars Løkke", "Moderaterne", 1000);
        Candidate c2 = new Candidate("Mette", "SD", 9000);
        Candidate c3 = new Candidate("Frederiksen", "SD", 122);

        Election election = new Election();
        election.getCandidates().add(c1);
        election.getCandidates().add(c2);
        election.getCandidates().add(c3);

        System.out.println(election.getTotalVotes());
        for (Candidate candidate: election.getCandidatesFromParty("SD")) {
            System.out.println(candidate.getName() + ", " + candidate.getParty() + ", " + candidate.getNumberOfVotes());
        }
        System.out.println();
        for (Candidate candidate: election.getCandidatesFromParty("Moderaterne")) {
            System.out.println(candidate.getName() + ", " + candidate.getParty() + ", " + candidate.getNumberOfVotes());
        }

    }
}
