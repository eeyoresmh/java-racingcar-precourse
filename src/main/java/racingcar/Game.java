package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Cars;
import racingcar.domain.Times;

public class Game {
    private static final String INPUT_CAR_NAMES_MESSAGE = "경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_TIMES_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String TRY_MOVE_RUN_MESSAGE = "실행 결과";

    public void startGame() {
        Cars cars = inputCarNames();
        Times times = inputTimes();

        System.out.println(TRY_MOVE_RUN_MESSAGE);
        for (int i = 0; i < times.getTimes(); i++) {
            cars.tryMove();
        }

        System.out.println(cars.getRaceResult().getResult());
    }

    public Cars inputCarNames() {
        System.out.println(INPUT_CAR_NAMES_MESSAGE);
        Cars cars;
        do {
            cars = makeCars();
        } while (cars == null);

        return cars;
    }

    public Cars makeCars() {
        try {
            return new Cars(Console.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Times inputTimes() {
        System.out.println(INPUT_TIMES_MESSAGE);
        Times times;
        do {
            times = makeTimes();
        } while (times == null);

        return times;
    }

    public Times makeTimes() {
        try {
            return new Times(Console.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
