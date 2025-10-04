package lang.immutable.address.change;

public class MutableMain {

    public static void main(String[] args) {
        MutableObj m = new MutableObj(10);
        m.add(20);
        System.out.println(m.getValue());
        //구냥 m프린트하면 객체의 참조값만 나옴
    }
}
