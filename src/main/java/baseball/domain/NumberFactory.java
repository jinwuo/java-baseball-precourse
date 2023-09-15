package baseball.domain;

import baseball.dto.RandomNumberResponse;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;

public class NumberFactory {

    private static boolean[] checkArr = new boolean[10];

    public static RandomNumberResponse createRandomNumber() {

        Arrays.fill(checkArr, false);

        StringBuilder randomNumBuilder = new StringBuilder();

        while (randomNumBuilder.length() < NumberRule.NUMBER_LENGTH.getValue()) {
            int random = generate();

            if (!checkArr[random]) {
                randomNumBuilder.append(random);
                checkArr[random] = true;
            }
        }

        return new RandomNumberResponse(randomNumBuilder.toString(), checkArr);
    }

    private static int generate() {
        return Randoms.pickNumberInRange(NumberRule.START_NUMBER.getValue(), NumberRule.END_NUMBER.getValue());
    }

}
