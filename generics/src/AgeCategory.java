public enum AgeCategory {
    YOUNG(18, 29),
    ADULT(30, 49),
    OLD(50, 64),
    PENSIONER(65, 100);

    private int left;
    private int right;

    AgeCategory(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public static AgeCategory valueOf(int age) {
        for (AgeCategory ageCategory : values()) {
            if ((ageCategory.left <= age) && (age <= ageCategory.right)) {
                return ageCategory;
            }
        }
        throw new IllegalArgumentException();
    }
}

class AgeCategoryFake {
    public static final AgeCategoryFake[] VALUES;
    public static final AgeCategoryFake YOUNG;
    public static final AgeCategoryFake ADULT;
    public static final AgeCategoryFake OLD;
    public static final AgeCategoryFake PENSIONER;

    static {
        VALUES = new AgeCategoryFake[4];
        VALUES[0] = YOUNG = new AgeCategoryFake(18, 29);
        VALUES[1] = ADULT = new AgeCategoryFake(30, 49);
        VALUES[2] = OLD = new AgeCategoryFake(50, 64);
        VALUES[3] = PENSIONER = new AgeCategoryFake(65, 200);
    }

    private final int left;
    private final int right;

    private AgeCategoryFake(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public static AgeCategoryFake valueOf(int age) {
        for (AgeCategoryFake ageCategory : values()) {
            if ((ageCategory.left <= age) && (age <= ageCategory.right)) {
                return ageCategory;
            }
        }
        throw new IllegalArgumentException();
    }

    public static AgeCategoryFake[] values() {
        return VALUES.clone();
    }
}