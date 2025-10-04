package lang.immutable.address.change;

public class MutableObj {
    private int value;
    //private keyword is related capsulation of object and information hide.
    //클래스 외부에서의 직접적인 접근 차단.
    //즉, m.value불가.
    //클래스 외부에 value의 값을 노출하거나 변경하고 싶다면 public으로 선언된 메서드를 통해서만 가능
    //게터 세터를 ㅣㅇ용하는 이유!
    //개발자가 데이터를 어떻게 사용되고 변경될지 규칙 강제할 수 있다. setValue에 value에 대한 규칙을 추가하여 외부에서 잘못된 값을 설정하는 것을 막는다.
    //내부 필드의 구현이 변경되더라도 외부에서는 여전히 public메서드를 통해 접근하기때문에 외부엔 영향없음

    public MutableObj(int value){ //10
        this.value= value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void add(int addValue){ //30이 됨 -->10은 사라짐
        value += addValue;
    }


}
