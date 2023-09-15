package baseball.domain;

public enum NumberRule {

    START_NUMBER(1),
    END_NUMBER(9),
    NUMBER_LENGTH(3);

    private int value;

    public int getValue() {
        return value;
    }

    NumberRule(int value) {
        this.value = value;
    }
}
