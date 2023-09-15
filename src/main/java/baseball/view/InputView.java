package baseball.view;

import baseball.controller.Game;

import java.util.Scanner;

public class InputView {

    private static String ASK_QUESTION = "숫자를 입력해주세요 : ";

    public static String ask() {

        String answer = Game.sc.next();
        System.out.print(ASK_QUESTION);

        return answer;
    }

}
