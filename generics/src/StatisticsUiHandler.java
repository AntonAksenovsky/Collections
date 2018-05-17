import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StatisticsUiHandler {
    private final Scanner in = new Scanner(System.in);
    private final Map<Candidate, List<Voter>> votersByCandidates;

    public StatisticsUiHandler(Map<Candidate, List<Voter>> votersByCandidates) {
        this.votersByCandidates = votersByCandidates;
    }

    public void start() {
        showMenu();
        switch (in.nextInt()) {
            case 1:
                statsByGender();
                break;

            case 2:
                statsByAge();
                break;

            default:
                return;
        }
    }

    private void statsByGender() {
        for (Map.Entry<Candidate, List<Voter>> entry : votersByCandidates.entrySet()) {
            int maleCount = 0;
            int femaleCount = 0;
            for (Voter voter : entry.getValue()) {
                if (voter.getGender() == Gender.MALE) {
                    ++maleCount;
                } else {
                    ++femaleCount;
                }
            }
            System.out.println(entry.getKey().getFio());
            System.out.println("проголосовало мужчин: " + maleCount);
            System.out.println("проголосовало женщин: " + femaleCount);
            System.out.println();
        }
    }

    private void statsByAge() {
        for (Map.Entry<Candidate, List<Voter>> entry : votersByCandidates.entrySet()) {
            int youngCount = 0;
            int adultCount = 0;
            int oldCount = 0;
            int pensionerCount = 0;
            for (Voter voter : entry.getValue()) {
                switch (voter.getAgeCategory()) {
                    case YOUNG:
                        ++youngCount;
                        break;

                    case OLD:
                        ++oldCount;
                        break;

                    case ADULT:
                        ++adultCount;
                        break;
                    case PENSIONER:
                        ++pensionerCount;
                        break;
                }
            }
            System.out.println(entry.getKey().getFio());
            System.out.println("проголосовало young: " + youngCount);
            System.out.println("проголосовало adult: " + adultCount);
            System.out.println("проголосовало old: " + oldCount);
            System.out.println("проголосовало pensioner: " + pensionerCount);
            System.out.println();
        }
    }

    private void showMenu() {
        System.out.println("1. Статистика по полу");
        System.out.println("2. Статистика по возрасту");
    }
}
