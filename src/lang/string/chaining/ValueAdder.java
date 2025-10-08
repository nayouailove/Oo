package lang.string.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this; //자기 자신의 참조값을 반환한다.
    }

    public int getValue() {
        return value;
    }
}
