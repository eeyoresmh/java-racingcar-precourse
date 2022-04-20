package racingcar.domain;

public class CarName {
    private static final int MAX_SIZE = 5;
    private String name;

    public CarName(String name) {
        String trimName = name.trim();
        isValid(trimName);
        this.name = trimName;
    }

    public void isValid(String name) {
        if (isNullOrEmpty(name)) {
            throw new IllegalArgumentException("이름이 없습니다.");
        }

        if (isGtMaxSize(name)) {
            throw new IllegalArgumentException("이름이 없습니다.");
        }
    }

    public String getName() {
        return this.name;
    }

    public boolean isNullOrEmpty(String name) {
        return name != null && !name.isEmpty() ? false : true;
    }

    public boolean isGtMaxSize(String name) {
        return name.length() > MAX_SIZE ? true : false;
    }
}
