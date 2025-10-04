package lang.immutable.address.change;

public class ImmutalbeMain1 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);

        ImmutableObj obj2 = obj1.add(20); //return값을 받는 부분이 있어야한다.
        //계산 이후에도 기존 값과 신규값모두 확인 가능
        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());
        System.out.println(obj1.getValue());
        //기존 객체의 값을 그대로 두고 대신에 변경된 결과를 새로운 객체에 담아서 반환한다.
        //기존 값이 그대로 유지된다.

    }
} //불변객체에서 변경과 관련된 메서드들은 보통 객체를 새로 만들어서 반환하기 때문에 꼭 반환값을 받아야한다.
