abstract class VoterBase implements Voter{
    private final AgeCategory ageCategory;

    VoterBase(int age) {
        ageCategory = AgeCategory.valueOf(age);
    }

    @Override
    public AgeCategory getAgeCategory() {
        return ageCategory;
    }
}
