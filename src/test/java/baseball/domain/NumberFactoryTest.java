package baseball.domain;

import baseball.dto.RandomNumberResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class NumberFactoryTest {

    NumberFactory numberFactory = new NumberFactory();

    @DisplayName("생성된 숫자의 길이가 3인지 확인한다.")
    @Test
    void randomNumberLengthIs3() {

        // given & when
        RandomNumberResponse randomNumberResponse = numberFactory.createRandomNumber();

        // then
        assertThat(randomNumberResponse.getRandomNumber()).hasSize(3);
    }

    @DisplayName("체크배열이 제대로 생성되었는지 확인한다.")
    @Test
    void checkArrContainsRandomNumberTrue() {

        // given & when
        RandomNumberResponse randomNumberResponse = numberFactory.createRandomNumber();

        String randomNumber = randomNumberResponse.getRandomNumber();

        int first = randomNumber.charAt(0)-'0';
        int second = randomNumber.charAt(1)-'0';
        int third = randomNumber.charAt(2)-'0';

        // then
        boolean[] checkArr = randomNumberResponse.getCheckArr();

        assertThat(checkArr[first]).isTrue();
        assertThat(checkArr[second]).isTrue();
        assertThat(checkArr[third]).isTrue();

        for (int i = 0; i < 10; i++) {
            if (i != first && i != second && i != third) {
                assertThat(checkArr[i]).isFalse();
            }
        }
    }
}