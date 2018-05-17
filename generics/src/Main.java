import java.util.*;

class Main {
    private final Scanner in = new Scanner(System.in);
    private final Map<Candidate, List<Voter>> votersByCandidates = buildMap();


    private Map<Candidate, List<Voter>> buildMap() {
        Map<Candidate, List<Voter>> result = new HashMap<>();
        for (Candidate candidate : Candidate.values()) {
            result.put(candidate, new ArrayList<>());
        }
        return result;
    }

    private final VotingUiHandler votingUiHandler = new VotingUiHandler(votersByCandidates);
    private final StatisticsUiHandler statisticsUiHandler = new StatisticsUiHandler(votersByCandidates);

    private void start() {
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    votingUiHandler.start();
                    break;

                case 2:
                    statisticsUiHandler.start();
                    break;

                default:
                    return;
            }
        }
    }

    private void showMenu() {
        System.out.println("1 – Проголосовать");
        System.out.println("2 – Вывести статистику");
        System.out.println("3 – Выход");
    }

    public static void main(String args[]) {
        new Main().start();
    }
}
