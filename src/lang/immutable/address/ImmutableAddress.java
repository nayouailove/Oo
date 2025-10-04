package lang.immutable.address;

public class ImmutableAddress {

    public final String value; //생성자에거 한번 값을 생성하면 바꾸는게 금지됨

    public ImmutableAddress(String value) {
        this.value = value; //생성자
    }



//    public void setValue(String value) {
//        this.value = value; --> 얘로 값을 변경하니까 얘 사용못하게 막는다.
//    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "value='" + value + '\'' +
                '}';
    }
}
