import Voter;
import Candidate;

public class Election {
    private HashMap<String, Voter> voters;
    private HashMap<String, Candidate> candidates;
    private int totalVotes;

    public Election() {
        // Initialize the HashMaps and total votes
    }

    public void registerVoter(String name, int age) {
        // Register a new voter if they are eligible
    }

    public void registerCandidate(String name) {
        // Register a new candidate
    }

    public void castVote(String voterName, String candidateName) {
        // Allow a voter to cast a vote for a candidate
    }

    public void displayResults() {
        // Print the election results, including the winner
    }

}