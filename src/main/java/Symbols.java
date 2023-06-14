public enum Symbols {
    CHERRY(2),
    BAR(3),
    BELL(4),
    SEVEN(5),
    LEMON(6),
    COIN(7),
    POUND(8);

    private final int value;

    Symbols(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
