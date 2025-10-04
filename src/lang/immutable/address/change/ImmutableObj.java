package lang.immutable.address.change;

public class ImmutableObj {

    private final int value;
    //불변객체는 내부의 값이 변하면 안된다.

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        //final이기 때문에 value+=addValue;이거 안됨
        return new ImmutableObj(result);
        //처음 설정된 value값이 10이면, addVaule는 20이었다. 그러면
        //result에 30이 저장되고 그 값을 새로운 객체에 저장한다.
        //생성한 객체를 반환한다. 그러면 참조값은 달라진 아예 새로운 애네? 그럼 걔랑 전애랑 연결이 안되는거아님?

        //한줄로 고치면 ctrl+alt+n
        //return new ImmutableObj(value+addValue);
    }

    public int getValue() {
        return value;
    }

    //final로 정의했기때문에 세터를 만들 수 없다.
}
