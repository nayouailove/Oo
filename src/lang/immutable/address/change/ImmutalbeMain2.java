package lang.immutable.address.change;

public class ImmutalbeMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);

         obj1.add(20);
        //계산 이후에도 기존 값과 신규값모두 확인 가능
        System.out.println(obj1.getValue());

        System.out.println(obj1.getValue());
        //기존 객체의 값을 그대로 두고 대신에 변경된 결과를 새로운 객체에 담아서 반환한다.
        //기존 값이 그대로 유지된다. 

    }
}
