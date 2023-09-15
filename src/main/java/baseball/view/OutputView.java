package baseball.view;

import baseball.domain.NumberRule;
import baseball.domain.Validator;
import baseball.dto.ValidatorResponse;

public class OutputView {

    private static final String STRIKE = "스트라이크";

    private static final String CONGRATULATION = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    private static final String BALL = "볼";

    private static final String NOTHING = "낫싱";


    public static boolean output(ValidatorResponse validatorResponse) {

        if(validatorResponse.getStrike()== NumberRule.NUMBER_LENGTH.getValue()) {
            System.out.println(validatorResponse.getStrike()+STRIKE);
            System.out.println(CONGRATULATION);

            return true;
        }

        if(validatorResponse.getBall()>0) {
            if(validatorResponse.getStrike()>0){
                System.out.println(validatorResponse.getBall()+BALL+" "+validatorResponse.getStrike()+STRIKE);
            }
            else System.out.println(validatorResponse.getBall()+BALL);

        } else if(validatorResponse.getStrike()>0) {
            System.out.println(validatorResponse.getStrike()+STRIKE);
        } else {
            System.out.println(NOTHING);
        }

        return false;
    }

}
