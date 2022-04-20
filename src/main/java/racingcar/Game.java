package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Cars;
import racingcar.domain.Times;

public class Game {

    public void startGame() {
        Cars cars = makeCars();
        Times times = makeTimes();
        for (int i = 0; i < times.getTimes(); i++) {
            cars.tryMove();
        }

        System.out.println(cars.getRaceResult().getResult());
    }

    public Cars makeCars() {
        try {
            System.out.println("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)");
            return new Cars(Console.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Times makeTimes() {
        try {
            System.out.println("시도할 회수는 몇회인가요?");
            return new Times(Console.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
