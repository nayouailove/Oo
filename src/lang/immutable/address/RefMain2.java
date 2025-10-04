package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {

        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 의공유를 막을 수 있는 방법이 없다. 참조형 변수의 대입
        //value를 바꿀 수 없다.
        System.out.println(a);
        System.out.println(b);

//        b.setValue("부산");<--value를 바꿀 수 없게 static변수로 선언함.
                b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println(a); //사이드 이펙트 : a,b가 같은 인스턴스 참조해서 같이 변경됨
        System.out.println(b);
    }

    //불변이라는 단순한 제약을 사용해서 사이드 이펙트라는 큰 문제를 막을 수 있다.
    //객체의 공유 참조는 막을 수 없다 값을 변경하면 다른 곳에서 참조하는 변수의 값도 함께 변경되는 사이드 이펙트
    //사이드 이펙트가 발생하면 안되면 불변 객체 생성하면 된다.
    //불변객체는 값을 변경할 수 없기 때문이다.
    //새로운 객체를 생성했기 때문에 기존 변수가 참조하는 값에는 영향을 주지 않는다.

    //가변 객체 : 처음 만들고 상태 변할 수 있다 가변클래스로 객체를 생성하면 가변 객체
}
