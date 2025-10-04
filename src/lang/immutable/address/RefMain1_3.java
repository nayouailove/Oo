package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a; //참조값 의공유를 막을 수 있는 방법이 없다. 참조형 변수의 대입
        System.out.println(a);
        System.out.println(b);

        change(b,"부산");
        System.out.println("부산 -> b");
        System.out.println(a); //사이드 이펙트 : a,b가 같은 인스턴스 참조해서 같이 변경됨
        System.out.println(b);
    }

    private static void change(Address ad, String changeAdress){
        ad.setValue(changeAdress);
    }
}
