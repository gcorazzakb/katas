public enum Symbol {
    Sciccors("8<"),
    Rock("()"),
    Paper("[]");

    private final String display;

    Symbol(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }
}
