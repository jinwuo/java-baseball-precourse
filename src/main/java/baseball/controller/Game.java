package baseball.controller;

import baseball.domain.NumberFactory;
import baseball.domain.Validator;
import baseball.dto.RandomNumberResponse;
import baseball.dto.ValidatorResponse;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.Scanner;

public class Game {

    public static Scanner sc = new Scanner(System.in);

    public void start() {

        RandomNumberResponse randomNumberResponse = createRandomNumber();

        while(true) {

            String answer = InputView.ask();

            ValidatorResponse validatorResponse = Validator.validatePlayerNumber(answer,randomNumberResponse);

            if(OutputView.output(validatorResponse)) break;
        }

        askRetry();

    }

    private RandomNumberResponse createRandomNumber(){
        return NumberFactory.createRandomNumber();
    }

    public void askRetry() {

        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        if(sc.nextInt()==1){
           start();
        }

    }
}
