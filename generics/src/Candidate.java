public enum Candidate {
    FIRST("Пушкин Вася Сергеевич"),
    SECOND("Путин Петя Николаевич"),
    THIRD("Ромашкин Саша Алексеевич");

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
