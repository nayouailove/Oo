package lang.immutable.address;

public class RefMain1 {

    public static void main(String[] args) {

        Address a = new Address("서울");
        Address b = a; //참조값 의공유를 막을 수 있는 방법이 없다. 참조형 변수의 대입
        System.out.println(a);
        System.out.println(b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println(a); //사이드 이펙트 : a,b가 같은 인스턴스 참조해서 같이 변경됨
        System.out.println(b);
    }
}
