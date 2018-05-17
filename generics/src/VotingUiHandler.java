import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VotingUiHandler {
    private final Scanner in = new Scanner(System.in);
    private final Map<Candidate, List<Voter>> votersByCandidates;

    public VotingUiHandler(Map<Candidate, List<Voter>> votersByCandidates) {
        this.votersByCandidates = votersByCandidates;
    }

    public void start() {
        showMenu();
        switch (in.nextInt()) {
            case 1:
                vote(Candidate.FIRST);
                break;

            case 2:
                vote(Candidate.SECOND);
                break;
            case 3:
                vote(Candidate.THIRD);
                break;
            default:
                return;
        }
    }

    private void vote(Candidate candidate) {
        List<Voter> voters = votersByCandidates.get(candidate);

        System.out.println("Введите пол: male или female");
        Gender gender = Gender.valueOf(in.next().toUpperCase());

        System.out.println("Введите возраст");
        int age = in.nextInt();

        Voter voter = (gender == Gender.MALE) ? new Man(age) : new Woman(age);
        voters.add(voter);
    }


    private void showMenu() {
        int i = 1;
        for (Candidate candidate : Candidate.values()) {
            System.out.println(i++ + ") " + candidate);
        }
    }
}