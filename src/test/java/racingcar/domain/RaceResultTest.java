package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RaceResultTest {

    RaceResult raceResult;

    @BeforeEach
    public void before() {
        raceResult = new RaceResult();
    }

    @Test
    public void 우승자_1명_결과문구() {
        raceResult.addWinnerCar(new Car(new CarName("소나타")));

        assertThat(raceResult.getResult()).contains("최종 우승자는 소나타 입니다.");
    }

    @Test
    public void 우승자_2명_결과문구() {
        raceResult.addWinnerCar(new Car(new CarName("소나타")));
        raceResult.addWinnerCar(new Car(new CarName("그랜저")));

        assertThat(raceResult.getResult()).contains("최종 우승자는 소나타,그랜저 입니다.");
    }

    @Test
    public void 우승자_3명_결과문구() {
        raceResult.addWinnerCar(new Car(new CarName("소나타")));
        raceResult.addWinnerCar(new Car(new CarName("그랜저")));
        raceResult.addWinnerCar(new Car(new CarName("K5")));

        assertThat(raceResult.getResult()).contains("최종 우승자는 소나타,그랜저,K5 입니다.");
    }

}