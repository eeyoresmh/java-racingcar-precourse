package racingcar.domain;

public class Position {
    private static final String POSITION_MARK = "-";
    private int position;

    public Position() {
        this.position = 0;
    }

    public int getPosition() {
        return this.position;
    }

    public void addOnePosition() {
        this.position += 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.position; i++) {
            sb.append(POSITION_MARK);
        }

        return sb.toString();
    }
}
