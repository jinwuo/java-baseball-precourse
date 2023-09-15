package baseball.dto;

public class RandomNumberResponse {

    private String randomNumber;

    private boolean[] checkArr;

    public RandomNumberResponse (String randomNumber, boolean[] checkArr) {
        this.randomNumber = randomNumber;
        this.checkArr = checkArr;
    }

    public String getRandomNumber() {
        return randomNumber;
    }

    public boolean[] getCheckArr() {
        return checkArr;
    }
}
