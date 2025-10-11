package lang.wrapper;

public class MyInteger {
    //래퍼 클래스 : 기본형을 가지고 클래스 만들기
    private final int value; //불변

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() { //숫자를 문자로 변경
        return String.valueOf(value);
    }
//래퍼클래스는 기본형의 객체 버전 : 불변, equals로 비교해야한다.
}
