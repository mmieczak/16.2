package data;

public enum Color {
    CLUB("Żołądź", "Clubs"),
    DIAMOND("Dzwonek", "Diamonds"),
    HEART("Serce", "Hearts"),
    SPADE("Wino", "Spades");

    private final String plName;
    private final String engName;

    Color(String plName, String engName) {

        this.plName = plName;
        this.engName = engName;
    }

    public String getPlName() {
        return plName;
    }

    public String getEngName() {
        return engName;
    }
}
