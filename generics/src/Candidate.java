public enum Candidate {
    FIRST("Пушкин Вася Сергеевич"),
    SECOND("Петя"),
    THIRD("Саша");

    private final String fio;

    Candidate(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String toString() {
        return fio;
    }
}
