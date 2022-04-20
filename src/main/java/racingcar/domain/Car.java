package racingcar.domain;

public class Car {
    private static final String POSITION_MARK = "-";
    private static final String STRING_FORMAT = "%s : %s";

    private CarName carName;
    private Position position;

    public Car(CarName name) {
        this.carName = name;
        this.position = new Position();
    }

    public String getCarNameValue() {
        return this.carName.getName();
    }

    public int getPositionValue() {
        return this.position.getPosition();
    }

    public void movePosition() {
        position.addOnePosition();
    }

    @Override
    public String toString() {
        StringBuilder distanceSb = new StringBuilder();
        for (int i = 0; i < getPositionValue(); i++) {
            distanceSb.append(POSITION_MARK);
        }

        return String.format(STRING_FORMAT, getCarNameValue(), distanceSb.toString());
    }
}
