package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RaceResult {
    private static final String RESULT_FORMAT = "최종 우승자는 %s 입니다.";
    List<Car> winnerCar;

    public RaceResult() {
        this.winnerCar = new ArrayList<>();
    }

    public void addWinnerCar(Car car) {
        this.winnerCar.add(car);
    }

    public String getResult() {
        List<String> winnerCarNames = new ArrayList<>();
        winnerCar.forEach(car -> {
            winnerCarNames.add(car.getCarNameValue());
        });

        return String.format(RESULT_FORMAT, String.join(",", winnerCarNames));
    }
}
