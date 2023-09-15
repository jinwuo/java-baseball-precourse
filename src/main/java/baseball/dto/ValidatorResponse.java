package baseball.dto;

public class ValidatorResponse {
    private int strike;
    private int ball;
    private int nothing;

    public ValidatorResponse(int strike, int ball, int nothing) {
        this.strike = strike;
        this.ball = ball;
        this.nothing = nothing;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public int getNothing() {
        return nothing;
    }
}
