package baseball.domain;

import baseball.dto.RandomNumberResponse;
import baseball.dto.ValidatorResponse;

public class Validator {

    public static ValidatorResponse validatePlayerNumber(String playerNumber, RandomNumberResponse response) {

        if(playerNumber.length() != NumberRule.NUMBER_LENGTH.getValue()) throw new IllegalArgumentException();

        int strike = 0;
        int ball = 0;
        int nothing = 0;

        for(int i=0; i < NumberRule.NUMBER_LENGTH.getValue() ; i++) {

            if(playerNumber.charAt(i)==response.getRandomNumber().charAt(i)) strike++;

            else if(response.getCheckArr()[playerNumber.charAt(i)-'0']) ball++;

            else nothing++;
        }

        return new ValidatorResponse(strike, ball, nothing);
    }

}
